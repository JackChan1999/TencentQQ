package com.itheima.tencentqq.swipe;

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
public interface SwipeLayoutInterface {

	Status getCurrentStatus();
	
	void close();
	
	void open();
}
