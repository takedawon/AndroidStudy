package com.portfolio.androidstudy.session4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.portfolio.androidstudy.R;

public class SampleParcelableMenuActivity extends AppCompatActivity {
    TextView textView;

    public static final String KEY_SIMPLE_DATA = "data";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_parcelable_menu);

        textView= findViewById(R.id.textView8);
        Button button=findViewById(R.id.button43);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent();
                        intent.putExtra("name","mike");
                        setResult(RESULT_OK,intent);
                        finish();
                    }
                }
        );

        Intent intent2=getIntent();
        processIntent(intent2);
    }

    private void processIntent(Intent intent) {
        if(intent != null) {
            SimpleData data = intent.getParcelableExtra(KEY_SIMPLE_DATA);
                textView.setText("전달 받은 데이터\nNumber : " + data.number +
                        "\nMessage : " +data.message);
            }
        }
    }
