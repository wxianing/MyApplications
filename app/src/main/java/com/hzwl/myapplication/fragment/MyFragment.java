package com.hzwl.myapplication.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

import com.hzwl.myapplication.R;

import org.xutils.view.annotation.ContentView;

/**
 * A simple {@link Fragment} subclass.
 */
@ContentView(R.layout.fragment_my)
public class MyFragment extends BaseFragment {

    public MyFragment() {
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}
