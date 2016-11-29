package quyntg.vn.lab2_musicranking.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import quyntg.vn.lab2_musicranking.fragments.GenresFragment;
import quyntg.vn.lab2_musicranking.fragments.OfflineFragment;
import quyntg.vn.lab2_musicranking.fragments.PlaylistFragment;

/**
 * Created by giaqu on 11/26/2016.
 */

public class PageAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PageAdapter(FragmentManager fragmentManager, int NumOfTabs) {
        super(fragmentManager);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                GenresFragment genresFragment = new GenresFragment();
                return genresFragment;
            case 1:
                PlaylistFragment playlistFragment = new PlaylistFragment();
                return playlistFragment;
            case 2:
                OfflineFragment offlineFragment = new OfflineFragment();
                return offlineFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
