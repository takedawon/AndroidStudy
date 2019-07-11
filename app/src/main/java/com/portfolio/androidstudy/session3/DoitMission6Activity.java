package com.portfolio.androidstudy.session3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.portfolio.androidstudy.R;

import org.w3c.dom.Text;

public class DoitMission6Activity extends AppCompatActivity {
    EditText editText;
    SeekBar seekBar;
    TextView textView6;
    ProgressBar progressBar;
    int num=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doit_mission6);
        seekBar = findViewById(R.id.seekBar);
        editText = findViewById(R.id.editText4);
        progressBar = findViewById(R.id.progressBar2);
        textView6=findViewById(R.id.textView6);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                num=seekBar.getProgress();
                textView6.setText(new StringBuffer().append(num));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                num=seekBar.getProgress();
                Toast.makeText(getApplicationContext(),
                        "onStart",
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                num=seekBar.getProgress();
                Toast.makeText(getApplicationContext(),
                        "onStop",
                        Toast.LENGTH_SHORT).show();
            }
        });
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!editText.getText().toString().equals("")) {
                    seekBar.setProgress(Integer.valueOf(editText.getText().toString()));
                    progressBar.setProgress(Integer.valueOf(editText.getText().toString()));
                }
            }
        });
    }
}
