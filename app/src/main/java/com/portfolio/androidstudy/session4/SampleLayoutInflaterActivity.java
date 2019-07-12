package com.portfolio.androidstudy.session4;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.portfolio.androidstudy.R;

public class SampleLayoutInflaterActivity extends AppCompatActivity {
    LinearLayout container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_layout_inflater);
        container=findViewById(R.id.container2);

        Button button=findViewById(R.id.button40);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater=(LayoutInflater)
                        getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                inflater.inflate(R.layout.sub1,container,true);
                CheckBox checkBox = container.findViewById(R.id.checkBox2);
                checkBox.setText("로딩되었어요");
            }
        });
    }
}
