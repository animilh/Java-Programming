package lesson16;

public class CarDemo {
	
	public static void main(String[] args) {
		Car c = new Car();
		Car.Engine e=c.new Engine();		
		c.printCarPower();
		e.power=200;
		c.printCarPower();
	}

}
