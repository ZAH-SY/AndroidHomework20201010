package com.example.exam5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvTime;
    ImageView imgBg;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTime = findViewById(R.id.tv_Time);
        tvTime.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        tvTime.getPaint().setAntiAlias(true);
        tvTime.setText(getString(R.string.last_time," "));
        imgBg = findViewById(R.id.img_bg);
        imgBg.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                long time = event.getEventTime() - event.getDownTime();
                tvTime.setText(getString(R.string.last_time,String.valueOf(time)));
                return true;
            }
        });
    }
}
