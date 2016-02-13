package lesson21;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
 public static void main(String[] args) {
	 
		Cages<Animal> animals=new Cages<Animal>();
		Animal lion=new Mammal();
		Animal wolf=new Mammal();
		Animal eagle=new Bird();
		Animal garga=new Bird();
		
		animals.add(lion);
		animals.add(wolf);
		animals.add(eagle);
		System.out.println(animals.isContained(garga));
		for (Animal a : animals.animals)
		System.out.println(a);
		// ako nqma warning e ok ako ima moje i da ne raboti wyw wsichki sluchai
		
	//	generics syshtestwuwat samo w kompilation time, a ne w runtime-a, zatova e dobre da se obryshta wnimanie na greshkite
		
}
}
