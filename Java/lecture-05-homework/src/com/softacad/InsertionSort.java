package com.softacad;

import java.util.Arrays;

public class InsertionSort{

    private static void insertionSort(int[] array){
        for(int i=1; i<array.length; i++){
		    int j=i;
			while(j>0 && array[j] > array[j-1]){
			    int temp = array[j];
				array[j]=array[j-1];
				array[j-1] = temp;
				
				j--;
			}
		}	    
	}
	
	public static void main(String[] args){		
		int[] array = {34, 65, 1, 90, 13, 2, 9};
		System.out.println(Arrays.toString(array));		
		insertionSort(array);
		System.out.println(Arrays.toString(array));
	}
}
