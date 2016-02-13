package HW1;

import java.util.Scanner;

public class Zad1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input A:");
		double a = sc.nextDouble();
		
		System.out.print("Input B:");
		double b = sc.nextDouble();
		
		System.out.print("C:");
		double c = sc.nextDouble();

		if ((a <= c) && (c <= b)) {
			System.out.print("C is in [A..B]");

		} else {
			System.out.print("C is not in [A..B]");
		}

	}


}
