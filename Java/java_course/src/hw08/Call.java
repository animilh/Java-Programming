package hw08;

public class Call {

	private static double priceForAMinute;
	private static final int MIN_CALL_DUR = 0;
	private static final int MAX_CALL_DUR = 120;
	private GSM caller;
	private GSM reciever;
	private double duration;

	// constructor

	Call(GSM caller, GSM reciever, double duration) {
		setCaller(caller);
		setReciever(reciever);
		setDuration(duration);
	}

	// methods

	public static double getPriceForAMinute() {
		return priceForAMinute;
	}

	public static void setPriceForAMinute(double priceForAMinute) {
		if(priceForAMinute<0){
			System.out.println("Bad input for price for a minute");
		}
		Call.priceForAMinute = priceForAMinute;
	}

	public GSM getCaller() {
		return caller;
	}

	public void setCaller(GSM caller) {
		if (caller != null) {
			this.caller = caller;
		} else {
			System.out.println("Bad input for caller");
		}
	}

	public GSM getReciever() {
		return reciever;
	}

	public void setReciever(GSM reciever) {
		if (reciever != null) {
			this.reciever = reciever;
		} else {
			System.out.println("Bad input for reciever");
		}
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		if (this.duration >= MIN_CALL_DUR && this.duration <= MAX_CALL_DUR)
			this.duration = duration;
	}

	public static boolean checkDuration(double duration) {
		return (duration >= MIN_CALL_DUR && duration <= MAX_CALL_DUR);
	}

}
