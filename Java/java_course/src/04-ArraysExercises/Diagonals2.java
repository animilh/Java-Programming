package ArraysExercises;

import java.util.Scanner;

public class Diagonals2 {
	public static void main(String[] args) {
		
	
	Scanner s = new Scanner(System.in);
	System.out.print("Enter rows :");
	int rows = s.nextInt();
	System.out.print("Enter cols :");
	int cols = s.nextInt();

	int[][] matrix = new int[rows][cols];

	int r = rows - 1;
	int c = 0;
	int num = 1;
	while (c <= cols - 1) {
	int rr = r;
	int cc = c;
	while (rr <= rows - 1 && cc <= cols - 1) {
	matrix[rr][cc] = num;
	num++;
	rr++;
	cc++;
	}
	if (r != 0) {
	r--;
	} else {
	c++;
	}
	}
	for (int row = 0; row < matrix.length; row++) {
	for (int col = 0; col < matrix[row].length; col++) {
	System.out.print(matrix[row][col] + "\t");
	}
	System.out.println();
	}


}
}
