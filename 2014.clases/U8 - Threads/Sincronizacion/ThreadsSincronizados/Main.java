package ThreadsSincronizados;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws InterruptedException 
	{
		Contador c=new Contador();
		List<Incrementador>incrementadores=new ArrayList<Incrementador>();
		for(int i=0;i<5;i++)
		{
			 incrementadores.add(new Incrementador(c));
		}
		
		for(Incrementador i:incrementadores)
		{
			i.start();
		}
		
		for(Incrementador i:incrementadores)
		{
			i.join();
		}
		
		System.out.println(c.dameActual());

	}
}
