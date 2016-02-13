package lesson22;

public class NewRunnableTest {
public static void main(String[] args) {
	MyNewRunnable r1=new MyNewRunnable();
	Thread t1=new Thread(r1);
	
	MyNewRunnable r2=new MyNewRunnable();
	Thread t2=new Thread(r2);
	
	MyNewRunnable r3=new MyNewRunnable();
	Thread t3=new Thread(r3);
	
	MyNewRunnable r4=new MyNewRunnable();
	Thread t4=new Thread(r4);
	
	MyNewRunnable r5=new MyNewRunnable();
	Thread t5=new Thread(r5);
	
	t1.start(); // start inicializira niva nishka i wika run();	
	t2.start();
	t3.start();
	t4.start();
	t5.start();
	
	try {
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	System.out.println("All threads are dead");
}
}
