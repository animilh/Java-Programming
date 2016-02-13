package lesson13;

public class SoftAcadException extends Exception {
	
	private static final long serialVersionUID = 9050827141391950483L;
	private long time;
	
	SoftAcadException(){
		super();
	}
	
	SoftAcadException(String message,Throwable cause){
		super(message,cause);
	}
	
	SoftAcadException(String message){
		super(message);
	}
	
	SoftAcadException(Throwable cause){
		super(cause);
	}
	
	public long getTime(){
		return this.time;
	}
	
	public void setTime(long newTime){
		this.time=newTime;
	}

}
