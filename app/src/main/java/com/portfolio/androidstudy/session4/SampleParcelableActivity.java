package com.portfolio.androidstudy.session4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.portfolio.androidstudy.R;

public class SampleParcelableActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_MENU = 101;
    public static final String KEY_SIMPLE_DATA="data";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_parcelable);
        Button button=findViewById(R.id.button39);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SampleParcelableMenuActivity.class);
                SimpleData data = new SimpleData(100,"Hello Android! by.dawon");
                intent.putExtra(KEY_SIMPLE_DATA,data);
                startActivityForResult(intent, REQUEST_CODE_MENU);

            }
        });
    }
}
