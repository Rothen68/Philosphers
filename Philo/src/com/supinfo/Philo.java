package com.supinfo;

import com.supinfo.philosophers.Philosopher;

public class Philo {

	public static void main(String[] args) {
		
		Philosopher [] philoTab = new Philosopher[5];
		
		philoTab[0] = new Philosopher("Platon");
		philoTab[1] = new Philosopher("Aristote");
		philoTab[2] = new Philosopher("Descartes");
		philoTab[3] = new Philosopher("Socrate");
		philoTab[4] = new Philosopher("Nietzsche");
		
		for(int i = 0 ; i < philoTab.length ; i++)
		{
			philoTab[i].start();
		}
		
		try {
			
			Thread.sleep(60 * 1000);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			
		}
		finally
		{
			for(int i = 0 ; i < philoTab.length ; i++)
			{
				philoTab[i].interrupt();
			}
		}
		
	}
}
