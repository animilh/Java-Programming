package hw03;

import java.util.Scanner;

public class Zad2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input the size of array multiple of 2 :");
		int n = sc.nextInt();

		if (n % 2 == 1) {
			System.out.println("Input new size of array multiple of 2 :");
		} else {

			int[] a = new int[n];

			for (int i = 0; i < a.length / 2; i++) {
				System.out.print("a[" + i + "]=");
				a[i] = sc.nextInt();
				a[i + a.length / 2] = a[i];
			}

			// for (int i = 0; i < a.length / 2; i++) {
			// a[i + a.length / 2] = a[i];
			// }

			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i] + " ");
			}

		}
	}
}
