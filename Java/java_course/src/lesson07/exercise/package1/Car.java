package lesson07.exercise.package1;

public class Car {
	
	//atributi po prawilo sa private
	
private	String model;
private int maxSpeed;
private int currentSpeed;
private	String color;
private int currentGear;
private	double price;

// Getter & Setter - pravim publik methodi za get i set 
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getMaxSpeed() {
	return maxSpeed;
}
public void setMaxSpeed(int maxSpeed) {
	this.maxSpeed = maxSpeed;
}
public int getCurrentSpeed() {
	return currentSpeed;
}
public void setCurrentSpeed(int currentSpeed) {
	this.currentSpeed = currentSpeed;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getCurrentGear() {
	return currentGear;
}
public void setCurrentGear(int currentGear) {
	this.currentGear = currentGear;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

	// constructors

	

}
