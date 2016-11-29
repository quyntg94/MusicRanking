package quyntg.vn.lab2_musicranking.models;

import java.util.ArrayList;

/**
 * Created by giaqu on 11/29/2016.
 */

public class Media {

    private String id;

    Media(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Subgenres> subgenres;

    public ArrayList<Subgenres> getSubgenres() {
        return subgenres;
    }

    public void setSubgenres(ArrayList<Subgenres> subgenres) {
        this.subgenres = subgenres;
    }

    public class Subgenres{
        String id;
        String translation_key;

        public Subgenres(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTranslation_key() {
            return translation_key;
        }

        public void setTranslation_key(String translation_key) {
            this.translation_key = translation_key;
        }
    }


}
