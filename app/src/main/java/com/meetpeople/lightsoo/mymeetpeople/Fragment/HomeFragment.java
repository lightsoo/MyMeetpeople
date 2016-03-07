package com.meetpeople.lightsoo.mymeetpeople.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.meetpeople.lightsoo.mymeetpeople.R;

/**
 * Created by LG on 2016-03-07.
 */
public class HomeFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container, false);
        return view;
    }
}
