package hw02;

import java.util.Scanner;

public class Zad6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input the number :");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("Input number bigger or equal to 1!");
		} else {

			int sum = 0;
			int i = 1;
			do {
				sum += i;
				i++;
			} while (i <= num);

			System.out.println("The result is : " + sum);
		}
	}

}
