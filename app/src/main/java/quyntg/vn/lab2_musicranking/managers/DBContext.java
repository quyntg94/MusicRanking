package quyntg.vn.lab2_musicranking.managers;

import android.content.Context;

import java.util.List;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmObject;
import io.realm.RealmResults;
import quyntg.vn.lab2_musicranking.models.Genres;

/**
 * Created by giaqu on 11/29/2016.
 */

public class DBContext {

    public Realm realm;
    public static DBContext instance;

    public DBContext(Context context){
        RealmConfiguration config = new RealmConfiguration.Builder(context).build();

        Realm.setDefaultConfiguration(config);
        realm = Realm.getDefaultInstance();
    }

    public static void init(Context context){
        if(instance == null){
            instance = new DBContext(context);
        }
    }

    public static DBContext getInstance() {
        return instance;
    }

    public void addGenres(Genres genres){
        // getRealm
        Realm realm = Realm.getDefaultInstance();
        //Add object to Realm
        realm.beginTransaction();
        realm.copyToRealm(genres);
        realm.commitTransaction();
    }

    public List<Genres> getAllGenres(){
        //2 get Real default
        Realm realm = Realm.getDefaultInstance();

        //4
        RealmResults<Genres> genres = realm
                .where(Genres.class)
                .findAll();
        return genres;
    }

    public void  addList(List<Genres> genresList){
        //delete old
        deleteAllItem(Genres.class);

        //update
        Realm realm = Realm.getDefaultInstance();
        for (Genres genres : genresList) {
            //Add object to Realm
            realm.beginTransaction();
            realm.copyToRealm(genres);
            realm.commitTransaction();
        }
    }

    private void deleteAllItem (Class<? extends RealmObject> clazz){
        Realm realm = Realm.getDefaultInstance();
        realm.beginTransaction();
        realm.delete(clazz);
        realm.commitTransaction();
    }
}
