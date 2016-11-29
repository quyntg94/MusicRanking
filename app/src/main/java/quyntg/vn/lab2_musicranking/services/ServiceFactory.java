package quyntg.vn.lab2_musicranking.services;

import java.util.List;

import quyntg.vn.lab2_musicranking.models.Media;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by giaqu on 11/28/2016.
 */

public interface ServiceFactory {

    @GET("/data/media-types.json")
    Call<List<Media>> result();
}
