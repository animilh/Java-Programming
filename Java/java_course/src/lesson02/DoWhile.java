package lesson02;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
//		int i=100;
//		do{
//			System.out.println(i);
//			i++;
//		}
//		while (i<=1000);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input n:");
		int n=sc.nextInt();
		int i=1;
		do{
			if (i%7==0){
				System.out.println(i);
				}
				i++;
				
		} while (i<=n);
		
	}

}
