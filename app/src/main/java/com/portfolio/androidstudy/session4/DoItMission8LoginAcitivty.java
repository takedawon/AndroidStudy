package com.portfolio.androidstudy.session4;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.portfolio.androidstudy.R;

public class DoItMission8LoginAcitivty extends AppCompatActivity {
    EditText id;
    EditText pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_do_it_mission8_login_acitivty);

        id = findViewById(R.id.editText6);
        pw = findViewById(R.id.editText7);
        Button button = findViewById(R.id.button50);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(id.getText()) ||
                        TextUtils.isEmpty(pw.getText())) {
                    Toast.makeText(getApplicationContext(),
                            "아이디, 패스워드를 입력하시오,",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(getApplicationContext(),
                            DoItMission8MenuAcitivty.class);
                    startActivityForResult(intent, 100);
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == 1000) {
            Toast.makeText(getApplicationContext(),
                    data.getStringExtra("name"),
                    Toast.LENGTH_SHORT).show();
        } else if (resultCode == 1100)
            Toast.makeText(getApplicationContext(),
                    data.getStringExtra("name"),
                    Toast.LENGTH_SHORT).show();
        else if (resultCode == 1200)
            Toast.makeText(getApplicationContext(),
                    data.getStringExtra("name"),
                    Toast.LENGTH_SHORT).show();
    }
}
