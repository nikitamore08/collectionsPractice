package multithreading;

public class Test3 implements Runnable{

	public static void main(String[] args) {
		
		Runnable() object = new Runnable()
		{
			@Override
			public void run() {
				System.out.println("Hello");
				
			}

		};
		
		Thread t=new Thread(object);
		t.start();
		
		
	}

	

}
