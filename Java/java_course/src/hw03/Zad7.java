package hw03;

import java.util.Scanner;

public class Zad7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input the size of array : ");
		int n = sc.nextInt();

		int[] array1 = new int[n];
		for (int i = 0; i < array1.length; i++) {
			System.out.print("array1[" + i + "]=");
			array1[i] = sc.nextInt();
		}

		int[] array2 = new int[n];
		array2[0] = array1[1];
		array2[n - 1] = array1[n - 2];
		for (int i = 1; i < array2.length - 1; i++) {
			array2[i] = array1[i - 1] + array1[i + 1];
		}
		System.out.println("The new array :");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");

		}

	}
}
