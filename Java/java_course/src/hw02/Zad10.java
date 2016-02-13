package hw02;

import java.util.Scanner;

public class Zad10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете число :");
		int num = sc.nextInt();
		boolean check = false;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				check = true;
				System.out.println("Числото " + num + " не е просто!");
				break;
			}

		}
		if (!check) {
			System.out.println("Числото " + num + " е просто!");
		}

	}

}
