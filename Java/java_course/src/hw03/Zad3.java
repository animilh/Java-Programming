package hw03;

import java.util.Scanner;

public class Zad3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Input a number : ");
		int n = input.nextInt();

		int[] a = new int[10];
		a[0] = n;
		a[1] = n;

		for (int i = 2; i < a.length; i++) {
			a[i] = a[0] + a[1];
			a[0] = a[1];
			a[1] = a[i];
		}
		System.out.print(n + " " + n + " ");
		
		for (int i = 2; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
