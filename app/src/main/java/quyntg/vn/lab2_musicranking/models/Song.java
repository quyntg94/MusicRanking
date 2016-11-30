package quyntg.vn.lab2_musicranking.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by giaqu on 11/30/2016.
 */

public class Song {

    private int imageId;
    private String songName;
    private String singerName;

    public Song(int imageId, String songName, String singerName) {
        this.imageId = imageId;
        this.songName = songName;
        this.singerName = singerName;
    }

    Song(){

    }



    public int getIdImage() {
        return imageId;
    }

    public void setIdImage(int idImage) {
        this.imageId = idImage;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public static final List<Song> SONG_LIST = new ArrayList<>();
}
