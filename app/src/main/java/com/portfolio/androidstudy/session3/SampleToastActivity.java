package com.portfolio.androidstudy.session3;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.portfolio.androidstudy.R;

public class SampleToastActivity extends AppCompatActivity {
    EditText editText2;
    EditText editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_toast);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);

    }

    public void onButton4Clicked(View v) {
        try {
            Toast toastView = Toast.makeText(this, "위치가 바뀐 토스트 메시지입니다.",
                    Toast.LENGTH_LONG);

            int xOffset = Integer.parseInt(editText2.getText().toString());
            int yOffset = Integer.parseInt(editText3.getText().toString());

            toastView.setGravity(Gravity.TOP | Gravity.TOP, xOffset, yOffset);
            toastView.show();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public void onButton5Clicked(View v) {
        LayoutInflater inflater = getLayoutInflater();

        View layout = inflater.inflate(
                R.layout.toastborder,
                (ViewGroup) findViewById(R.id.toast_layout_root));

        TextView text = layout.findViewById(R.id.text22);
        Toast toast = new Toast(this);
        text.setText("모양 바꾼 토스트");
        toast.setGravity(Gravity.CENTER, 0, -100);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }

    public void onButton6Clicked(View v) {
        Snackbar.make(v, "스낵바입니다", Snackbar.LENGTH_LONG).show();
    }

}
