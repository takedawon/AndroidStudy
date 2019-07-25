package com.portfolio.androidstudy.session4;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.portfolio.androidstudy.R;

public class DoItMission8MenuAcitivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_do_it_mission8_menu_acitivty);
        Button button1 = findViewById(R.id.button51);
        Button button2 = findViewById(R.id.button52);
        Button button3 = findViewById(R.id.button53);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),DoItMission8MemberActivity.class);
                startActivityForResult(intent,200);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),DoItMisson8SaleActivity.class);
                startActivityForResult(intent,300);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),DoItMission8ProductActivity.class);
                startActivityForResult(intent,400);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==200) {
            if (resultCode == 3000)
                Toast.makeText(getApplicationContext(),
                        data.getStringExtra("name"),
                        Toast.LENGTH_SHORT).show();
            else if(resultCode == 3500) {
                Intent intent = new Intent();
                intent.putExtra("name","Member");
                setResult(1000, intent);
                finish();
            }
        } else if(requestCode == 400) {
            if(resultCode == 4000)
                Toast.makeText(getApplicationContext(),
                        data.getStringExtra("name"),
                        Toast.LENGTH_SHORT).show();
            else if(resultCode == 4500) {
                Intent intent = getIntent();
                intent.putExtra("name","Product");
                setResult(1100, intent);
                finish();
            }
        } else if(requestCode == 300) {
            if(resultCode== 5000)
                Toast.makeText(getApplicationContext(),
                        data.getStringExtra("name"),
                        Toast.LENGTH_SHORT).show();
            else if(resultCode == 5500) {
                Intent intent=new Intent();
                intent.putExtra("name", "Sale");
                setResult(1200,intent);
                finish();
            }
        }
    }
}
