package com.meetpeople.lightsoo.mymeetpeople.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.meetpeople.lightsoo.mymeetpeople.Listener.DoubleClickListener;
import com.meetpeople.lightsoo.mymeetpeople.R;

/**
 * Created by LG on 2016-03-07.
 */
public class HomeFragmentContent extends Fragment {
    public static final String ARGS_CONTENT = "content";
    RelativeLayout content_layout2;

    public static HomeFragmentContent newIntance(String content){
        HomeFragmentContent fragment = new HomeFragmentContent();
        Bundle b = new Bundle();
        b.putString(ARGS_CONTENT, content);
        fragment.setArguments(b);
        return fragment;
    }

    String mContent;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arg = getArguments();
        if(arg != null){
            mContent = arg.getString(ARGS_CONTENT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_content, container, false);
        TextView tv = (TextView)view.findViewById(R.id.tv_frag);
        content_layout2 =(RelativeLayout)view.findViewById(R.id.content_layout2);

        content_layout2.setOnClickListener(new DoubleClickListener() {
            @Override
            public void onDoubleClick() {
                Toast.makeText(getActivity(), mContent + " : 클릭!!", Toast.LENGTH_SHORT).show();
                //문자 메시지 보내는 액티비티 이동
//                Intent intent = new Intent(getActivity(), SendMessageActivity.class);
//                startActivity(intent);
            }
        });

        //여기서 page의 내용을 수정
        tv.setText(mContent);
        return view;
    }

}
