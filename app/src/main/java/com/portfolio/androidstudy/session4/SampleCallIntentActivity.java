package com.portfolio.androidstudy.session4;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.portfolio.androidstudy.R;

public class SampleCallIntentActivity extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_call_intent);
        editText=findViewById(R.id.editText5);
        Button button=findViewById(R.id.button41);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = editText.getText().toString();

                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(data));
                startActivity(intent);
            }
        });
        Button button2=findViewById(R.id.button42);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                ComponentName name=new ComponentName("com.portfolio.androidstudy",
                        "com.portfolio.androidstudy.session4.SampleCallIntentMenuActivity");
                intent.setComponent(name);
                startActivityForResult(intent,101);
            }
        });
    }
}
