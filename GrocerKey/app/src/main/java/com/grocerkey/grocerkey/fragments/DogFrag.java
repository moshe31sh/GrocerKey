package com.grocerkey.grocerkey.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.grocerkey.grocerkey.R;
import com.grocerkey.grocerkey.adapters.DogAdapter;
import com.grocerkey.grocerkey.common.Dog;
import com.grocerkey.grocerkey.utiles.AppConsts;
import com.grocerkey.grocerkey.utiles.Utils;

import java.util.List;

/**
 * Created by moshe on 18-07-16.
 */

/**
 * Dog fragment  - tab no 3
 */
public class DogFrag extends Fragment {
    private View rootView;
    private RecyclerView mRecyclerView;
    private DogAdapter dogAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

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
        init();
        return rootView;
    }

    /**
     * init vars
     */
    private void init(){
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recycle_view_dog_id);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        List<Dog> dogList = Utils.createDogList(AppConsts.dogsName);
        dogAdapter = new DogAdapter(dogList);
        mRecyclerView.setAdapter(dogAdapter);
    }

}
