package com.github.jayu.tasker.act;

import com.github.jayu.tasker.iter.IRate;
import com.github.jayu.tasker.iter.ITask;
import com.github.jayu.tasker.model.TaskStatus;

/**
 * 简单任务抽象实现
 * @author yujie
 *
 */
public abstract class AbstractSimpleTask implements ITask {
	
	//任务状态
	protected TaskStatus status;
	
	private Object statusLock = new Object();

	@Override
	public void start() {
		
	};

	@Override
	public abstract void end();

	@Override
	public IRate getRate() {
		return null;
	}

	@Override
	public TaskStatus getStatus() {
		synchronized (statusLock) {
			return status;
		}
	}
	
	/**
	 * 设置任务状态
	 * @param status
	 */
	public void setStatus(TaskStatus status) {
		synchronized (statusLock) {
			this.status = status;
		}
	}

}
