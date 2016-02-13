package lesson01;

public class switchTest {
	public static void main(String[] args) {
		
		int number=3;
		
		switch(number){
		case 1:
		case 2:
		case 3:
		case 4: System.out.println("This will be executed!"); break;
		case 5: System.out.println("This won't be executed!"); break;
		default: System.out.println("Default constructor");
		}
	}

}
