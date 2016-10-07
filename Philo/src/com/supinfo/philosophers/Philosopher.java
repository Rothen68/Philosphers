package com.supinfo.philosophers;

public class Philosopher extends Thread implements Runnable {

	private String name;
	
	public Philosopher(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		while(!Thread.interrupted())
		{
			try
			{
				think();
				eat();
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
		System.out.println("Philosopher " + name + " is eating" );
		sleep(random());
	}
	
	private int random ()
	{
		return (int) Math.random() * 7000 + 1000; 
	}

}
