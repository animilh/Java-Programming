package hw05;

public class Computer {

   private int year;
   private	double price;
   private	boolean isNotebook;
   private	double hardDiskMemory;
   private	double freeMemory;
   private	String operationSystem;

	void changeOperationSystem(String newOperationSystem) {
		setOperationSystem(newOperationSystem);
	}

	void useMemory(double memory) { // memory is parameter

		if (memory > freeMemory) {
			System.out.println("Not enough free memory!");
		} else {
			freeMemory -= memory;
		}

	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isNotebook() {
		return isNotebook;
	}

	public void setNotebook(boolean isNotebook) {
		this.isNotebook = isNotebook;
	}

	public double getHardDiskMemory() {
		return hardDiskMemory;
	}

	public void setHardDiskMemory(double hardDiskMemory) {
		this.hardDiskMemory = hardDiskMemory;
	}

	public double getFreeMemory() {
		return freeMemory;
	}

	public void setFreeMemory(double freeMemory) {
		this.freeMemory = freeMemory;
	}

	public String getOperationSystem() {
		return operationSystem;
	}

	public void setOperationSystem(String operationSystem) {
		if(operationSystem==null||operationSystem.equals("")){
			System.out.println("Bad input for operation system!");
			return;
		} else {	
		this.operationSystem = operationSystem;
	    }
	}
}
