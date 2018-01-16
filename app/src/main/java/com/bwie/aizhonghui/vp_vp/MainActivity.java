package com.bwie.aizhonghui.vp_vp;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bwie.aizhonghui.vp_vp.adapter.Adapter_fra;
import com.bwie.aizhonghui.vp_vp.adapter.Adapter_main;
import com.bwie.aizhonghui.vp_vp.fragments.Fragmentfour;
import com.bwie.aizhonghui.vp_vp.fragments.Fragmentone;
import com.bwie.aizhonghui.vp_vp.fragments.Fragmentthree;
import com.bwie.aizhonghui.vp_vp.fragments.Fragmenttwo;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager vp;
    private List<Fragment> list;
    private Adapter_fra adapter_fra;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        initsetData();
    }

    private void initData() {
        list=new ArrayList<>();
        list.add(new Fragmentone());
        list.add(new Fragmenttwo());
        list.add(new Fragmentthree());
        list.add(new Fragmentfour());
    }

    private void initsetData() {
        adapter_fra = new Adapter_fra(getSupportFragmentManager(), list, this);
        vp.setAdapter(adapter_fra);
    }


    private void initView() {
        vp = findViewById(R.id.vp_main);
    }


}
