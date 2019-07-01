package com.portfolio.androidstudy.session2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.portfolio.androidstudy.R;

public class DoitMission4Activity extends AppCompatActivity {
    EditText edtText;
    TextView txtNum;
    Button btnSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doit_mission4);
        edtText=findViewById(R.id.edt_text);
        txtNum=findViewById(R.id.txt_num);
        btnSend=findViewById(R.id.btn_send);
        edtText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                txtNum.setText(count +" / 80 바이트");
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        edtText.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
