package com.bwie.aizhonghui.vp_vp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bwie.aizhonghui.vp_vp.R;
import com.bwie.aizhonghui.vp_vp.adapter.Adapter_main;
import com.bwie.aizhonghui.vp_vp.widget.My_ViewPager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DANGEROUS_HUI on 2018/1/16.
 */

public class Fragmentone extends Fragment{

    private View view;
    private My_ViewPager vp;
    private List<String> list;
    private Adapter_main adapter_main;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getActivity(), R.layout.fra_one, null);
        System.out.println("ppppppppppppppppp");
        initView();
        initData();
        initsetData();
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("wwwwwwwwwwwwwww");


    }

    private void initsetData() {
        adapter_main = new Adapter_main(list,getActivity());
        vp.setAdapter(adapter_main);
    }

    private void initData() {
        list=new ArrayList<>();
        list.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1516092492155&di=9ed1da54fd3987fa5c9cac8ce00bf391&imgtype=jpg&src=http%3A%2F%2Fimg2.imgtn.bdimg.com%2Fit%2Fu%3D722658367%2C532952653%26fm%3D214%26gp%3D0.jpg");
        list.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1516092332752&di=44aca2995a8e2075f5464edb02abdba9&imgtype=0&src=http%3A%2F%2Fpic36.photophoto.cn%2F20150820%2F0017029506845411_b.jpg");
        list.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1516092332752&di=2d711cc2652e61fee7c43a8c67818975&imgtype=0&src=http%3A%2F%2Fpic21.nipic.com%2F20120523%2F5517935_231238481000_2.jpg");
        list.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1516092332752&di=fbbb5f784c26c8f7b497b6662f09c21f&imgtype=0&src=http%3A%2F%2Fpic.58pic.com%2F58pic%2F13%2F10%2F74%2F98U58PICXAs_1024.jpg");

    }

    private void initView() {
        if(view==null){
            System.out.println("sssss");
        }
        vp = view.findViewById(R.id.vp_title);
    }
}
