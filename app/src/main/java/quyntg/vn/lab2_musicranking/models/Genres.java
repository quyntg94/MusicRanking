package quyntg.vn.lab2_musicranking.models;

import java.util.ArrayList;
import java.util.List;

import io.realm.RealmObject;

/**
 * Created by giaqu on 11/29/2016.
 */

public class Genres extends RealmObject{

    public String title;
    public int imageId;

    public Genres(){

    }
    public Genres(String title, int imageId) {
        this.title = title;
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public static List<Genres> GENRES_LIST = new ArrayList<>();

    @Override
    public String toString() {
        return "Genres{" +
                "title='" + title + '\'' +
                ", imageId=" + imageId +
                '}';
    }
}
