package com.supinfo.philosophers;

import java.util.concurrent.locks.ReentrantLock;

public class Fork {
	private String name;
	
	private ReentrantLock lock = new ReentrantLock();

	public Fork(String name) {
		this.name = name;
	}

	public Boolean isUsed() {
		return lock.isLocked();
	}

	public void use() {
		lock.lock();
	}
	
	public void release()
	{
		lock.unlock();
	}
	
	public String getName()
	{
		return name;
	}
	
	
}
