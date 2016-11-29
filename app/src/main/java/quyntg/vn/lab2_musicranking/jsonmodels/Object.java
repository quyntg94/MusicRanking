package quyntg.vn.lab2_musicranking.jsonmodels;

/**
 * Created by giaqu on 11/28/2016.
 */

public class Object {

    private int id;
    private String store;

    public Object(int id, String store) {
        this.id = id;
        this.store = store;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return "Object{" +
                "id=" + id +
                ", store='" + store + '\'' +
                '}';
    }
}
