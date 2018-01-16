package com.bwie.aizhonghui.vp_vp.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by DANGEROUS_HUI on 2018/1/16.
 */

public class My_ViewPager extends ViewPager{

    private int startX;
    private int startY;
    public My_ViewPager(Context context) {
        super(context);
    }

    public My_ViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                break;
            case MotionEvent.ACTION_MOVE:
                if(getCurrentItem()==getAdapter().getCount()-1){
                    getParent().requestDisallowInterceptTouchEvent(true);
                    System.out.println("hahaha");
                }
                break;
        }

        return super.dispatchTouchEvent(ev);
    }


}
