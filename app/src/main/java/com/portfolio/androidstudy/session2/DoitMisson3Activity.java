package com.portfolio.androidstudy.session2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.QuickContactBadge;

import com.portfolio.androidstudy.R;

public class DoitMisson3Activity extends AppCompatActivity {
    Button btnUp;
    Button btnDown;
    ImageView img_up;
    ImageView img_down;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doit_misson3);
        btnUp=findViewById(R.id.btn_up);
        btnDown=findViewById(R.id.btn_down);

        img_up=findViewById(R.id.imageView5);
        img_down=findViewById(R.id.imageView6);

        btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_down.setVisibility(View.INVISIBLE);
                img_up.setBackgroundResource(R.drawable.zaka);
                img_up.setVisibility(View.VISIBLE);
            }
        });

        btnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_up.setVisibility(View.INVISIBLE);
                img_down.setBackgroundResource(R.drawable.zaka);
                img_down.setVisibility(View.VISIBLE);
            }
        });
    }
}
