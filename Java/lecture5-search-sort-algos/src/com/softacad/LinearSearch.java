package com.softacad;

public class LinearSearch {
	public static void main(String[] args) {
		int []a = {1,34,56,78,5};
		int searched = 0;
		System.out.println(linearSearch(a, searched));
	}

	private static int linearSearch(int[] a, int searched) {
		int index=-1;
		for(int i=0; i<a.length; i++){
			if(searched == a[i]){
				return i;
			}
		}
		return index;
	}
	


}
