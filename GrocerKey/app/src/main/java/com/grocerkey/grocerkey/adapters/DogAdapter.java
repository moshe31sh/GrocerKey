package com.grocerkey.grocerkey.adapters;

import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.grocerkey.grocerkey.R;
import com.grocerkey.grocerkey.common.Dog;

import java.util.List;

/**
 * Created by moshe on 19-07-16.
 */

/**
 * recycle view adapter
 */
public class DogAdapter  extends RecyclerView.Adapter<DogAdapter.ViewHolder>{
    private List<Dog> dogs;

    /**
     * Ctor
     * @param list - list of object to add
     */
    public DogAdapter(List<Dog> list){
        this.dogs = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_dog,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
    Dog dog = dogs.get(position);
        holder.tvDogName.setText(dog.getName());
    }

    @Override
    public int getItemCount() {
        return dogs.size();
    }



    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvDogName;
        private ImageView ivDog;

        public ViewHolder(View itemView) {
            super(itemView);
            tvDogName = (TextView) itemView.findViewById(R.id.id_dog_name);
            ivDog = (ImageView)itemView.findViewById(R.id.id_dog_img);
        }
    }
}
