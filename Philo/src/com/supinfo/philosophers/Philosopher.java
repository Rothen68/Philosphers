package com.supinfo.philosophers;

public class Philosopher extends Thread implements Runnable {

	private String name;
	
	private Fork leftFork;
	private Fork rightFork;
	
	public Philosopher(String name, Fork left, Fork right) {
		this.name = name;
		leftFork = left;
		rightFork = right;
	}
	
	@Override
	public void run() {
		while(!Thread.interrupted())
		{
			try
			{
				if(!leftFork.isUsed() && !rightFork.isUsed())
				{
					leftFork.use();
					rightFork.use();
					eat();
					leftFork.release();
					rightFork.release();
				}
				think();
			}
			catch ( InterruptedException ex)
			{
				return;
			}
		}

	}
	
	private void think()throws InterruptedException
	{
		System.out.println("Philosopher " + name + " is thinking" );
		sleep(random());
	}
	
	private void eat() throws InterruptedException
	{
		System.out.println("Philosopher " + name + " is eating with " + leftFork.getName() + " and " + rightFork.getName() );
		sleep(random());
		System.out.println("Philosopher " + name + " stops eating");
	}
	
	private int random ()
	{
		return (int) Math.random() * 7000 + 1000; 
	}

}
