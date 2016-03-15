package com.meetpeople.lightsoo.mymeetpeople.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.meetpeople.lightsoo.mymeetpeople.CommonAdapter.HomeAdapter;
import com.meetpeople.lightsoo.mymeetpeople.R;

/**
 * Created by LG on 2016-03-07.
 */
public class HomeFragment extends Fragment{
    private HomeAdapter homeAdapter;
    private ViewPager pager;

//    public HomeFragment() {
//        // Required empty public constructor
//        setHasOptionsMenu(true);
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container, false);
        pager = (ViewPager)view.findViewById(R.id.pager);
        //pager에 패딩을 줄지말지
        pager.setClipToPadding(false);
        //페이지간 마진을 얼마나 줄지
        //pager.setPageMargin(getResources().getDimensionPixelSize());
        //페이지에 어댑터설정!!!이걸 안하면 안보여...
        //nested fragment라서 getChildFragmnt로 써야된다!!!
//        homeAdapter = new HomeAdapter(getActivity().getSupportFragmentManager());
        homeAdapter = new HomeAdapter(getChildFragmentManager());

        pager.setAdapter(homeAdapter);
        //현재위치 조정
        pager.setCurrentItem(3);
        return view;
    }
}