package quyntg.vn.lab2_musicranking.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import quyntg.vn.lab2_musicranking.R;
import quyntg.vn.lab2_musicranking.models.Song;
import quyntg.vn.lab2_musicranking.viewholders.SongViewHolder;

/**
 * Created by giaqu on 11/30/2016.
 */

public class SongAdapter extends RecyclerView.Adapter<SongViewHolder> {
    @Override
    public SongViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView =  layoutInflater.inflate(R.layout.item_song, parent, false);
        SongViewHolder songViewHolder = new SongViewHolder(itemView);
        return songViewHolder;
    }

    @Override
    public void onBindViewHolder(SongViewHolder holder, int position) {
        Song song = Song.SONG_LIST.get(position);
        holder.bind(song);
    }

    @Override
    public int getItemCount() {
        return Song.SONG_LIST.size();
    }

}
