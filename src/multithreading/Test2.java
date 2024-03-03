package multithreading;

public class Test2 implements Runnable {

	int thread;

	Test2(int thread) {
		this.thread = thread;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 3; i++) {
			System.out.println("Thread:" + thread + i);
		}

	}

	public static void main(String args[]) {

		Runnable obj1 = new Test2(1);
		Runnable obj2 = new Test2(2);
		Thread t1 = new Thread(obj1);//
		Thread t2 = new Thread(obj2);
		t1.start();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}

		t2.start();

	}

}
