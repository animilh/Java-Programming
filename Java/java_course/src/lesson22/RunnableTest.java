package lesson22;

public class RunnableTest {
public static void main(String[] args) {
//	MyRunnable m=new MyRunnable();
//	m.run();
//	FIRST
//	MyThread t=new MyThread();
//	t.start();
	
//	SECOND
	MyRunnable r=new MyRunnable();
	Thread t=new Thread(r);
	t.start(); // start inicializira niva nishka i wika run();	
	
	System.out.println("End of main");
}
}
