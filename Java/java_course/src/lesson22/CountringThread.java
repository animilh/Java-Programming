package lesson22;

public class CountringThread implements Runnable {
 private String name;
	public CountringThread(String string) {
		this.name=string;
	// TODO Auto-generated constructor stub
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<10;i++){
			count=incrCounter(count);
			System.out.println(this.name+" : "+count);
		}
		
	}
	 int incrCounter(int count) {
		// TODO Auto-generated method stub
		return ++count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
