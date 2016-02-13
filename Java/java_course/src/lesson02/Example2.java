package lesson02;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("m=");
		int m = sc.nextInt();

		System.out.print("n=");
		int n = sc.nextInt();

//		while (m <= n) { tuk prawim m-n iteracii i pri 1/2 ot tqh ne prawim nishto
//			if (m % 2 == 0) {
//				System.out.println(m);
//			}
//			m++;
		
		if(m%2==1){
			m++;
		}
		while (m<=n){
			System.out.println(m);
			m=m+2;
		}
	}

}
