package com.example.exam8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private SharedPreferences preferences = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //为“参数设置”按钮绑定监听器
        Button btn_set = findViewById(R.id.btn_set);
        btn_set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, SetActivity.class);
                startActivity(it);
            }
        });
    }

    //当前Activity从停止状态再次回到运行状态时，onStart()函数会被回调
    @Override
    protected void onStart() {
        super.onStart();
        preferences = getSharedPreferences("set", Context.MODE_PRIVATE);
        String user = preferences.getString("user", "");
        TextView tv_welcome = findViewById(R.id.tv_welcome);
        tv_welcome.setText("欢迎 " + user + " 来到我的家园");
    }
}
