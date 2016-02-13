package hw03;

import java.util.Scanner;

public class Zad4 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Input the size of array :");
		int n = input.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = input.nextInt();
		}

		boolean symmetric = false;

		for (int i = 0; i < a.length / 2; i++) {
			if (a[i] == a[n - 1 - i]) {
				symmetric = true;
			}
		}
		if (symmetric || (n == 1)) {
			System.out.println("The array is symmetric");
		} else {
			System.out.println("The array is not symmetric");
		}
	}

}
