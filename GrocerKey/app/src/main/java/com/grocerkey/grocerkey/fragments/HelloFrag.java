package com.grocerkey.grocerkey.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.grocerkey.grocerkey.R;
import com.grocerkey.grocerkey.utiles.AppConsts;

/**
 * Created by moshe on 18-07-16.
 */

/**
 * Hello World fragment  - tab no 1
 */

public class HelloFrag extends Fragment {
    TextView TvHello;
    View rootView;
    public HelloFrag(){

    }

    /**
     * Create fragment instance
     * @return - fragment
     */
    public static HelloFrag newInstance() {
        HelloFrag helloFreg = new HelloFrag();
        return helloFreg;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_hello, container, false);
        init();
        return rootView;
    }

    /**
     * This method is init vars
     */
    public void init(){
        this.TvHello = (TextView) rootView.findViewById(R.id.hello_world_id);
        this.TvHello.setText(AppConsts.helloWorld);
    }

}
