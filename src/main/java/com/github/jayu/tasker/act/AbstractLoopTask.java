package com.github.jayu.tasker.act;

import com.github.jayu.tasker.iter.IRate;

/**
 * 循环任务简单抽象类
 * @author jayu
 *
 */
public abstract class AbstractLoopTask extends AbstractTask {

	//进度
	private LoopRate rate;
	
	public AbstractLoopTask() {
		super();
		this.rate = new LoopRate();
	}

	@Override
	public IRate getRate() {
		return rate;
	}

}
