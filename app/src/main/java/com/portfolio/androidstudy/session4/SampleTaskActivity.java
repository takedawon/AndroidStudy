package com.portfolio.androidstudy.session4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.portfolio.androidstudy.R;

public class SampleTaskActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_task);
        button = findViewById(R.id.button44);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), SampleTaskActivity.class);
                        startActivity(intent);
                    }
                }
        );

    }
}
