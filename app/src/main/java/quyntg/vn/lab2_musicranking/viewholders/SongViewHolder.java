package quyntg.vn.lab2_musicranking.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import quyntg.vn.lab2_musicranking.R;
import quyntg.vn.lab2_musicranking.models.Song;

/**
 * Created by giaqu on 11/30/2016.
 */

public class SongViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    @BindView(R.id.iv_song)
    ImageView iv_song;
    @BindView(R.id.tv_song_name)
    TextView tv_song_name;
    @BindView(R.id.tv_song_singer)
    TextView tv_song_singer;

    public SongViewHolder(View itemView) {
        super(itemView);
    }

    public void bind(Song song){
        iv_song.setImageResource(song.getIdImage());
        tv_song_name.setText(song.getSongName());
        tv_song_singer.setText(song.getSingerName());
    }

    @Override
    public void onClick(View v) {

    }
}
