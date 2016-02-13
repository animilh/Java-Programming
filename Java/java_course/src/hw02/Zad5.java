package hw02;

import java.util.Scanner;

public class Zad5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Input first number :");
		int first = sc.nextInt();

		System.out.println("Input second number :");
		int second = sc.nextInt();

		    if (first > second) {
			int temp = first;
			first = second;
			second = temp;
		}
		for (int current = first; current <= second; current++) {
			System.out.println(current + " ");
		}

	}
}

//if (first == second) {
		// System.out.println("Input different numbers");
		// } else {
		//
		// if (first < second) {
		// for (int i = first; i <= second; i++) {
		// System.out.println(i + " ");
		// }
		// } else {
		// for (int i = second; i <= first; i++) {
		// System.out.println(i + " ");
		// }
		// }
		// }
		// }
		//
		// }