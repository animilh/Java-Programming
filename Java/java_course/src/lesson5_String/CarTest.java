package lesson5_String;

public class CarTest {
	public static void main(String[] args) {
	//	Person owner=new Person();
		Person carOwner=new Person();
		carOwner.name="Ivan";
		carOwner.age=30;
		
		Car peugeot = new Car();
		Car lada = new Car();

		peugeot.color = "Grey";
		peugeot.currentGear = 4;
		peugeot.currentSpeed = 60;
		peugeot.maxSpeed = 150;
		peugeot.model = "306";
		peugeot.owner=carOwner;

		lada.color = "Red";
		lada.currentGear = 5;
		lada.currentSpeed = 90;
		lada.maxSpeed = 120;
		lada.model = "Niva";
		lada.owner=carOwner;

		lada.currentSpeed = 60;
		lada.currentGear = 2;
		
		//lada.owner.name = "Ivajlo";
		//lada.owner.age = 39;

//		System.out.println("My car is " + lada.color
//				+ " color. I am driving with " + lada.currentSpeed
//				+ " km. per hour on " + lada.currentGear + " gear.");
		
		lada.accelerate();
		lada.changeGearUp();
	  System.out.println("The gear of lada is "+lada.currentGear);
	  lada.changeGear(5);
	  System.out.println("The gear of lada is "+lada.currentGear);
	  lada.chandeGearDown();
	  System.out.println("The gear of lada is "+lada.currentGear);
	  lada.changeColor("green");
	  System.out.println("The color of lada is "+lada.color);
		
//		System.out.println("The owner of lada Niva is " + lada.owner.name
//				+ ". He is " + lada.owner.age + " years old.");
	}
}