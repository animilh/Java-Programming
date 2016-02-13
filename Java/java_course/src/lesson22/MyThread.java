package lesson22;

public class MyThread extends Thread { // 1 n-n nasledqwame klasa Thread ne e preporychitelen
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=1;
		for(i=2;i<10;i++){
			System.out.println("Method run "+i);
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
}
