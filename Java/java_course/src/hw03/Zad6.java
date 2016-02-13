package hw03;

import java.util.Scanner;

public class Zad6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input the size of the first array :");
		int n1 = sc.nextInt();

		System.out.println("Input the size of the second array :");
		int n2 = sc.nextInt();

		int[] a1 = new int[n1];
		int[] a2 = new int[n2];

		if (n1 == n2) {

			boolean isEqual = false;

			for (int i = 0; i < a1.length; i++) {

				System.out.print("a1[" + i + "]=");
				a1[i] = sc.nextInt();
			}
			System.out.println();
			for (int i = 0; i < a1.length; i++) {
				System.out.print("a2[" + i + "]=");
				a2[i] = sc.nextInt();
			}
			System.out.println();
			for (int i = 0; i < a2.length; i++) {
				if (a1[i] == a2[i]) {
					isEqual = true;
				}
			}
			if (isEqual) {
				System.out.println("The arrays are equal.");
			} else {
				System.out.println("The arrays are not equal.");
			}
			System.out.println("The arrays have the same size.");

		} else {
			for (int i = 0; i < a1.length; i++) {
				System.out.print("a1[" + i + "]=");
				a1[i] = sc.nextInt();
			}
			System.out.println();
			for (int i = 0; i < a2.length; i++) {
				System.out.print("a2[" + i + "]=");
				a2[i] = sc.nextInt();
			}
			System.out.println();
			System.out.println("The arrays are not equal.");

			System.out.println("The arrays have different sizes.");

		}

	}
}
