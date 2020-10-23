package com.example.exam7;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ChooseActivity extends AppCompatActivity {
    GridView gridView;
    List<HashMap<String, Object>> imageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        gridView = findViewById(R.id.grid_view);
        //从array中获取图片ID
        TypedArray imagesID = getResources().obtainTypedArray(R.array.images);
        //新建的map用于存放适配器中的键值对
        HashMap<String, Object> map;
        for (int i = 0; i < imagesID.length(); i++) {
            map = new HashMap<>(2);
            map.put("image", imagesID.getResourceId(i, 0));
            imageList.add(map);
        }
        //新建SimpleAdapter
        SimpleAdapter adapter = new SimpleAdapter(
                this, imageList, R.layout.adapter_icon, new String[]{"image"}, new int[]{R.id.image_head});
        //为GridView设置适配器
        gridView.setAdapter(adapter);
        //设置监听器
        gridView.setOnItemClickListener((parent, view, position, id) -> {
            //新建Intent
            Intent intent = new Intent(ChooseActivity.this, ChooseActivity.class);
            //设置数据
            intent.putExtra("imageID", imagesID.getResourceId(position, 0));
            //返回值
            setResult(RESULT_OK, intent);
            //结束当前活动
            finish();
        });
    }
}
