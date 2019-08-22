package com.portfolio.androidstudy.session5;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.portfolio.androidstudy.R;

public class ViewerFragment extends Fragment {
    ImageView imageView;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_viewer,container,false);

        imageView = root.findViewById(R.id.imageView7);

        return root;
    }

    public void setImage(int resId) {
        imageView.setImageResource(resId);
    }
}
