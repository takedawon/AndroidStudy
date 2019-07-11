package com.portfolio.androidstudy.session3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.SeekBar;

import com.portfolio.androidstudy.R;

public class DoitMission6Activity extends AppCompatActivity {
    EditText editText;
    SeekBar seekBar;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doit_mission6);
        seekBar=findViewById(R.id.seekBar);
        editText=findViewById(R.id.editText4);
        progressBar=findViewById(R.id.progressBar2);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(!editText.getText().toString().equals("")) {
                    seekBar.setProgress(Integer.valueOf(editText.getText().toString()));
                    progressBar.setProgress(Integer.valueOf(editText.getText().toString()));
                }
            }
        });
    }
}
