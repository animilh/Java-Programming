package hw03;

import java.util.Scanner;

public class Zad1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input the size of array :");
		int n = sc.nextInt();

		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {
			System.out.print("array[" + i + "]=");
			array[i] = sc.nextInt();
		}
		int min = 3;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				if (min > array[i]) {
					min = array[i];
				}
			}
		}
		System.out.println("The minimal number multiple of 3 is " + min);
	}

}
