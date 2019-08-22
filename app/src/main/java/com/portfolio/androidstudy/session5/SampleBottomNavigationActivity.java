package com.portfolio.androidstudy.session5;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.portfolio.androidstudy.R;

public class SampleBottomNavigationActivity extends AppCompatActivity {

    FirstFragment fragment1;
    TwoFragment fragment2;
    ThreeFragment fragment3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_bottom_navigation_acitivity);

        fragment1=new FirstFragment();
        fragment2=new TwoFragment();
        fragment3=new ThreeFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.container4,
                fragment1).commit();

        BottomNavigationView view = findViewById(R.id.bottom_navigation);
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.tab1 :
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.container4,fragment1).commit();
                        Toast.makeText(SampleBottomNavigationActivity.this,
                                "첫번째 선택됨", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.tab2 :
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.container4,fragment2).commit();
                        Toast.makeText(SampleBottomNavigationActivity.this,
                                "두번째 선택됨", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.tab3 :
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.container4,fragment3).commit();
                        Toast.makeText(SampleBottomNavigationActivity.this,
                                "세번째 선택됨", Toast.LENGTH_SHORT).show();
                        return true;

                }
                return false;
            }
        });
    }
}
