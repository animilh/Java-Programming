package lesson02;

import java.util.Scanner;

public class ForExmpl1 {
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		
		System.out.println("n=");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++){
			System.out.print(n+" ");
		}
		System.out.println("!");
	}

}
