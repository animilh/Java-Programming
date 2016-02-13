package lesson06;

public class MethodsTest {
public static void main(String[] args) {
	Person p=new Person ("Ivan",012345,true);
	System.out.println(p.name+" can have "+ p.getFriendsNumber()+" friends");
	
	Car c1=new Car("306",true,"black",8000,240);
	c1.price=7000;
	Car c2=new Car();
	c2.price=8000;
	
	System.out.println("The price of car c1 for scrub is "+c1.calculateCarPriceForScrap(50));
	System.out.println("C1 is more expensive ? :"+c1.isMoreExpensive(c2));
}
}
