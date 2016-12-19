package ThreadsSincronizados;

public class Contador {
	private int contador;
	
	//public void incrementar() 			//op1
	public synchronized void incrementar()
	{
		//synchronized (this)				//op1
		{
			int x=this.contador+1;
			Thread.yield();					//le sugiere al so que siga con otro
			this.contador=x;
		}
	}
	public int dameActual()
	{
		return this.contador;
	}

}
