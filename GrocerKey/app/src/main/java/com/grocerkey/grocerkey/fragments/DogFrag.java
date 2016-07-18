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
 * Dog fragment  - tab no 3
 */
public class DogFrag extends Fragment {
    View rootView;


    /**
     * Create fragment instance
     * @return - fragment
     */
    public static DogFrag newInstance() {
        DogFrag dogFrag = new DogFrag();
        return dogFrag;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_dog, container, false);
        return rootView;
    }

}
