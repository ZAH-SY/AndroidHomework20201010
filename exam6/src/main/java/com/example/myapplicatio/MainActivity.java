package com.example.myapplicatio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup groupSex;
    EditText etHeight;
    Button btnCul;
    RadioButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this, SecondActivity.class);
        groupSex = findViewById(R.id.group_sex);
        etHeight = findViewById(R.id.et_height);
        btnCul = findViewById(R.id.btn_cul);
        btnCul.setOnClickListener((v) -> {
            button = findViewById(groupSex.getCheckedRadioButtonId());
            bundle.putString("sex", button.getText().toString());
            bundle.putString("height", etHeight.getText().toString());
            intent.putExtras(bundle);
            startActivity(intent);
        });
    }
}
