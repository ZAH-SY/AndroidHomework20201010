package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //加载布局
        setContentView(R.layout.activity_main);
        //获取控件
        tv_password = findViewById(R.id.tv_password);
        et_password = findViewById(R.id.et_password);
        btn_forget = findViewById(R.id.btn_forget);
        ck_remember = findViewById(R.id.ck_remember);
        rg_login = findViewById(R.id.rg_login);
        //单选按钮组绑定监听器
        rg_login.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rb_password) {
                    tv_password.setText("登录密码：");
                    et_password.setHint("请输入密码");
                    btn_forget.setText("忘记密码");
                    ck_remember.setVisibility(View.VISIBLE);
                } else if (checkedId == R.id.rb_verifycode) {
                    tv_password.setText("验证码：");
                    et_password.setHint("请输入验证码");
                    btn_forget.setText("获取验证码");
                    ck_remember.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}