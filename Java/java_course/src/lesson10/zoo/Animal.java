package lesson10.zoo;

public abstract class Animal {
	private int age;
	private double weight;

	public void breathe() {
		System.out.println("Breathing...");
	}

	public void walk() {
		System.out.println("Animal Walking...");
	}

	public abstract void makeSomeNoise(); // neznaem kakyw zvyk shte izdawa wsqko jivotno => abstracten method
}