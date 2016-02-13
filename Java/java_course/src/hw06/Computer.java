package hw06;

public class Computer {

	// attributes

	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;

	// constructors

	Computer() {

		this.isNotebook = false;
		this.operationSystem = "Win XP";
	}

	Computer(int year, double price, double hardDiskMemory, double freeMemory) {

		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}

	Computer(int year, double price, boolean isNotebook, double hardDiskMemory,
			double freeMemory, String operationSystem) {

		this(year, price, hardDiskMemory, freeMemory);
		this.isNotebook = isNotebook;
		this.operationSystem = operationSystem;
	}

	// methods

	int comparePrice(Computer c) {
    if (c==null){ 
    	System.out.println("Can't compare null to price!");
    	return -3;
    }
    else{
		if (this.price == c.price) {
			return 0;
		} else {
			if (this.price > c.price) {
				return -1;
			} else {
				return 1;
			}
		}
	}
	}

	void changeOperationSystem(String newOperationSystem) {
		this.operationSystem = newOperationSystem;
	}

	void useMemory(double memory) { // memory is parameter

		if (memory > freeMemory) {
			System.out.println("Not enough free memory!");
		} else {
			freeMemory -= memory;
		}

	}

}
