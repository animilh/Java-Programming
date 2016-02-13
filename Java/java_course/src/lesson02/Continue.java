package lesson02;

import java.util.Scanner;

public class Continue {
public static void main(String[] args) {
	//n!

	Scanner sc=new Scanner(System.in);
	
	System.out.println("n=");
	int n=sc.nextInt();
	
	long factoriel=1;
	
	for (int i=1;i<=n;i++ ){		
		factoriel*=i;
		}
				
	System.out.println("n!="+factoriel);
		
}
}
