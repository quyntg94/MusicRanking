package quyntg.vn.lab2_musicranking.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import quyntg.vn.lab2_musicranking.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TopsongsFragment extends Fragment {


    public TopsongsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_topsongs, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        return view;
    }

}
