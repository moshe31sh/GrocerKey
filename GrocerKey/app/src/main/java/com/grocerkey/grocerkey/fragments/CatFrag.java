package com.grocerkey.grocerkey.fragments;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.grocerkey.grocerkey.R;
import com.grocerkey.grocerkey.utiles.AppConsts;
import com.grocerkey.grocerkey.utiles.DownloadImageTask;


/**
 * Created by moshe on 18-07-16.
 */

/**
 * cat fragment  - tab no 2
 */
public class CatFrag extends Fragment {
    private View rootView;
    private TextView tvKitten;
    private ImageView ivCat;

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
        init();
        return rootView;
    }

    /**
     * This method init vars
     */
    public void init(){
        this.tvKitten = (TextView) rootView.findViewById(R.id.cat_text_id);
        this.ivCat = (ImageView) rootView.findViewById(R.id.cat_image_view_id);
        this.tvKitten.setText(AppConsts.cuteKitten);
        new DownloadImageTask(ivCat).execute(AppConsts.catPicUrl);

    }

//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        this.cat = new Cat();
//       // Bitmap bitmap = null;
//    }
}
