package ArraysExercises;

import java.util.Scanner;

public class Zad3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Number of rows=");
		int rows = sc.nextInt();

		System.out.println("Number of columns=");
		int cols = sc.nextInt();

		int[][] a = new int[rows][cols];

		int countCol = 0;
		int num = 1;
		for (int i = rows - 1; i >= 0; i--) {

			for (int j = i; j < rows; j++) {
				a[j][countCol] = num;
				num++;
				countCol++;
			}
			countCol = 0;
		}
		int countRow = 0;
		for (int j = 1; j < cols; j++) {
			for (int i = j; i < cols; i++) {
				a[countRow][i] = num;
				num++;
				countRow++;
			}
			countRow = 0;
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();

		}

	}
}
