package lesson10.zoo;

public class Dog extends Animal {
	boolean isDangerous;
      String name;
	
	public Dog(String name){
		this.name=name;
	}

	void bringStick() {
		System.out.println("Bringing the stick...");
	}

	public void makeSomeNoise() {
		System.out.println("Bau bau...");
	}
	public void walk() {
		System.out.println("Dog " +this.name+" Walking...");
	}
}
