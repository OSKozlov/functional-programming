package com.multithreading.threadpool;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Executor;

public class ThreadPool implements Executor {

	private final Queue<Runnable> workQueue = new ConcurrentLinkedDeque<>();
	private volatile boolean isRunning = true;
	
	private static final String TASK_NAME = "Task";

	public ThreadPool(int nThreads) {
		for (int i = 0; i < nThreads; i++) {
			new Thread(new TaskWorker(TASK_NAME, i)).start();
		}
	}

	@Override
	public void execute(Runnable command) {
		if (isRunning) {
			workQueue.offer(command);
		}
	}
	
	public void shutdown() {
		isRunning = false;
	}

	private final class TaskWorker implements Runnable {
		
		private String taskName;
		private int taskNumber;
		
		public TaskWorker(String taskName, int taskNumber) {
			this.taskName = taskName;
			this.taskNumber = taskNumber;
		}

		@Override
		public void run() {
			while (isRunning) {
				Runnable nextTask = workQueue.poll();
				if (nextTask != null) {
					nextTask.run();
				}
			}
		}
		
		public String getTaskName() {
			return taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public int getTaskNumber() {
			return taskNumber;
		}

		public void setTaskNumber(int taskNumber) {
			this.taskNumber = taskNumber;
		}

	}
}
