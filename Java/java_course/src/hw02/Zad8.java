package hw02;

import java.util.Scanner;

public class Zad8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input number : ");
		int n = sc.nextInt();

		int element = 0;
		for (int i = 0; i <= n - 1; i = i + 1) {
			for (int j = 0; j <= n - 1; j = j + 1) {
				element = n - 1 + 2 * j;
				System.out.print(element + " ");

			}
			System.out.println();
		}

	}
}
//}
//
//int start=n-1;
//for(int)
