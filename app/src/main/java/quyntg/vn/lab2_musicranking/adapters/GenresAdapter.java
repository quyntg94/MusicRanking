package quyntg.vn.lab2_musicranking.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import quyntg.vn.lab2_musicranking.R;
import quyntg.vn.lab2_musicranking.models.Genres;
import quyntg.vn.lab2_musicranking.viewholders.GenresViewholder;

/**
 * Created by giaqu on 11/29/2016.
 */

public class GenresAdapter extends RecyclerView.Adapter<GenresViewholder> {

    private View.OnClickListener onItemClickListener;

    public void setOnItemClickListener(View.OnClickListener onClickListener){
        this.onItemClickListener = onClickListener;

    }
    @Override
    public GenresViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView =  layoutInflater.inflate(R.layout.item_genres, parent, false);
//        itemView.setOnClickListener(onItemClickListener);
        GenresViewholder genresViewholder = new GenresViewholder(itemView);
        return genresViewholder;
    }

    @Override
    public void onBindViewHolder(GenresViewholder holder,int position) {
        Genres genres = Genres.GENRES_LIST.get(position);
        holder.view(genres);
        holder.itemView.setOnClickListener(onItemClickListener);
//        holder.setData(genres);

    }

    @Override
    public int getItemCount() {
        return Genres.GENRES_LIST.size();
    }

}
