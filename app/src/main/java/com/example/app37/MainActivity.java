package com.example.app37;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Gallery gallery;

    LinearLayout linearLayoutHorizontal;
    ImageView imgAnimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        gallery = findViewById(R.id.gallery);
        imgAnimal = findViewById(R.id.imgAnimal);

        linearLayoutHorizontal = findViewById(R.id.linearLayoutHorizontal);


        GallaryAdapter gallaryAdapter =new GallaryAdapter(MainActivity.this);

        gallery.setAdapter(gallaryAdapter);

        for(int index = 0; index < Animal.animalImages.length; index++ ){
            final int i = index;
            ImageView imageView = new ImageView(MainActivity.this);
            imageView.setImageResource(Animal.animalImages[index]);
            letsSetLayoutParamsForImageView(imageView);
            imageView.setPadding(100,100,100,100);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imgAnimal.setImageResource(Animal.animalImages[i]);
                    letsSetLayoutParamsForImageView(imgAnimal);
                    Toast.makeText(MainActivity.this, "this is:" +
                            Animal.animalName[i],Toast.LENGTH_SHORT).show();
                }
            });
            linearLayoutHorizontal.addView(imageView);
        }
    }

    public void letsSetLayoutParamsForImageView(ImageView imageView){
        imageView.setLayoutParams(new LinearLayout.LayoutParams(1000, 1000));
    }
}
