package lesson02;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("n=");
		int n=sc.nextInt();		
		
for (int i=1;i<=n;i++){
	for (int j=i;j<=i*n;j=j+i){
		System.out.print(j+" ");
	}
	System.out.println();
}	
	}
}


