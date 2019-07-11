package com.portfolio.androidstudy.session3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.portfolio.androidstudy.R;

import java.security.Key;

public class SampleEventActivity extends AppCompatActivity {
    TextView textView;
    GestureDetector detector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_event);

        detector = new GestureDetector(this, new GestureDetector.OnGestureListener() {
            @Override
            public boolean onDown(MotionEvent e) {
                println("onDown() 호출됨");
                return true;
            }

            @Override
            public void onShowPress(MotionEvent e) {
                println("onShowPress() 호출됨");
            }

            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                println("onSingleTapUp() 호출됨");
                return true;
            }

            @Override
            public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
                println("onScroll() 호출됨" + distanceX + ", " + distanceY);
                return true;
            }

            @Override
            public void onLongPress(MotionEvent e) {
                println("onLongPress() 호출됨");
            }

            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                println("onFling() 호출됨" + velocityX + ", " + velocityY);
                return true;
            }
        });

        textView = findViewById(R.id.textView3);
        View view = findViewById(R.id.view);
        View view2 = findViewById(R.id.view2);

        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();

                float curX = event.getX();
                float curY = event.getY();

                if (action == MotionEvent.ACTION_DOWN) {
                    println("손가락 눌림" + curX + ", " + curY);
                } else if (action == MotionEvent.ACTION_MOVE)
                    println("손가락 움직임 " + curX + ", " + curY);
                else if (action == MotionEvent.ACTION_UP)
                    println("손가락 뗌 " + curX + ", " + curY);

                return true;
            }
        });

        view2.setOnTouchListener(
                new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        detector.onTouchEvent(event);
                        return true;
                    }
                }
        );
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK) {
            Toast.makeText(getApplicationContext(),"시스템 [BACK] 버튼이 눌렸습니다.",
                     Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }

    public void println(String data) {
        textView.append(data + "\n");
    }
}
