package lesson02;

import java.util.Scanner;

public class ForBreak {
	public static void main(String[] args) {
		// break - prekratqwa cikyla w kjto se izpolzwa, ako sa dwa wlojeni - prekratqwa wytreshniq
		Scanner sc=new  Scanner(System.in);
		for (;true; ){
			//break; - nishto ne stawa
			System.out.println("Enter 10");
			int n=sc.nextInt();
			if(n==10) {
				break;
			}
		}
		System.out.println("10 is entered !!!");
			
	}

}
