package ThreadsSincronizados;

public class Incrementador extends Thread 
{
	private Contador contador;
	public Incrementador(Contador esteContador) 
	{
		this.contador = esteContador;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) 
		{
			try 
			{
				//synchronized (contador) 
				{
					contador.incrementar();
				}
				Thread.sleep(50);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println("me interrupieron");
			}
		}
	}
}
