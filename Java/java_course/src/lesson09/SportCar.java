package lesson09;

public class SportCar extends Car {
	
	//attributes
	
	boolean isCabriolet;
	double price;
	
	//constructor
	
	SportCar(String model, boolean isSportCar,String color,boolean isCabriolet, double price){
		super(model,isSportCar,color);
		this.isCabriolet=isCabriolet;
		this.price=price;
	}
	
	//methods
	
	void startEngine(){
		super.startEngine();
		switchTurbo(true);
		
	}

	 void switchTurbo(boolean b) {
		// TODO Auto-generated method stub
	}

	public boolean isCabriolet() {
		return isCabriolet;
	}

	public void setCabriolet(boolean isCabriolet) {
		this.isCabriolet = isCabriolet;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
