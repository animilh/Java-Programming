package hw02;

import java.util.Scanner;

public class LoopExample6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("n=");
		int n = sc.nextInt();
		
		double sum = 0;
		int factoriel = 1;
		double degree = 1;

		for (double i = 1; i <= n; i++) {
			factoriel *= i;
			degree = Math.pow(i, i);
			sum += factoriel / degree;
		}
		System.out.println("The sum is " + sum);
	}

}
