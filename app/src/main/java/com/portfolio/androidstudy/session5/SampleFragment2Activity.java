package com.portfolio.androidstudy.session5;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.portfolio.androidstudy.R;

public class SampleFragment2Activity extends AppCompatActivity
implements ListFragment.ImageSelectionCallback {
    ListFragment listFragment;
    ViewerFragment viewerFragment;

    int[] images = {R.drawable.daram, R.drawable.daram2, R.drawable.daram3};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_fragment2);

        FragmentManager manager = getSupportFragmentManager();
        listFragment=(ListFragment)manager.findFragmentById(R.id.listFragment);
        viewerFragment = (ViewerFragment)manager.findFragmentById(R.id.viewerFragment);
    }

    @Override
    public void onImageSelected(int position) {
        viewerFragment.setImage(images[position]);
    }
}
