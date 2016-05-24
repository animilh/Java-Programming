package com.softacad.homework;

import java.util.Arrays;

public class SumMinElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={31, 20, 98, 8, 12, 9, 1, 5, 10, 47};
		System.out.println(Arrays.toString(sort(a)));
		System.out.println("sum of first "+a.length/2+" elements "+sumMinEl(a));

	}

	private static int sumMinEl(int[] a) {
		int result = 0;
		int b[] = sort(a);
		for (int i=0; i<b.length/2; i++){
			result +=b[i];
		}
		return result;
	}

	private static int[] sort(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0; i<a.length; i++){
			for (int j=0; j<a.length-1-i; j++){
				if(a[j]>a[j+1]){
					int tmp= a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
		return a;		
	}

}
