package hw08;

public class GSM {

	// attributes

	private String model;
	private boolean hasSimCard; // if has a sim card
	private String simMobileNumber; // number from sim card
	private double outgoingCallsDuration; // total minutes outgoing calls
	private Call lastIncomingCall; // last incoming call
	private Call lastOutgoingCall; // last outgoing call

	// constructor

	GSM(String model) {
		setModel(model);
	}

	// methods

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		if(!"".equals(model)){
		//if (!model.equals("") || model != null) {
			this.model = model;
		}
	}

	public boolean isHasSimCard() {
		return hasSimCard;
	}

	public void setHasSimCard(boolean hasSimCard) {
		this.hasSimCard = hasSimCard;
	}

	public String getSimMobileNumber() {
		return simMobileNumber;
	}

	public double getOutgoingCallsDuration() {
		return outgoingCallsDuration;
	}

	public void setOutgoingCallsDuration(double outgoingCallsDuration) {
		this.outgoingCallsDuration = outgoingCallsDuration;
	}

	public Call getLastIncomingCall() {
		return lastIncomingCall;
	}

	public void setLastIncomingCall(Call lastIncomingCall) {
		if(lastIncomingCall==null){
			System.out.println("Bad input for last incoming call");
		}
		this.lastIncomingCall = lastIncomingCall;
	}

	public Call getLastOutgoingCall() {
		return lastOutgoingCall;
	}

	public void setLastOutgoingCall(Call lastOutgoingCall) {
		if(lastOutgoingCall==null){
			System.out.println("Bad input for last outgoing call");
		}
		this.lastOutgoingCall = lastOutgoingCall;
	}

	public boolean correctSimMobileNumber() {
		return (this.simMobileNumber.length() == 10 && this.simMobileNumber
				.substring(0, 2).equals("08"));
	}

	public void setSimMobileNumber(String simMobileNumber) {
		if (!simMobileNumber.equals("") || simMobileNumber != null) {
			this.simMobileNumber = simMobileNumber;
		} else {
			System.out.println("Bad input for mobile number");
		}
	}

	public void insertSimCard(String simMobileNumber) {
		if (simMobileNumber == null) {
			System.out.println("Incorrect mobile number");
			return; // ako parametyra kojto se podawa e null izvejdame
					// syobshtenie i izlizame ot nego
		}
		if (simMobileNumber.length() != 10
		// || !simMobileNumber.substring(0, 2).equals("08")) {
				|| !simMobileNumber.startsWith("08")) {
			System.out.println("Incorrect mobile number");
		} else {
			setSimMobileNumber(simMobileNumber);
			setHasSimCard(true);
			System.out.println("Number " + this.simMobileNumber
					+ " is inserted to " + this.model);
		}
	}

	public void removeSimCard() {
		this.hasSimCard = false;
	}

	public void Call(GSM reciever, double duration) {
		if (this.simMobileNumber != null && reciever.simMobileNumber != null) {
			if (!this.correctSimMobileNumber()
					|| !reciever.correctSimMobileNumber()) {
				System.out.println("Incorrect mobile number");
			} else {

				if (this.hasSimCard && reciever.hasSimCard
						&& this.simMobileNumber != reciever.simMobileNumber) {
					if (Call.checkDuration(duration)) {
						Call c = new Call(this, reciever, duration);
						// this.lastOutgoingCall = c;
						// reciever.lastIncomingCall = c;
						this.setLastOutgoingCall(c);
						reciever.setLastIncomingCall(c);

						this.outgoingCallsDuration += duration;

						this.printInfoForTheLastOutgoingCall();
					}
				}
			}
		} else {
			System.out.println("Bad input for Mobile numbers");
		}

	}

	public double getSumForCall() {
		return this.outgoingCallsDuration
				* this.lastOutgoingCall.getPriceForAMinute();
	}

	public void printInfoForTheLastOutgoingCall() {
		System.out.println("Last outgoing call:");
		System.out.println("Price for a minute "
				+ this.lastOutgoingCall.getPriceForAMinute());
		System.out.println("Caller "
				+ this.lastOutgoingCall.getCaller().simMobileNumber);
		System.out.println("Reciever "
				+ this.lastOutgoingCall.getReciever().simMobileNumber);
		System.out.println("Duration " + this.lastOutgoingCall.getDuration());
		System.out.println();
	}

	public void printInfoForTheLastIncomingCall() {
		System.out.println("Last incoming call:");
		System.out.println("Price for a minute "
				+ this.lastIncomingCall.getPriceForAMinute());
		System.out.println("Caller "
				+ this.lastIncomingCall.getCaller().simMobileNumber);
		System.out.println("Reciever "
				+ this.lastIncomingCall.getReciever().simMobileNumber);
		System.out.println("Duration " + this.lastIncomingCall.getDuration());
		System.out.println();
	}

}
