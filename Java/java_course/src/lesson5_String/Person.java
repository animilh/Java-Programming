package lesson5_String;

public class Person {
	
	String name;
	int age;
	double weght;
	boolean isWoman;
	Person friend;
	
	void eat(){
		System.out.println("Eating ..");
	}
	void walk(){
		System.out.println(name+" is walking");
	}
	void growUp(){
		age++;
	}
	void drink(double liters){
		if(liters>1){System.out.println("Don't drink too much");
		} else { System.out.println("mmmm");
		}
	}
}
