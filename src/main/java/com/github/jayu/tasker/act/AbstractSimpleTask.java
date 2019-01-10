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
	
	//状态锁对象
	private static final Object statusLock = new Object();

	/**
	 * 开始任务
	 */
	@Override
	public void start() {
		this.setStatus(TaskStatus.OPEN);
		this.startExecute();
	};

	/**
	 * 结束任务
	 */
	@Override
	public void end() {
		this.setStatus(TaskStatus.CLOSE);
		this.endExecute();
	};
	
	/**
	 * 开始执行任务，子类实现
	 */
	public abstract void startExecute();
	
	/**
	 * 结束执行任务，子类实现
	 */
	public abstract void endExecute();

	/**
	 * 获取进度
	 */
	@Override
	public IRate getRate() {
		return null;
	}

	/**
	 * 获取任务状态
	 */
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
