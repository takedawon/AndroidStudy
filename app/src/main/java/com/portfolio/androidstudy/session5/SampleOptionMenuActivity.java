package com.portfolio.androidstudy.session5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.portfolio.androidstudy.R;

public class SampleOptionMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_option_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int curId = item.getItemId();
        switch (curId) {
            case R.id.menu_refresh:
                Toast.makeText(getApplicationContext()
                        , "새로고침 메뉴가 선택되었습니다."
                        , Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_search:
                Toast.makeText(getApplicationContext()
                        , "검색 메뉴가 선택되었습니다."
                        , Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_setting:
                Toast.makeText(getApplicationContext()
                        , "설정 메뉴가 선택되었습니다."
                        , Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
