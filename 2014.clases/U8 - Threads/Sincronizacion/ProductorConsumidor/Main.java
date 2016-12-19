package ProductorConsumidor;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Queue<Integer> items=new LinkedList<Integer>();
		/*
		Productor p=new Productor(items);
		Consumidor c=new Consumidor(items);
		p.start();
		c.start();
		p.join();
		c.join();
		*/
		List<Productor> productores=new ArrayList<Productor>();
		List<Consumidor> consumidores=new ArrayList<Consumidor>();
		for (int i=0;i<10;i++){productores.add(new Productor(items,i));}
		for (int i=0;i<10;i++){consumidores.add(new Consumidor(items,i));}		


		for(Productor p:productores)
		{
			p.start();
		}
		for(Consumidor c:consumidores)
		{
			c.start();
		}

		
		for(Productor p:productores)
		{
			p.join();
		}
		for(Consumidor c:consumidores)
		{
			c.join();
		}		
		System.out.println("Fin");
		
	}

}
