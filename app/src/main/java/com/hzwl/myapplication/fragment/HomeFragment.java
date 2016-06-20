package com.hzwl.myapplication.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.hzwl.myapplication.R;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;


/**
 * A simple {@link Fragment} subclass.
 */
@ContentView(R.layout.fragment_home)
public class HomeFragment extends BaseFragment implements View.OnClickListener {
    @ViewInject(R.id.btn)
    private Button btn;

    public HomeFragment() {
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }


    @Override
    public void onInitEvent() {
        super.onInitEvent();
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getActivity(),"HelloWorld",Toast.LENGTH_SHORT).show();
    }
}
