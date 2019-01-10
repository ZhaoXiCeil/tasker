package com.github.jayu.tasker.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.github.jayu.tasker.act.AbstractSimpleTask;

public class SimpleTask extends AbstractSimpleTask {
	
	private int total = 0;

	private static final ExecutorService executor = Executors.newSingleThreadExecutor();
	
	@Override
	public void startExecute() {
		executor.submit(() -> {
			
		});
	}

	@Override
	public void endExecute() {
	}

}
