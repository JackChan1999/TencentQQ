package com.itheima.tencentqq.drag;


import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

import com.itheima.tencentqq.drag.DragLayout.Status;
/**
 * ============================================================
 * Copyright：Google有限公司版权所有 (c) 2017
 * Author：   陈冠杰
 * Email：    815712739@qq.com
 * GitHub：   https://github.com/JackChen1999
 * 博客：     http://blog.csdn.net/axi295309066
 * 微博：     AndroidDeveloper
 * <p>
 * Project_Name：TencentQQ
 * Package_Name：com.itheima.tencentqq
 * Version：1.0
 * time：2016/2/15 16:36
 * des ：${TODO}
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/
public class DragRelativeLayout extends RelativeLayout {

    private DragLayout dl;

	public DragRelativeLayout(Context context) {
        super(context);
    }

    public DragRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DragRelativeLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }


    public void setDragLayout(DragLayout dl) {
        this.dl = dl;
    }
    
    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        if (dl.getStatus() != Status.Close) {
            return true;
        }
        return super.onInterceptTouchEvent(event);
    }

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		if (dl.getStatus() != Status.Close) {
			if (event.getAction() == MotionEvent.ACTION_UP) {
				dl.close(true);
			}
			return true;
		}
		return super.onTouchEvent(event);
	}
}
