package lesson07.exercise.statics;

public class StaticDemo {
	public static void main(String[] args) {
		Car c1=new Car();
		Car c2=new Car();
		Car c3=new Car();
		
		System.out.println(Car.carsCreated);
	}

}
