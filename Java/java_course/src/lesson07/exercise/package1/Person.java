package lesson07.exercise.package1;

public class Person {

	// atributi

	String name;
	int age;
	long personalNumber;
	double weight;
	boolean isWoman;
	Person[] friends;
	double money;
	Car car;

	// construstors

	Person() {
		this.age = 0;
		this.weight = 4.0;

	}

	Person(String name, long personalNumber, boolean isWoman) {
		
		this();
		this.name = name;
		this.personalNumber = personalNumber;
		this.isWoman = isWoman;
		this.friends = new Person[3];

	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;

	}

	Person(String name, int age, double weight) {
		// this.name = name;
		// this.age=age;
		this(name, age); // this sochi construktora s parametri name i age ;
							// wikane na konstruktor w konstruktor
		this.weight = weight;
	}

	// ne moje da wikame konstruk w sebe si

	Person(String name, int age, double weight, boolean isWoman, Person friend) {

		this.name = name; // this always refers to the current object
		this.age = age;
		this.weight = weight;
		this.isWoman = isWoman;
		//this.friends = friend;
	}

	// methods
	void buyCar(Car car){
		if(this.money>car.getPrice()){
			this.car=car;
		}
	}
	

	
	int getFriendsNumber (){
		int number=friends.length;
		return number;
	}

	void eat() {
		System.out.println("Eating ..");
	}

	void walk() {
		System.out.println(name + " is walking");
	}

	void growUp() {
		age++;
	}

	void drink(double liters) {
		if (liters > 1) {
			System.out.println("Don't drink too much");
		} else {
			System.out.println("mmmm");
		}
	}
}
