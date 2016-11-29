package quyntg.vn.lab2_musicranking.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import quyntg.vn.lab2_musicranking.R;
import quyntg.vn.lab2_musicranking.models.Genres;

/**
 * Created by giaqu on 11/29/2016.
 */

public class GenresViewholder extends RecyclerView.ViewHolder {

    @BindView(R.id.iv_genres)
    ImageView iv_genres;
    @BindView(R.id.tv_genres)
    TextView tv_genres;

    public GenresViewholder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void view (Genres genres){
        iv_genres.setImageResource(genres.getImageId());
        tv_genres.setText(genres.getTitle());
    }
}
