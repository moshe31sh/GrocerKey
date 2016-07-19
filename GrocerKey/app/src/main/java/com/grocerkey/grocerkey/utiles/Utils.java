package com.grocerkey.grocerkey.utiles;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.grocerkey.grocerkey.common.Dog;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by moshe on 19-07-16.
 */

/**
 * This class is for function , logic ,etc
 */
public final class Utils {

    /**
     * Download pic from web
     * @param url - image url
     * @return bitmap
     */
    public static Bitmap download_Image(String url) {
        Bitmap bmp =null;
        try{
            URL ulrn = new URL(url);
            HttpURLConnection con = (HttpURLConnection)ulrn.openConnection();
            InputStream is = con.getInputStream();
            bmp = BitmapFactory.decodeStream(is);
            if (null != bmp)
                return bmp;

        }catch(Exception e){}
        return bmp;
    }

    public static List<Dog> createDogList(String [] nameList){
        List<Dog> dogsList = new ArrayList<Dog>(nameList.length);
        for(int i = 0 ; i < nameList.length ; i++){
            dogsList.add(new Dog(nameList[i]));
        }
        return dogsList;
    }

}
