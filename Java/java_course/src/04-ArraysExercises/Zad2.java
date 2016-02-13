package ArraysExercises;

import java.util.Scanner;

public class Zad2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("n=");
		int n = sc.nextInt();
		
		System.out.println("m=");
		int m = sc.nextInt();

		int[][] array = new int[n][m];
		
		int number = 0;
		boolean flag = true;
		for (int i = 0; i < array.length; i++) {
			if(flag) {
				for (int j = 0; j < array[0].length; j++) {
					array[j][i] = ++number;
				}
			} else {
				for (int j = array[0].length - 1; j >= 0; j--) {
					array[j][i] = ++number;
				}
			}
			flag = !flag;
		}
//		int num = 1;
//		
//		for (int j = 0; j < m; j = j + 2) {
//		   for (int i = 0; i < n; i++) {
//			
//
//				a[i][j] = num;
//				num++;
//				
//
//			}
//			num = num + n;
//		}
//
//		int num1 = n + 1;
//
//		for (int j = 1; j < m; j = j + 2) {
//		for (int i = n - 1; i >= 0; i--) {
//			
//				a[i][j] = num1;
//				num1++;
//			}
//			num1 = num1 + n;
//		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();

		}

	}
}
