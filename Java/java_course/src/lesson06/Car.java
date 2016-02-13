package lesson06;

public class Car {
	
	//atributi
	
	String model;
	int maxSpeed;
	int currentSpeed;
	String color;
	int currentGear;
	// Person owner=new Person();
	Person owner;
	
	boolean isSportsCar; 
	double price;

	// constructors

	Car() {

	}
	
	Car (String model, boolean isSportsCar, String color){
		this.model=model;
		this.isSportsCar=isSportsCar;
		this.color=color;
	}

	Car(String model, int maxSpeed, int currentSpeed, String color,
			int currentGear, Person owner) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.currentSpeed = currentSpeed;
		this.currentGear = currentGear;
		this.color = color;
		this.owner = owner;
	}
	
	Car(String model,boolean isSportsCar, String color, double price, int maxSpeed ){
		
		this(model,isSportsCar,color);
		if (this.isSportsCar){
			this.currentSpeed=maxSpeed;
		} else {
			if(this.maxSpeed>200){
				currentSpeed=200;
			}
		}
		
		this.price=price;
		
	}
	
	void changeOwner(Person newOwner){
		this.owner=newOwner;
	}
	
	boolean isMoreExpensive(Car car){
		
		return this.price>car.price;
		
//		if (this.price>car.price){
//			return true;
//		} 
//		else {
//			return false;
//		}
	}
	
	double calculateCarPriceForScrap(double metalPrice){
		
		double coef=0.2;
		
		if (this.color.equals("black")||this.color.equals("white")){
			coef+=0.05;
		}
		
		if(this.isSportsCar){
			coef+=0.05;
		}
		return metalPrice*coef;
	}

	void accelerate() {
		System.out.println("Accelerating ...");
	}

	void changeGearUp() {
		if ((currentGear >= 1) && (currentGear < 5)) {
			currentGear++;
		}
	}

	void chandeGearDown() {
		if ((currentGear > 1) && (currentGear <= 5)) {
			currentGear--;
		}
	}

	void changeGear(int nextGear) {
		if (nextGear < 1 || nextGear > 5) {
			System.out.println("Beep");
		}
		// 1. currentGear=nextGear;
		for (int i = currentGear; i <= nextGear; i++) {
			changeGearUp();// vikane na method v method
		}
	}

	void changeColor(String newColor) {
		color = newColor;
	}

}
