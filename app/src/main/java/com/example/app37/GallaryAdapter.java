package com.example.app37;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

import java.nio.channels.GatheringByteChannel;

public class GallaryAdapter extends BaseAdapter {

    Context context;

    public GallaryAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return Animal.animalImages.length;
    }

    @Override
    public Object getItem(int i) {
        return Animal.animalImages[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ImageView imageView = new ImageView(context);
        imageView.setImageResource(Animal.animalImages[i]);
        imageView.setLayoutParams(new Gallery.LayoutParams(1000, 1000));
        imageView.setPadding(100,100,100,100);


        return imageView;
    }
}
