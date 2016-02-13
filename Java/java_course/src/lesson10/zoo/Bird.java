package lesson10.zoo;

public class Bird extends Animal {
	 
	String name;
	
	Bird(String name){
	   this.name=name;
	}
	
	public void makeSomeNoise(){
		System.out.println("The bird is making: Graaaa Graaaa");
	}
	
	void sing(){
		System.out.println("The bird is singing....");
	}
	
}
