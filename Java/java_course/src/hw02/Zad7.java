package hw02;

import java.util.Scanner;

public class Zad7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input n :");
		int n = sc.nextInt();
		int mult3 = 1;

		for (int i = 1; i <= n; i++) {
			mult3 = 3 * i;
			System.out.print(mult3 + ", ");
		}
	}

}
