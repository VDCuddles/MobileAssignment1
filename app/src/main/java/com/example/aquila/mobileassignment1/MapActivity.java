package com.example.aquila.mobileassignment1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import static com.example.aquila.mobileassignment1.R.drawable.albmap1;
import static com.example.aquila.mobileassignment1.R.drawable.albmap2;
import static com.example.aquila.mobileassignment1.R.drawable.waitmap1;

//this activity is for the maps page

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

    }
    public void setPage1 (View aView){
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(albmap1);

    }
    public void setPage2 (View aView){
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(albmap2);

    }
    public void setPage3 (View aView){
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(waitmap1);

    }


}
