package com.portfolio.androidstudy.session4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.portfolio.androidstudy.R;

public class DoItMission7MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_do_it_mission7_menu);

        final Button button1 = findViewById(R.id.button46);
        final Button button2 = findViewById(R.id.button48);
        final Button button3 = findViewById(R.id.button49);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.putExtra("name", button1.getText().toString());
                setResult(3000,intent);
                finish();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           Intent intent=new Intent();
                                           intent.putExtra("name", button2.getText().toString());
                                           setResult(5000,intent);
                                           finish();
                                       }
                                   }
        );

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.putExtra("name", button3.getText().toString());
                setResult(6000,intent);
                finish();
            }
        });
    }
}
