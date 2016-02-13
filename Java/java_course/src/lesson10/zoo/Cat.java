package lesson10.zoo;

public class Cat extends Animal {
	
	String name;
	
	public Cat(String name){
		this.name=name;
	}
	
	void climb() {
		System.out.println("Climbing...");
	}

	public void makeSomeNoise() {
		System.out.println("Myal myal...");
	}
	
	
	public void walk() {
		System.out.println("Cat "+this.name+" Walking...");
	}
}
