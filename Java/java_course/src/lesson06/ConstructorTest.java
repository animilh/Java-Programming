package lesson06;

public class ConstructorTest {
	public static void main(String[] args) {

		Person p1 = new Person();
		Person p2 = new Person("Ivan", 23, 80, false, null);
		Person p3 = new Person("Petar", 30, 98, false, p2);
		p3=p2;  //референцията на п3 започва да сочи към п2
		p3.age=31;
		System.out.println("The age of "+p3.name+" is "+p3.age);
		System.out.println("The age of "+p2.name+" is "+p2.age);
	}
}

