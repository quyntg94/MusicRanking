package quyntg.vn.lab2_musicranking;

import android.support.v4.app.Fragment;

/**
 * Created by giaqu on 11/30/2016.
 */

public class FragmentEvent {
    private Fragment fragment;
    private boolean addToBackStack;

    public FragmentEvent(Fragment fragment, boolean addToBackStack) {
        this.fragment = fragment;
        this.addToBackStack = addToBackStack;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public boolean isAddToBackStack() {
        return addToBackStack;
    }
}
