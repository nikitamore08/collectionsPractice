package multithreading;

public class Test1 extends Thread {
	
	int t;
	Test1(int t)
	{
		this.t=t;
	}
	
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Thread Running"+" :"+t+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String args[]) throws InterruptedException {

		Test1 t = new Test1(1);//---thread1
		t.start();
		//Thread.sleep(10000);
		Test1 t1 = new Test1(2);//----thread2
		t1.start();
		
		
		
	}
}
