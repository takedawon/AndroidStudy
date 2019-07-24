package com.portfolio.androidstudy.session4;

import android.app.Activity;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.portfolio.androidstudy.R;

public class SampleLifeCycleActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_life_cycle);
        Toast.makeText(getApplicationContext(),"onCreate 호출됨",Toast.LENGTH_SHORT).show();
        println("onCreate 호출됨");
        textView=findViewById(R.id.textView9);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(),"onStart 호출됨",Toast.LENGTH_SHORT).show();
        println("onStart 호출됨");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(),"onStop 호출됨",Toast.LENGTH_SHORT).show();
        println("onStop 호출됨");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"onDestroy 호출됨",Toast.LENGTH_SHORT).show();
        println("onDestroy 호출됨");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),"onPause 호출됨",Toast.LENGTH_SHORT).show();
        println("onPause 호출됨");
        saveState();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),"onResume 호출됨",Toast.LENGTH_SHORT).show();
        println("onResume 호출됨");
        restoreState();

    }

    protected void println(String name) {
        Log.e("Main",name);
    }

    protected void restoreState() {
        SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
        if((pref!=null) && (pref.contains("name"))) {
            String name = pref.getString("name","");
            textView.setText(name);
        }
    }

    protected void saveState() {
        SharedPreferences pref=getSharedPreferences("pref", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("name", textView.getText().toString());
        editor.commit();
    }

    protected void clearState() {
        SharedPreferences pref=getSharedPreferences("pref", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.clear();
        editor.commit();
    }
}
