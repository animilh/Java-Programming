package lesson22;

public class StopTest {
public static void main(String[] args) {
	Thread t=new Thread((Runnable) new ThreadStop());
}
}
