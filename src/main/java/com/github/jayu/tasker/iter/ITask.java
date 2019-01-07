package com.github.jayu.tasker.iter;

import com.github.jayu.tasker.model.TaskStatus;

/**
 * 任务
 * @author yujie
 *
 */
public interface ITask {

	/**
	 * 开始任务
	 */
	void start();
	
	/**
	 * 结束任务
	 */
	void end();
	
	/**
	 * 获取任务进度
	 * @return
	 */
	IRate getRate();
	
	/**
	 * 获取任务状态
	 * @return
	 */
	TaskStatus getStatus();
	
}
