package com.example.exam8;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SetActivity extends AppCompatActivity {
    private SharedPreferences preferences = null;
    private SharedPreferences.Editor editor = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);
        //利用SharedPreferences读取数据并显示
        preferences = getSharedPreferences("set", Context.MODE_PRIVATE);
        //获取haredPreferences.Editor对象，尝试写数据
        editor = preferences.edit();
        //为“确定”按钮绑定监听器

        Button btn_ok = findViewById(R.id.btn_confirm);
        final EditText et_user = findViewById(R.id.et_uname);
        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = et_user.getText().toString();
                editor.putString("user", user);
                editor.apply();
                finish();
            }
        });
    }
}