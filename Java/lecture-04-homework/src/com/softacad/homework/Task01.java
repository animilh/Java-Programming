package com.softacad.homework;

public class Task01 {
	
	private static int numberOfBits(int number){
		if (number == 0){
			return 0;
		}
		 return numberOfBits(number/2) + 1;
	}
	
	public static void main(String[] args) {
		int n=20;
		System.out.println(numberOfBits(n));
	}
	
	

}
