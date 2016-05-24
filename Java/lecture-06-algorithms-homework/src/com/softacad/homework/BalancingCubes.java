package com.softacad.homework;

import java.util.Scanner;

public class BalancingCubes{
	
    private static int[][] balancing(int number, int size){
     	int sum = 0;
	    int[][] result = new int[size][size];
		for(int i=0; i < size-1; i++){
			result[0][i] = i+1;
			sum += result[0][i];
			
		}
		result[0][size-1] = number - sum;
		for(int i=1; i<size; i++){
		    for(int j=0; j<size; j++){
				result[i][j]=result[0][(j+i)%size];				
			}
		}
		return result;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the size of the balancing matrix : ");
		int size = sc.nextInt();
		System.out.println("Input a number bigger than 5 :");
		int number = sc.nextInt();
		int[][] result = new int[size][size];
	    result = balancing(number, size);
	    for(int i=0; i<size; i++){
	    	for(int j=0; j<size; j++){
	    		System.out.print(result[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	    sc.close();
//		System.out.println(java.util.Arrays.deepToString(result));
	}
}
