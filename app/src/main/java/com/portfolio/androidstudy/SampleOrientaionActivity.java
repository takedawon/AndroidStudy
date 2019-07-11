package com.portfolio.androidstudy;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SampleOrientaionActivity extends AppCompatActivity {

    String name;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_orientaion);

        editText=findViewById(R.id.editText3);

        Button button =findViewById(R.id.button30);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = editText.getText().toString();
                showToast("입력된 값을 변수에 저장하였습니다" + name);
            }
        });

        if(savedInstanceState != null) {
            name = savedInstanceState.getString("name");
            showToast("값을 복원하였습니다." + name);
        }

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("name",name);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void showToast(String data) {
        Toast.makeText(getApplicationContext(),data,Toast.LENGTH_SHORT).show();
    }
}
