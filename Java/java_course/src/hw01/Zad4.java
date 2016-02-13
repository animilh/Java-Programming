package HW1;

import java.util.Scanner;

public class Zad4 {

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

		if (a == b) {
			System.out.println("Input new numbers");
		} else {

			if (a > b) {
				System.out.println(b + "  " + a);
			} else {				
				System.out.println(a + "  " + b);
			}
		}
	}

}
