package lesson07.exercise.package2;

import hw09.Person;
import lesson07.exercise.package1.Pet;

public class PetDemo {
	public static void main(String[] args) {
		Person pesho=new Person("Pesho",17,true) ;
		Pet p=new Pet(pesho);
		  String newName="Petyr";
		 p.setName(p.name.substring(0, 3));
				   
		System.out.println("The name of pet is "+p.name);
		
		final String s="Pirin";
		s = s.replace("P", "Asp");
	
		
}
	
}
