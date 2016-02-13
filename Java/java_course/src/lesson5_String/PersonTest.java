package lesson5_String;

public class PersonTest { // wsqka duma w imeto na clasa zapochwat s glawna
							// bukva

	public static void main(String[] args) {

		Person ivan = new Person(); // imenata na obektite smallcaceUppercase 
		 Person maria = new Person();
		System.out.println(ivan);
		// System.out.println(maria);
		ivan.age=25;
		ivan.isWoman=false;
		ivan.weght=80.7;
		
		ivan.age=30;
		
		System.out.println(ivan.name+" is "+ivan.age+" years old.");
		
		System.out.println(ivan == maria);
		
		Person mechoPuh=new Person();
		mechoPuh.name="Pooh";
		mechoPuh.age=10;
		
		Person prascho=new Person();
		
		mechoPuh.friend=prascho;
		

	}
}