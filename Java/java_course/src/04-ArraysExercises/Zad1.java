package ArraysExercises;

import java.util.Scanner;

public class Zad1 {
	public static void main(String[] args) {
		//pylnene na masiv po koloni s poredni chisla
		Scanner sc=new Scanner(System.in);
		System.out.println("n=");
		int n=sc.nextInt();
		System.out.println("m=");
		int m=sc.nextInt();
		
		int[][] a=new int[n][m];
		
		int number=0;
		for (int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				a[i][j]+=number;
				number++;
			}
		}
//		a[0][0]=1;
//	for (int i=0;i<n;i++){
//		for(int j=1;j<m;j++){
//			a[0][j]=a[0][j-1]+n;
//		}
//	}
//	for (int i=1;i<n;i++){
//		for(int j=0;j<m;j++){
//			a[i][j]=a[i-1][j]+1;
//		}
//		
//		
//	}
		
	
	for (int i=0;i<n;i++){
		for(int j=0;j<m;j++){
	System.out.print(a[i][j]+" ");
		}
		System.out.println();
	
	}
}}
