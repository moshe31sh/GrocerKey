package com.grocerkey.grocerkey.utiles;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by moshe on 19-07-16.
 */

/**
 * This class is for function , logic ,etc
 */
public final class Utiles {

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
}
