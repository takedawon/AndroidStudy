package com.portfolio.androidstudy.session5;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.portfolio.androidstudy.R;

public class MenuFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup)inflater.inflate(R.layout.fragment_menu,container,false);

        final Button button = root.findViewById(R.id.button61);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SampleFragmentActivity activity = (SampleFragmentActivity)getActivity();
                activity.onFragmentChanged(1);
            }
        });

        return root;
    }
}
