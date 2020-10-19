package com.example.exam3;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class exam3 extends Activity {

    //行星名称数组
    private String[] names = new String[]{"水星", "金星", "地球", "火星", "木星", "土星"};
    //行星描述数组
    private String[] descs = new String[]{
            "水星是太阳系八大行星最内侧也是最小的一颗行星，也是离太阳最近的行星。",
            "金星是太阳系八大行星之一，排行第二，距离太阳0.725天文单位。",
            "地球是太阳系八大行星之一，排行第三，也是太阳系中直径、质量和密度最大的类地行星。",
            "火星是太阳系八大行星之一，排行第四，属于类地行星，直径约为地球的53%。",
            "木星是太阳系八大行星中体积最大、自转最快的行星，排行第五。它的质量为太阳的千分之一。",
            "土星为太阳系八大行星之一，排行第六，体积仅次于木星。"};
    //行星图片数组
    private int[] imageIds = new int[]{R.drawable.shuixing, R.drawable.jinxing,
            R.drawable.diqiu, R.drawable.huoxing, R.drawable.muxing, R.drawable.tuxing};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        List<Map<String,Object>> listItems = new ArrayList<Map<String,Object>>();
        for (int i = 0; i < names.length; i++){
            Map<String,Object> listItem = new HashMap<String, Object>();
            listItem.put("header",imageIds[i]);
            listItem.put("personName",names[i]);
            listItem.put("desc",descs[i]);
            listItems.add(listItem);
        }
        //创建一个SimpleAdapter
        SimpleAdapter simpleAdapter = new SimpleAdapter(this,listItems,R.layout.activity_exam3,new String[]{"personName","header","desc"},new int[]{R.id.name,R.id.header,R.id.desc});
        ListView list = (ListView)findViewById((R.id.mylist));
        //为ListView设置Adapter
        list.setAdapter(simpleAdapter);
    }
}
