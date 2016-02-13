package hw03;

import java.util.Scanner;

public class Zad9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input the size of the array :");
		int n = sc.nextInt();
		int[] a = new int[n];

		int[] b = new int[n];

		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			b[i] = a[n - 1 - i];
		}
		a = b;
		System.out.print("The reversed array : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
