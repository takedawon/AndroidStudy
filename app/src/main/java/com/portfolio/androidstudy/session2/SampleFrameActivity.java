package com.portfolio.androidstudy.session2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.portfolio.androidstudy.R;

public class SampleFrameActivity extends AppCompatActivity {
    int imageIndex= 0;
    ImageView imageView;
    ImageView imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_frame);
        imageView=findViewById(R.id.imageView);
        imageView2=findViewById(R.id.imageView2);

    }

    public void onButton1Clicked(View v) {
        changeImage();
    }

    private void changeImage() {
        if(imageIndex == 0) {
            imageView.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageIndex=1;
        } else if(imageIndex==1) {
            imageView.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);
            imageIndex=0;
        }
    }
}
