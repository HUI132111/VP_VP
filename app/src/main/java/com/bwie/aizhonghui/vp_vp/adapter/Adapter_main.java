package com.bwie.aizhonghui.vp_vp.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bwie.aizhonghui.vp_vp.R;

import java.util.List;

/**
 * Created by DANGEROUS_HUI on 2018/1/16.
 */

public class Adapter_main extends PagerAdapter{
    private List<String> list;
    private Context context;

    public Adapter_main(List<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = View.inflate(context, R.layout.vp_image, null);
        ImageView imageView = view.findViewById(R.id.iv_img);
        Glide.with(context).load(list.get(position)).into(imageView);
        container.addView(view);
        return view;
    }

    @Override

    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
