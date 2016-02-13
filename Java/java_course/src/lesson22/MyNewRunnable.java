package lesson22;

public class MyNewRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
	for(int i=1;i<=5;i++){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(i);
		
	}
	}
	
	
	

}
