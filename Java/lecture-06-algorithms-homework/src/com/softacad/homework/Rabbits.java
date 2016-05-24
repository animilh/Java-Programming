package com.softacad.homework;

import java.util.Scanner;

public class Rabbits{

	private static long countGreyRabbitsRec(int n){
		
		if(n == 0){ return 1;}
		
		if(n == 1){ return 3;}
		
		return 2 * countGreyRabbitsRec(n-1) + countWhiteRabbitsRec(n-1);
    }		
	
	private static long countWhiteRabbitsRec(int n){
		
		if(n == 0){ return 1;}
		
		if(n == 1){ return 4;}
		
		return 3 * countWhiteRabbitsRec(n-1) + countGreyRabbitsRec(n-1);
    }		
		
	
	public static void main(String[] args){	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of generation : ");
	    int n = sc.nextInt();
	    
	    long sumWhiteRabits = 0;
	    long sumGreyRabits = 0;
	    
	    for(int i=0; i<=n; i++){
	    	sumGreyRabits += countGreyRabbitsRec(i);
	    	sumWhiteRabits += countWhiteRabbitsRec(i); 
	    }
	    sc.close();
		System.out.println("Number of grey rabbits at "+n+" generation is "+sumGreyRabits);
	    System.out.println("Number of white rabbits at "+n+" generation is "+sumWhiteRabits);
	}
}