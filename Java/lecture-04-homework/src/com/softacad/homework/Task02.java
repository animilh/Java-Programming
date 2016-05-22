package com.softacad.homework;

import java.util.ArrayList;

public class Task02 {
	
	private static ArrayList<Integer> listOfPrimes(int number){
		ArrayList<Integer> result = new ArrayList<>();
			result.add(2);
			for(int j=3; j<number; j+=2){
				if(isPrime(j)){
					result.add(j);
				}
			}
		return result;		
	}

	private static boolean isPrime(int n) {
		if(n == 1){
			return false;
		}
		for(int i=2; i<n; i++){
			if(n % i == 0){
				return false;						
			}
		}
		return true;
	}
	
	private static ArrayList<Integer> factorization(int number){
		ArrayList<Integer> result = new ArrayList<>();
		if(isPrime(number)){	
			result.add(number);
			return result;
		}
		
		ArrayList<Integer> primes = listOfPrimes(number);	
		
		for(int prime : primes){
			while (number % prime == 0 && number != 0){
				result.add(prime);
				number /= prime;
			}
		}		
		return result;
	}
	
//ugly recursion :)	
	
	private static ArrayList<Integer> factorizationRecursion(int number, int prime){
		ArrayList<Integer> result = new ArrayList<>();
		
			if(isPrime(number)){
				result.add(number);				
			}
			
			while (number%prime == 0 && number != 0){
				result.add(prime);
				number/=prime;
				factorizationRecursion(number, prime);
			}			
			return result;			
	}	
	
	public static void main(String[] args) {
		int n=24;
		System.out.println("Factorization with iteration :" + factorization(n));
		
		ArrayList<Integer> primes = listOfPrimes(n);
		System.out.print("Factorization with recursion :");
		for(int prime : primes){
			System.out.print(factorizationRecursion(n, prime));
			if(n % prime != 0){
				break;
			}
		}
	}
}
