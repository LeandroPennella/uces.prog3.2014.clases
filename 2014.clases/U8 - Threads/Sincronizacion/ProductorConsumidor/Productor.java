package ProductorConsumidor;

import java.util.Queue;
import java.util.Random;

public class Productor extends Thread
{
	private Queue<Integer> items;
	private int idProductor;
	private static final int MAX=10;
	private Random r=new Random();
	private static final int TOTAL=100;
	public Productor(Queue<Integer> items, int idProductor){this.items=items;this.idProductor=idProductor;}
	public void run()
	{
		try
		{
			for(int i=0;i<TOTAL;i++)
			{
				int producido=r.nextInt(100);

				synchronized(items)
				{
					//if(items.size()>=MAX) //o1
					while(items.size()>=MAX) //o2
					{
						items.wait();
					}
					items.add(producido);
					System.out.println("prod:" + this.idProductor+" - "+ producido);					
					//items.notify();//o1
					items.notifyAll();//o2
				}
			}			
		}
		catch (InterruptedException e)
		{System.out.println("me interrumpieron");}
	}
}
