package com.grocerkey.grocerkey.common;

/**
 * Created by moshe on 19-07-16.
 */


import android.graphics.Bitmap;

/**
 * This class is Animal abstract class
 */
public abstract class Animal {
    String name;

    /**
     * Default Ctor
     */
    public Animal() {
    }

    public Animal(String name){
        setName(name);
    }

    /**
     * Animal name getter
     * @return animal name
     */
    public String getName() {
        return name;
    }

    /**
     * Animal name setter
     * @param name - animal name
     */
    public void setName(String name) {
        this.name = name;
    }


}
