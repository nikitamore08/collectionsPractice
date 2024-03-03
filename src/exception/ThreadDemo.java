package exception;

public class ThreadDemo extends Thread {

	private int threadNumber;

	public ThreadDemo(int tn) {
		threadNumber = tn;
	}

	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("From Thread" + threadNumber + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) throws Exception {

		ThreadDemo td = new ThreadDemo(1);
		// td.start();
		td.run();
		ThreadDemo td2 = new ThreadDemo(2);
		td2.run();
		if (true) {
			throw new Exception();
		}
		// td2.run();

	}

}
