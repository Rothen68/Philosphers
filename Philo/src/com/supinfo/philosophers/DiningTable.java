package com.supinfo.philosophers;



public class DiningTable {

	private Fork[] forkTab;
	
	private Philosopher[] philoTab;

	public DiningTable() {
		forkTab = new Fork[5];
		for (int i = 0 ; i < forkTab.length ; i++)
		{
			forkTab[i] = new Fork("Fork " + i);
		}
		
		philoTab = new Philosopher[5];
		
		philoTab[0] = new Philosopher("Platon",forkTab[0],forkTab[1]);
		philoTab[1] = new Philosopher("Aristote",forkTab[1],forkTab[2]);
		philoTab[2] = new Philosopher("Descartes",forkTab[2],forkTab[3]);
		philoTab[3] = new Philosopher("Socrate",forkTab[3],forkTab[4]);
		philoTab[4] = new Philosopher("Nietzsche",forkTab[4],forkTab[0]);
	}
	
	public void startDining()
	{
		for(int i = 0 ; i < philoTab.length ; i++)
		{
			philoTab[i].start();
		}
	}
	
	public void stopDining()
	{
		for(int i = 0 ; i < philoTab.length ; i++)
		{
			philoTab[i].interrupt();
		}
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		stopDining();
	}
	
	
	
	
}
