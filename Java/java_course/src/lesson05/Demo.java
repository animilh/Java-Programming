package lesson05;

public class Demo {
	
	public static void main(String[] args) {
		
	
	
	Person pesho=new Person("Peshxo",27,75,false);
	Person ivan=new Person("Ivan",30,80);
	ivan.age = 89;
	pesho = ivan;

	pesho.age = 90;

	System.out.println("Ivan's age "+ivan.age);
	System.out.println("Pesho's age "+pesho.age);
	
	Car bmw =new Car("503",300,120,"red",5,ivan);
    Car opel=new Car("Agila",200,80,"green",5,pesho);
    
    bmw.price=20600;
    opel.price=13000;
    System.out.println("BMW is more expensive? "+bmw.isMoreExpensive(opel));
    System.out.println("The price of car bmw for scrub is "+bmw.calculateCarPriceForScrap(50));
}
}
