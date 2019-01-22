package com.github.jayuc.tasker.test;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;

import com.github.jayuc.tasker.utils.QuartzHelper;

public class JobTest {
	
	public static Scheduler scheduler;

	public static void main(String[] args) {

		try {
			
			scheduler = QuartzHelper.addJob("test", Job1.class, 1, new JobTest());
			System.out.println(scheduler);
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
		
	}
	
	public static Scheduler getScheduler() {
		return scheduler;
	}

}
