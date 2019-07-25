package com.portfolio.androidstudy.session4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.portfolio.androidstudy.R;

public class DoItMisson8SaleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_do_it_misson8_sale);

        Button button=findViewById(R.id.button56);
        Button button1 = findViewById(R.id.button57);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.putExtra("name", "Sale");
                setResult(5000,intent);
                finish();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("name" , "Sale");
                setResult(5500, intent);
                finish();
            }
        });
    }
}
