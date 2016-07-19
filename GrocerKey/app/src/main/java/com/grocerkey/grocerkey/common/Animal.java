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
    Bitmap animalPic;

    /**
     * Default Ctor
     */
    public Animal() {
    }

    /**
     * Ctor
     * @param name - animal name
     * @param animalPic - animal pic
     */
    public Animal(String name , Bitmap animalPic){
        setName(name);
        setAnimalPic(animalPic);
    }

    public Animal(String name){
        setName(name);
        setAnimalPic(null);
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

    /**
     * Animal pic getter
     * @return animal pic in bitmap format
     */
    public Bitmap getAnimalPic() {
        return animalPic;
    }

    /**
     * Animal pic setter
     * @param animalPic - animal pic bitmap format
     */
    public void setAnimalPic(Bitmap animalPic) {
        this.animalPic = animalPic;
    }
}
