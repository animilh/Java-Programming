package com.softacad;

import java.util.Scanner;

public class Rabbits {

	private static long countGreyRabbitsRec(int n) {

		if (n == 0) {
			return 1;
		}

		if (n == 1) {
			return 3;
		}

		return 2 * countGreyRabbitsRec(n - 1) + countWhiteRabbitsRec(n - 1);
	}

	private static long countWhiteRabbitsRec(int n) {

		if (n == 0) {
			return 1;
		}

		if (n == 1) {
			return 4;
		}

		return 3 * countWhiteRabbitsRec(n - 1) + countGreyRabbitsRec(n - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of generation : ");
		int n = sc.nextInt();

		long sumWhiteRabits = 0;
		long sumGreyRabits = 0;

		for (int i = 0; i <= n; i++) {
			sumGreyRabits += countGreyRabbitsRec(i);
			sumWhiteRabits += countWhiteRabbitsRec(i);
		}
		sc.close();
		System.out.println("Number of grey rabbits at " + n + " generation is " + sumGreyRabits);
		System.out.println("Number of white rabbits at " + n + " generation is " + sumWhiteRabits);
	}
}

/*
 * private static long countGreyRabbits(int n){
 * 
 * long greyRabbits = 1; long whiteRabbits = 0; long temp;
 * 
 * for(int i=1; i<=n; i++){ temp = greyRabbits; greyRabbits += 2 * greyRabbits +
 * whiteRabbits; // 3, + 1 whiteRabbits += 3 * whiteRabbits + temp; // 1, }
 * return greyRabbits; }
 * 
 * private static long countWhiteRabbits(int n){
 * 
 * long greyRabbits = 0; long whiteRabbits = 1;
 * 
 * for(int i=1; i<=n; i++){ long temp = whiteRabbits; whiteRabbits += 3 *
 * whiteRabbits + greyRabbits; greyRabbits += 2*greyRabbits + temp; } return
 * whiteRabbits; }
 */