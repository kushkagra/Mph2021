package java8eg;

public class LambEg {
	
	public static void main(String args[]) {
		//Java 7 syntax
		MyTaskThread mt = new MyTaskThread();
		Thread t = new Thread(mt);
		t.start();
		
		//Java 7 syntax-1
		Runnable mt1 = new MyTaskThread();
		Thread t1 = new Thread(mt1);
		t1.start();
		
		//Anonymous class
		//Java 7 syntax-2
		Runnable mt2 = new Runnable() {
			
			@Override
			public void run() {
				
				Task t =new Task();
				t.print();
				
			}
		};
		Thread t2 = new Thread(mt2);
		t2.start();
		
		//Java 8 syntax
		Runnable rr=() -> {
			Task t4 =new Task();
			t4.print();
		};
		Thread t3 = new Thread(rr);
		t3.start();
		
		//Java 8 syntax-1
		Thread t4 = new Thread(() ->{
			Task t5 =new Task();
			t5.print();
		});
		t4.start();
		
		//Java 8 syntax-2
		new Thread(() ->{
			Task t5 =new Task();
			t5.print();
		}).start();
		
		//Java 8 syntax-3
		new Thread(() ->{
			new Task().print();
		}).start();
		
		//Java 8 syntax-4
		new Thread(() ->new Task().print()).start();
		
		//Java 8 syntax-5
		//Method reference
		new Thread(new Task()::print).start();
		
	}

}
