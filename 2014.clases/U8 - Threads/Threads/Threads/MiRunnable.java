package Threads;

public class MiRunnable implements Runnable {
	int instancia;
	private int contador;
	
	public MiRunnable(int instancia){this.instancia=instancia;setContador(0);}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++)
		{
			
			//contador++;
			int x=contador;
			x=x+1;
			contador=x;
			//System.out.println("r"+this.instancia+" - c:"+getContador());
		}
		/*
		try 
		{
			while(true)
			{
				Thread.sleep(1);
				setContador(getContador() + 1);
				System.out.println("r"+i+" - c:"+getContador());
			}
		} 
		
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			System.out.println("r"+i+" termino en "+getContador());
		}
		*/
	}
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}
	

}
