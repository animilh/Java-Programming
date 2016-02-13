package lesson02;

import java.util.Scanner;

public class Exmpl3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input n:");
		int n=sc.nextInt();
		int i=1;
		
		
		while (i<=n){
			if (i%7==0){
			System.out.println(i);
			}
			i++;
		}
	}
}


