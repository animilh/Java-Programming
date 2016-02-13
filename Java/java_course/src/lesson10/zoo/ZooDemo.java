package lesson10.zoo;

public class ZooDemo {
	
	public static void main(String[] args) {
		Cat c=new Cat("Siamska kotka");
		Dog d=new Dog("Nemska ovcharka");
		Animal a=new Dog("Pudel"); // reference of abstract class(interface) can be initialized with instance of a class that implements the abstract class(interface) 
		Bird b1=new Bird("Garga");
		Bird b2=new Bird("Slawejche");
		
		Zoo zoo=new Zoo();
		zoo.addAnimal(c);
		zoo.addAnimal(d);
		zoo.addAnimal(a);
		zoo.addAnimal(b1);
		zoo.addAnimal(b2);
		
		for(int i=0;i<zoo.getAnimals().length;i++){
			if(zoo.getAnimals()[i]!=null){
				Animal current=zoo.getAnimals()[i];
				current.walk();
				current.makeSomeNoise();
				
				if(current instanceof Bird){ // Casting is unsafe operation and it's good to check if the reference refer to an instance of the right class using instanceof operator
//					((Bird)current).sing();
					Bird birdInTheZoo=(Bird) current;
					birdInTheZoo.sing();
				}
				
			}
			
		}
		
		Animal myDog=new Dog("Kuche 2");
		if(myDog instanceof Dog){
		((Dog)myDog).bringStick(); // shtom cast-vame vinagi prawim proverka predi tova dali obekta e ot daden tip
		
		}
	}

}
