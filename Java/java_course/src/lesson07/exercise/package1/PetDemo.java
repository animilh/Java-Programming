package lesson07.exercise.package1;


public class PetDemo {
	
	public static void main(String[] args) {
		
		Person pesho=new Person("Pesho",17) ;
		Person dido=new Person("Dido",20);		
		Pet p=new Pet(pesho);
		p.owner.age=30;
	    p.owner=dido;
				   
		System.out.println("The name of pet is "+p.name);
		System.out.println("The name of owner is " +pesho.name+". He is "+pesho.age+" years old.");
		
//		final String s="Pirin";
//		s = s.replace("P", "Asp");
	
		
}
	
}
