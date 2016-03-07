package com.meetpeople.lightsoo.mymeetpeople.CommonAdapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by LG on 2016-03-07.
 */
public class TabAdapter extends FragmentStatePagerAdapter{

    public TabAdapter(FragmentManager fm){super(fm);}


    @Override
    public Fragment getItem(int position) {
        Fragment resultFragement = null;
        Class fragmentClass = null;
        switch (position){
            case 0 :
                break;
            case 1 :
                break;
            case 2 :
                break;
            case 3 :
                //여기서 프레그먼트 생성안하고 바고 인텐트호출이 될것도 같다...
                break;
            default:
                fragmentClass = ()
        }
        return resultFragement;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
