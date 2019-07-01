package com.portfolio.androidstudy.session1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.portfolio.androidstudy.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String hello = new String();
        // Ctrl + P 매개변수 후보 확인
        // Ctrl + O Override 함수
        // Ctrl + Shift + F Find in Path
        // Ctrl + Q 클래스 정보 확인

    }

    public void onButton1Clicked(View v) {
        Toast.makeText(this, "확인1 버튼이 눌렸어요.",Toast.LENGTH_SHORT).show();
    }

    public void onButton2Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com/"));
        startActivity(myIntent);
    }

    public void onButton3Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:010-0001-0000"));
        startActivity(myIntent);
    }
}
