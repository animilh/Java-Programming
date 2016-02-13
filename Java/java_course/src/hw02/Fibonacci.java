package hw02;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		// Fibonacci numbers

		Scanner sc = new Scanner(System.in);

		System.out.println("n=");
		int n = sc.nextInt();

		int fib1 = 0;
		int fib2 = 1;
		int fibN = 0;

		if (n <= 0) {
			System.out.println("Input integer number bigger than 0");
		}

		if (n == 1) {
			System.out.println("F1=" + fib1);
		}

		if (n == 2) {
			System.out.println("F2=" + fib2);
		}

		for (int i = 3; i <= n; i++) {
			fibN = fib1 + fib2;
			fib1 = fib2;
			fib2 = fibN;
		}
		if (n >= 3) {
			System.out.println("Fn=" + fibN);
		}
	}
}
