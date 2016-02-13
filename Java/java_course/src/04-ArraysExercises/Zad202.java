package ArraysExercises;

import java.util.Scanner;

public class Zad202 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("rows=");
		int row = sc.nextInt();

		System.out.println("cols=");
		int col = sc.nextInt();

		int[][] a = new int[row][col];
		int num = 1;

		for (int i = 0; i < col; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < row; j++) {
					a[j][i] = num;
					num++;
				}
			} else {
				for (int j = row - 1; j >= 0; j--) {
					a[j][i] = num;
					num++;
				}
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();

		}
	}
}
