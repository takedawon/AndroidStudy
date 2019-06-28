package com.portfolio.androidstudy.session2;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.portfolio.androidstudy.R;

public class SampleScrollActivity extends AppCompatActivity {
    ScrollView scrollView;
    ImageView imgView;
    BitmapDrawable bitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_scroll);
        scrollView=findViewById(R.id.scrollView);
        imgView=findViewById(R.id.imageView3);
        scrollView.setHorizontalScrollBarEnabled(true);

        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.daram);
        int bitmapWidth=bitmap.getIntrinsicWidth();
        int bitmapHeight=bitmap.getIntrinsicHeight();

        imgView.setImageDrawable(bitmap);
        imgView.getLayoutParams().width=bitmapWidth;
        imgView.getLayoutParams().height=bitmapHeight;
    }

    public void onButton1Clicked(View v) {
        changeImage();
    }

    private void changeImage() {
        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.zaka);
        int bitmapWidth=bitmap.getIntrinsicWidth();
        int bitmapHeight=bitmap.getIntrinsicHeight();
        imgView.setImageDrawable(bitmap);
        imgView.getLayoutParams().width=bitmapWidth;
        imgView.getLayoutParams().height=bitmapHeight;
    }
}
