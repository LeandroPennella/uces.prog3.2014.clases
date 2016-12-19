package Threads;
import java.util.Random;


//public class MiThread extends Thread 
public class MiThread implements Runnable
{
	int nThread;
	int i=0;
	public MiThread(int numeroThread){this.nThread=numeroThread;}
	@Override
	public void run()
	{
		System.out.println(" - inicio t"+this.nThread);
		try 
		{
			Random rn = new Random();
			i=rn.nextInt(2000 + 1);
			Thread.sleep(i);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(" - interrupcion t"+this.nThread);
		}
		System.out.println(" - fin t"+this.nThread +" - "+i+"ms");
	}
}
