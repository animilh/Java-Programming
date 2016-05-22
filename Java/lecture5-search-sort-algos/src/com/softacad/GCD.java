package com.softacad;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=136;
		int b=36;
		System.out.println("Greatest Common Divider " + gcd(a,b));

	}
	
	public static int gcd(int a, int b){
		if (b == 0){
			return a;	
		}
		return gcd(b, a%b);		
	}

}
