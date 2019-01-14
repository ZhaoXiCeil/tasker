package com.github.jayu.tasker.iter;

/**
 * 进度
 * @author yujie
 *
 */
public interface IRate {
	
	/**
	 * 获取进度
	 * @return -1表示永无止境
	 */
	float getRate();

}
