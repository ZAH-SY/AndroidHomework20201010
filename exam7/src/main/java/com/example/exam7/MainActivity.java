package com.example.exam7;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btnChoose;
    ImageView imgChoose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChoose = findViewById(R.id.btn_choose);
        imgChoose = findViewById(R.id.img_choose);
        Intent intent = new Intent(this, ChooseActivity.class);
        btnChoose.setOnClickListener(v -> {
            startActivityForResult(intent, 1);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 1:
                imgChoose.setImageResource(data.getIntExtra("imageID", R.drawable.icon));
                break;
            default:
                break;
        }
    }
}
