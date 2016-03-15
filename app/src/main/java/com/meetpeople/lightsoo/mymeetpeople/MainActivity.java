package com.meetpeople.lightsoo.mymeetpeople;

import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.meetpeople.lightsoo.mymeetpeople.Dialog.FilterDialogFragment;
import com.meetpeople.lightsoo.mymeetpeople.Fragment.ChatFragment;
import com.meetpeople.lightsoo.mymeetpeople.Fragment.HomeFragment;
import com.meetpeople.lightsoo.mymeetpeople.Fragment.MyinfoFragment;
import com.meetpeople.lightsoo.mymeetpeople.Fragment.WriteFragment;

public class MainActivity extends AppCompatActivity {

    FragmentTabHost tabHost;
    ImageButton btn_filter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);
        //false해서 기존 title을 없애
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        //밑에꺼 안쓰고 툴바를 framelayout에 넣어서 layout_gravity = center줘서 가운데로 오게햇어
//        TextView toolbarTitle = (TextView)toolbar.findViewById(R.id.toolbar_main);

        tabHost = (FragmentTabHost)findViewById(R.id.tabhost);
        tabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
        //setIndicator(View)를 넣어서 seletor
        View home = LayoutInflater.from(MainActivity.this).inflate(R.layout.tab_home_btn, null);
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator(home), HomeFragment.class, null);

        View chat = LayoutInflater.from(MainActivity.this).inflate(R.layout.tab_chat_btn, null);
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator(chat), ChatFragment.class, null);

        View myinfo = LayoutInflater.from(MainActivity.this).inflate(R.layout.tab_myinfo_btn, null);
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator(myinfo), MyinfoFragment.class, null);

        View write = LayoutInflater.from(MainActivity.this).inflate(R.layout.tab_write_btn, null);
        tabHost.addTab(tabHost.newTabSpec("tab4").setIndicator(write), WriteFragment.class, null);
        tabHost.setCurrentTab(0);

        btn_filter = (ImageButton)toolbar.findViewById(R.id.btn_check);
        btn_filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onFilterDialog(v);
            }
        });

    }

    public void onFilterDialog(View view){
        FilterDialogFragment dialog = new FilterDialogFragment();
        dialog.show(getSupportFragmentManager(),"filter");
    }

}
