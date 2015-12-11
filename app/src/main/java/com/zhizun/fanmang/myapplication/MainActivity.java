package com.zhizun.fanmang.myapplication;

import android.app.ListActivity;
import android.content.ClipData;
import android.content.Context;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Listel> list2= new ArrayList<Listel>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initlists();
        ItemAdapter adapter=new ItemAdapter(MainActivity.this,R.layout.activity_main, list2);
        ListView listView=(ListView)findViewById(R.id.line1);
        listView.setAdapter(adapter);
    }
    private void initlists(){
        Listel a =new Listel("小明2015",R.mipmap.ic_launcher);
        list2.add(a);
        Listel b=new Listel("小黄2015",R.mipmap.ic_launcher);
        list2.add(b);
        Listel c =new Listel("小紫2015",R.mipmap.ic_launcher);
        list2.add(c);

    }
}
