package com.portfolio.androidstudy.session5;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.portfolio.androidstudy.R;

public class SampleActionActivity extends AppCompatActivity {
    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_action);

        actionBar = getSupportActionBar();

        Button button = findViewById(R.id.button62);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionBar.setLogo(R.drawable.ic_home_black_24dp);
                actionBar.setDisplayOptions(
                        ActionBar.DISPLAY_SHOW_HOME | ActionBar.DISPLAY_USE_LOGO);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        View v = menu.findItem(R.id.menu_search).getActionView();
        if(v != null) {
            EditText editText = v.findViewById(R.id.editText8);
            if(editText != null) {
                editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                    @Override
                    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                        Toast.makeText(SampleActionActivity.this, "입력됨", Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });
            }
        }

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int curId = item.getItemId();
        switch (curId) {
            case R.id.menu_refresh :
                Toast.makeText(this, "새로고침 버튼을 클릭하셨습니다.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_search :
                Toast.makeText(this, "검색 버튼을 클릭하셨습니다.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_setting :
                Toast.makeText(this, "설정 버튼을 클릭하셨습니다.", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
