package lesson5_String;

public class PersonMethodTest {
	public static void main(String[] args) {
		
	Person p1=new Person();
	Person p2=new Person();
	
	p1.name="Dragan";
	p2.name="Ivan";
	
	p1.eat();
	p1.walk();
	p1.growUp();
	p2.growUp();
	p1.walk();
	p2.walk();
	System.out.println(p1.age);
	System.out.println(p2.age);
}
}
