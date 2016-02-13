package HW1;

import java.util.Scanner;

public class Zad2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("a=");
		int a = sc.nextInt();

		System.out.print("b=");
		int b = sc.nextInt();

		int add = a + b;
		int sub = a - b;
		int mult = a * b;
		int div = a / b;
		int rem = a % b;

		System.out.println("a+b=" + add);

		System.out.println("a-b=" + sub);

		System.out.println("a*b=" + mult);

		System.out.println("a/b=" + div);

		System.out.println("a%b=" + rem);

		/**
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.print("a="); double a = sc.nextDouble();
		 * 
		 * System.out.print("b="); double b = sc.nextDouble();
		 * 
		 * double add = a+b; double sub = a-b; double mult = a*b; double div =
		 * a/b; double rem = a%b;
		 * 
		 * System.out.println("a+b="+add);
		 * 
		 * System.out.println("a-b="+sub);
		 * 
		 * System.out.println("a*b="+mult);
		 * 
		 * System.out.println("a/b="+div); // resultata e double
		 * 
		 * System.out.println("a%b="+rem);
		 */
	}

}
