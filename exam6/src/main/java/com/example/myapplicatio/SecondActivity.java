package com.example.myapplicatio;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView tvSex;
    TextView tvHeight;
    TextView tvWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tvSex = findViewById(R.id.tv_sex);
        tvHeight = findViewById(R.id.tv_height);
        tvWeight = findViewById(R.id.tv_weight);
        Bundle bundle = this.getIntent().getExtras();
        assert bundle != null;
        String sex = bundle.getString("sex");
        int height = Integer.parseInt(bundle.getString("height"));
        double weight = ((height - 80) * 0.7);
        if (sex.equals("女性")) {
            weight = (height - 70) * 0.6;
        }
        tvSex.setText(getString(R.string.tv_sex, sex));
        tvHeight.setText(getString(R.string.tv_height, height));
        tvWeight.setText(getString(R.string.tv_weight, weight));
    }
}
