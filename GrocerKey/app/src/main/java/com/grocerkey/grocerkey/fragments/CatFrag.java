package com.grocerkey.grocerkey.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.grocerkey.grocerkey.R;

/**
 * Created by moshe on 18-07-16.
 */

/**
 * cat fragment  - tab no 2
 */
public class CatFrag extends Fragment {
    View rootView;


    /**
     * Create fragment instance
     * @return - fragment
     */
    public static CatFrag newInstance() {
        CatFrag catFrag = new CatFrag();
        return catFrag;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_cat, container, false);
        return rootView;
    }
}
