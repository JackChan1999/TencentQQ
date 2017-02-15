package com.itheima.tencentqq.swipe;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

import com.itheima.tencentqq.swipe.SwipeLayout.Status;
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

public class FrontLayout extends RelativeLayout {

	private SwipeLayoutInterface mISwipeLayout;

	public FrontLayout(Context context) {
		super(context);
	}

	public FrontLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public FrontLayout(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public void setSwipeLayout(SwipeLayoutInterface mSwipeLayout){
		this.mISwipeLayout = mSwipeLayout;
	}
	
	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		if(mISwipeLayout.getCurrentStatus() == Status.Close){
			return super.onInterceptTouchEvent(ev);
		}else {
			return true;
		}
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		if(mISwipeLayout.getCurrentStatus() == Status.Close){
			return super.onTouchEvent(event);
		}else {
			if(event.getActionMasked() == MotionEvent.ACTION_UP){
				mISwipeLayout.close();
			}
			return true;
		}
	}

}
