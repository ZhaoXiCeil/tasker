package com.github.jayuc.tasker.act;

import com.github.jayuc.tasker.iter.IRate;
import com.github.jayuc.tasker.iter.ITask;
import com.github.jayuc.tasker.model.TaskStatus;

/**
 * 抽象任务
 * @author jayu
 *
 */
public abstract class AbstractTask implements ITask {
	
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

	@Override
	public abstract IRate getRate();
	
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
