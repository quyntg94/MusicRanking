package quyntg.vn.lab2_musicranking.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import quyntg.vn.lab2_musicranking.R;
import quyntg.vn.lab2_musicranking.adapters.GenresAdapter;
import quyntg.vn.lab2_musicranking.managers.DBContext;
import quyntg.vn.lab2_musicranking.models.Genres;
import quyntg.vn.lab2_musicranking.models.Media;
import quyntg.vn.lab2_musicranking.services.ServiceFactory;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.GsonConverterFactory;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * A simple {@link Fragment} subclass.
 */
public class GenresFragment extends Fragment {

    @BindView(R.id.rv_genres)
    RecyclerView rv_genres;

    List<Media> mediaList;
    List<Media.Subgenres> mediaModels;
    GenresAdapter genresAdapter;

    public GenresFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_genres, container, false);
        ButterKnife.bind(this, view);
        DBContext.init(getContext());
        setupUI(view);
        getData();
        return view;
    }

    private void setupUI(View view) {
        genresAdapter = new GenresAdapter();
        GridLayoutManager gridLayoutManager = (new GridLayoutManager(getContext(), 2, GridLayoutManager.VERTICAL, false));
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup(){
            public int getSpanSize(int position){
                return (position % 3 == 0 ? 2 : 1);
            }
        });
        rv_genres.setLayoutManager(gridLayoutManager);

        genresAdapter.notifyDataSetChanged();
        rv_genres.setAdapter(genresAdapter);

    }

    public void getData() {
        Retrofit retrofit = new Retrofit
                .Builder()
                .baseUrl("https://rss.itunes.apple.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ServiceFactory service = retrofit.create(ServiceFactory.class);
        service.result().enqueue(new Callback<List<Media>>() {
            @Override
            public void onResponse(Call<List<Media>> call, Response<List<Media>> response) {
                mediaList = response.body();
                for (Media media : mediaList) {
                    if (media.getId().equals("34")) {
                        for (Media.Subgenres subgenres : media.getSubgenres()) {
                            if (subgenres.getId().equals("")) {
                                subgenres.setId("0");
                            }
                            int id = getContext().getResources().getIdentifier("genre_" + subgenres.getId() +"_3x", "drawable", getContext().getPackageName());
                            Genres.GENRES_LIST.add(new Genres(subgenres.getTranslation_key(), id));
                            // Save media type to Realm
                            //Log.d(TAG, String.format("%s %s", subgenre.getTranslation_key(), id));
                        }
                        System.out.println(String.format("ADD %s", Genres.GENRES_LIST.size()));
                        DBContext.getInstance().addList(Genres.GENRES_LIST);
                    }
                }
                genresAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<Media>> call, Throwable t) {

            }
        });

    }
}
