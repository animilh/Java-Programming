package hw02;

import java.util.Scanner;

public class Zad9 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("�������� �:");
		int a = sc.nextInt();

		System.out.println("�������� �:");
		int b = sc.nextInt();

		int sum = 0;

		for (int i = a; i <= b; i++) {
			if (i * i % 3 == 0) {
				System.out.print("(���������� " + i + ") ");
				continue;
			}
			sum += i * i;
			System.out.print(i * i + " ");
			if (sum > 200) {
				break;
			}

		}
	}

}
