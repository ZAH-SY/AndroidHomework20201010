package com.example.exam2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;

public class exam2 extends AppCompatActivity {
    ImageView ivApple;
    ImageView ivBoy;
    Button btnFitCenter;
    Button btnCentterCrop;
    Button btnCenterInside;
    Button btn_center;
    Button btnFitxy;
    Button btnFitStart;
    Button btnFitEnd;
    Switch stLight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam2);
        ivApple = findViewById(R.id.iv_apple);
        ivBoy = findViewById(R.id.iv_boy);

        btnFitCenter = findViewById(R.id.btn_fit_center);
        btnCentterCrop = findViewById(R.id.btn_center_crop);
        btnCenterInside = findViewById(R.id.btn_center_inside);
        btn_center = findViewById(R.id.btn_center);
        btnFitxy = findViewById(R.id.btn_fit_xy);
        btnFitStart =findViewById(R.id.btn_fit_start);
        btnFitEnd = findViewById(R.id.btn_fit_end);

        stLight = findViewById(R.id.st_light);
        stLight.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(!isChecked){
                    ivBoy.setImageResource(R.drawable.light);
                }else{
                    ivBoy.setImageResource(R.drawable.dark);
                }
            }
        });

        btnFitCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivApple.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
        });

        btnCentterCrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivApple.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
        });

        btnCenterInside.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivApple.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            }
        });

        //center按钮单击事件监听器
        btn_center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivApple.setScaleType(ImageView.ScaleType.CENTER);
            }
        });

        btnFitxy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivApple.setScaleType(ImageView.ScaleType.FIT_XY);
            }
        });

        btnFitStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivApple.setScaleType(ImageView.ScaleType.FIT_START);
            }
        });

        btnFitEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivApple.setScaleType(ImageView.ScaleType.FIT_END);
            }
        });
    }
}
