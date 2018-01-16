package com.bwie.aizhonghui.vp_vp.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by DANGEROUS_HUI on 2018/1/16.
 */

public class Adapter_fra extends FragmentPagerAdapter{

    private List<Fragment> list;
    private Context context;

    public Adapter_fra(FragmentManager fm, List<Fragment> list, Context context) {
        super(fm);
        this.list = list;
        this.context = context;
    }

    public Adapter_fra(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }


}
