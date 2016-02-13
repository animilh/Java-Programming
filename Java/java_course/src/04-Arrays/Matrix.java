package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input the size of rows:");
		int rows = sc.nextInt();
		System.out.println("Input the size of cols:");
		int cols = sc.nextInt();
		int[][] matrix = new int[rows][cols];

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
	//			System.out.println(matrix[row]);// vryshta referencii na
												// 1-mernite masivi po redowe
				System.out.println("matrix[" + row + "][" + col + "]=");
				matrix[row][col] = sc.nextInt();

			}
		}
		sc.close();
		System.out.println(Arrays.deepToString(matrix));

		

	}
}
