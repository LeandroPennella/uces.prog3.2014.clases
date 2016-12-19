package ProductorConsumidor;

import java.util.Queue;

public class Consumidor extends Thread {
	private Queue<Integer> items;
	private int idConsumidor;
	// private static final int MAX=10;
	// private Random r=new Random();
	private static final int TOTAL = 100;

	public Consumidor(Queue<Integer> items,int idConsumidor) {
		this.items = items;
		this.idConsumidor=idConsumidor;
	}

	public void run() {
		for (int i = 0; i < TOTAL; i++) {
			try {
				synchronized (items) {
					while(items.size() < 1) {
						items.wait();
					}
					System.out.println("cons "+this.idConsumidor+ " :"+items.remove());
					items.notifyAll();
				}
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("me interrumpieron");
			}
		}

	}
}
