package com.supinfo;

import com.supinfo.philosophers.DiningTable;
import com.supinfo.philosophers.Philosopher;

public class Philo {

	public static void main(String[] args) {
		DiningTable table = new DiningTable();

		table.startDining();		
		try {
			
			Thread.sleep(60 * 1000);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
					}
		finally
		{
			table.stopDining();
		}
		
	}
}
