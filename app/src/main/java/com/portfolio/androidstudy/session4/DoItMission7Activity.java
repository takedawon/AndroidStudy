package com.portfolio.androidstudy.session4;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.portfolio.androidstudy.R;

public class DoItMission7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_do_it_mission7);

        Button button = findViewById(R.id.button47);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DoItMission7MenuActivity.class);
                startActivityForResult(intent,4000);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==4000) {
            if (resultCode == 3000)
                Toast.makeText(getApplicationContext(),
                        data.getStringExtra("name"),
                        Toast.LENGTH_SHORT).show();
            else if(resultCode==5000)
                Toast.makeText(getApplicationContext(),
                        data.getStringExtra("name"),
                        Toast.LENGTH_SHORT).show();
            else if(resultCode==6000)
                Toast.makeText(getApplicationContext(),
                        data.getStringExtra("name"),
                        Toast.LENGTH_SHORT).show();

        }
    }
}
