package lesson22;

public class ThreadSleepTest {
public static void main(String[] args) {
	for(int i=0;i<10;i++){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Counting ... "+i);
	}
}
}
