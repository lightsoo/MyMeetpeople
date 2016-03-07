package com.meetpeople.lightsoo.mymeetpeople.CommonAdapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.meetpeople.lightsoo.mymeetpeople.Fragment.ChatFragment;
import com.meetpeople.lightsoo.mymeetpeople.Fragment.HomeFragment;
import com.meetpeople.lightsoo.mymeetpeople.Fragment.MyinfoFragment;
import com.meetpeople.lightsoo.mymeetpeople.Fragment.WriteFragment;

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
            case 0 : fragmentClass = HomeFragment.class;
                break;
            case 1 : fragmentClass = ChatFragment.class;
                break;
            case 2 : fragmentClass = MyinfoFragment.class;
                break;
            //여기서 프레그먼트 생성안하고 바고 인텐트호출이 될것도 같다...
            case 3 : fragmentClass = WriteFragment.class;
                break;
            default:
                //첫화면을 MainActivity에서 설정 할수있는데, 안된다면 여기서 설정!
        }

        try {
            resultFragement = (Fragment)fragmentClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return resultFragement;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
