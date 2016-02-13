package lesson10.zoo;

public class Zoo {

	private static final int NUM_CAGES = 10;
	private Animal[] animals;

	Zoo() {
		animals = new Animal[NUM_CAGES];
	}

	public void addAnimal(Animal newAnimal) {
		if (newAnimal == null) {
			System.out.println("Bad input for animal");
			return;
		}

		for (int i = 0; i < animals.length; i++) {
			if (animals[i] == null) {
				animals[i] = newAnimal;
				System.out.println("Animal " + animals[i] + " is added.");
				return;
			}

		}

	}

	public Animal[] getAnimals() {
		return animals;
	}

	public void setAnimals(Animal[] animals) {
		this.animals = animals;
	}
}
