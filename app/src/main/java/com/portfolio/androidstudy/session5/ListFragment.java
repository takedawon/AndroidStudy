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

import com.portfolio.androidstudy.R;

public class ListFragment extends Fragment {

    public static interface ImageSelectionCallback {
        public void onImageSelected(int position);
    }

    public ImageSelectionCallback callback;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if(context instanceof ImageSelectionCallback) {
            callback=(ImageSelectionCallback) context;
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_list,container,false);
        Button button=root.findViewById(R.id.button64);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(callback != null) {
                    callback.onImageSelected(0);
                }
            }
        });

        Button button2 = root.findViewById(R.id.button65);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(callback != null) {
                    callback.onImageSelected(1);
                }
            }
        });

        Button button3 = root.findViewById(R.id.button66);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(callback != null) {
                    callback.onImageSelected(2);
                }
            }
        });

        return root;
    }
}
