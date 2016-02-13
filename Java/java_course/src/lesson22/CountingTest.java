package lesson22;

public class CountingTest {
public static void main(String[] args) {
	Thread t1=new Thread(new CountringThread("Thread 1"));
	Thread t2=new Thread(new CountringThread("Thread 2"));
	
	t1.start();
	t2.start();
}
}
