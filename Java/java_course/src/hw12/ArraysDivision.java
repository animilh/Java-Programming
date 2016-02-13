package hw12;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDivision {

	static int[] devideArrays(int[] a1, int[] a2) {

		int[] b = new int[a1.length];

		for (int i = 0; i < b.length; i++) {
			try {
				b[i] = a1[i] / a2[i];
			} catch (ArithmeticException e) {
				System.out.println("The divider is 0");
				b[i] = 0;
			}
		}

		return b;
	}

	static int[] resultDivArray(int[] a1, int[] a2) {
		try {
			return devideArrays(a1, a2);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			return devideArrays(a2, a1);
		}

		catch (NullPointerException e) {
			System.out.println("Can't devide to null");
			return new int[0];
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Input the size of array a1[] : ");
		int n = input.nextInt();
		int[] a1 = new int[n];

		System.out.println("Input the size of array a2[] : ");
		int m = input.nextInt();
		int[] a2 = new int[m];

		for (int i = 0; i < a1.length; i++) {
			System.out.println("a1[" + i + "]=");
			a1[i] = input.nextInt();
		}
		for (int i = 0; i < a2.length; i++) {
			System.out.println("a2[" + i + "]=");
			a2[i] = input.nextInt();
		}

			System.out.println("The new array a1/a2 : "
					+ Arrays.toString(resultDivArray(a1, null)));

	}
}


