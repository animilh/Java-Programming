package HW1;

import java.util.Scanner;

public class Zad5 {

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
		
		System.out.print("c=");
		int c = sc.nextInt();

		if (((a == b) && (b == c)) || (a == b) || (a == c) || (b == c)) {
			System.out.println("Input new numbers");
		} else {
			if ((a > b) && (a > c)) {
				if (b > c) {
					System.out.println(a + " " + b + " " + c);
				} else {
					System.out.println(a + " " + c + " " + b);
				}
			}

			if ((b > a) && (b > c)) {
				if (a > c) {
					System.out.println(b + " " + a + " " + c);
				} else {
					System.out.println(b + " " + c + " " + a);
				}
			}

			if ((c > a) && (c > b)) {
				if (a > b) {
					System.out.println(c + " " + a + " " + b);
				} else {
					System.out.println(c + " " + b + " " + a);
				}
			}
		}

	}

}
