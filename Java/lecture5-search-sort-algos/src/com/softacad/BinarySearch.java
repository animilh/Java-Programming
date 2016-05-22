package com.softacad;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 13, 24, 35, 46, 77, 90 };
		int searched = 90;
		System.out.println(Arrays.toString(a));
		System.out.println("Searched element is " + searched);
		System.out.println("The searched element is at index : " + binarySearch(a, searched));

	}

	private static int binarySearch(int[] a, int searched) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = a.length - 1;

		while (searched >= a[start] && searched <= a[end]) {
			int current = (end + start) / 2;
			if (a[current] == searched) {
				return current;
			}
			if (searched < a[current]) {
				end = current;
			} else {
				start = current + 1;
			}
		}
		return -1;
	}

}
