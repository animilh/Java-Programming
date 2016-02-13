package hw03;

import java.util.Scanner;

public class Zad8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input the size of the array :");
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = sc.nextInt();
		}
		int indexRow = 0;
		int maxIndex = 0;
		int countElem = 0;
		int maxCount = 0;

		for (int i = 0; i < a.length; i++) {
			if ((i == 0) || (a[i - 1] != a[i])) {
				indexRow = i;
				countElem = 1;
			} else {
				countElem++;
			}

			if (countElem > maxCount) {
				maxCount = countElem;
				maxIndex = indexRow;
			}
		}

		System.out.print("The max row is : ");

		for (int j = maxIndex; j < maxIndex + maxCount; j++) {
			System.out.print(a[j] + " ");
		}
	}

}
