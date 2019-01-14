package com.github.jayu.tasker.act;

import com.github.jayu.tasker.iter.IRate;
import com.github.jayu.tasker.iter.ITask;
import com.github.jayu.tasker.model.TaskStatus;

/**
 * 简单任务抽象实现
 * @author yujie
 *
 */
public abstract class AbstractSimpleTask extends AbstractTask {
	
	//进度
	private Rate rate;

	/**
	 * 构造方法
	 * @param total 任务的总数量
	 */
	public AbstractSimpleTask(int total) {
		super();
		this.rate = new Rate(total);
	}

	/**
	 * 获取进度
	 */
	@Override
	public IRate getRate() {
		return rate;
	}
	
	/**
	 * 设置最新的任务进度
	 * @param completed
	 */
	public void setCompleted(int completed) {
		rate.setCompleted(completed);
	}

}
