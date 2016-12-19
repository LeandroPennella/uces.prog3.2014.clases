package Threads;

public class MainThread 
{
	public static void main(String[] args) 
	{
		
		MiRunnable r1=new MiRunnable(1);

		Thread t1=new Thread(r1);
		Thread t2=new Thread(r1);
		Thread t3=new Thread(r1);
		Thread t4=new Thread(r1);
		Thread t5=new Thread(r1);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		try {
			Thread.sleep(3000);
			t1.interrupt();
			t2.interrupt();
			t3.interrupt();
			t4.interrupt();
			t5.interrupt();
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
			
		} 
		catch (InterruptedException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(r1.getContador());

	}
		
	
		
		
		

	public static void main2(String[] args)
	{
		MiRunnable r1=new MiRunnable(1);
		MiRunnable r2=new MiRunnable(2);
		MiRunnable r3=new MiRunnable(3);
		MiRunnable r4=new MiRunnable(4);
		MiRunnable r5=new MiRunnable(5);
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		Thread t3=new Thread(r3);
		Thread t4=new Thread(r4);
		Thread t5=new Thread(r5);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		try {
			Thread.sleep(3000);
			t1.interrupt();
			t2.interrupt();
			t3.interrupt();
			t4.interrupt();
			t5.interrupt();
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
			
		} 
		catch (InterruptedException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(r1.getContador()+r2.getContador()+r3.getContador()+r4.getContador()+r5.getContador());
		
		
	}
		
		/*
		MiThread r1=new MiThread(1);
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r1);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("fin main");
		*/
		/*
			MiThread m1=new MiThread(1);
			MiThread m2=new MiThread(2);
			MiThread m3=new MiThread(3);
			m1.start();
			m2.start();
			m3.start();
			
//			mt.interrupt(); //interrumpe solo si mt tiene sleep
			
			try 
			{
				m1.join();
				m2.join();
				m3.join();
				System.out.println("join");
			}
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				System.out.println("join_int");
			}
			System.out.println("fin main");
			*/

}