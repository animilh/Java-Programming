package lesson02;

import java.util.Scanner;

public class ReverseOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input n:");
		int n=sc.nextInt();
		
		while(n>=1){
			if (n%7==0){
				System.out.println(n);
			}
			n--;
		}

}
}	
