package ArraysExercises;

import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Number of rows=");
		int rows = sc.nextInt();

		System.out.println("Number of columns=");
		int cols = sc.nextInt();

		int[][] a = new int[rows][cols];

		int num = 1;
		int startCol = 0;
		int endCol = cols - 1;
		int startRow = 0;
		int endRow = rows - 1;

		while (num <= rows * cols) {

			for (int j = startCol; j <= endCol; j++) {
				a[startRow][j] = num;
				num++;
			}

			for (int i = startRow + 1; i <= endRow; i++) {
				a[i][endCol] = num;
				num++;

			}

			for (int j = endCol - 1; j >= startCol; j--) {
				a[endRow][j] = num;
				num++;
			}

			for (int i = endRow - 1; i >= startRow + 1; i--) {
				a[i][startCol] = num;
				num++;
			}

			startRow++;
			endRow--;
			startCol++;
			endCol--;

		}
		System.out.println("The spiral matrix :");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(a[i][j] + "\t");

			}
			System.out.println();

		}
	}
}
