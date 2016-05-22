package com.softacad;

import java.util.Arrays;

public class BubbleSort{

	// sort array in descending order
	
	private static int[] bubbleSort(int[] array){
	
	    for(int i=0; i<array.length; i++){
		    for(int j=0; j<array.length-1-i; j++){
			    if(array[j] < array[j+1]){
				    int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	    return array;
	}
	
	public static void main(String[] args){
	    int[] array = {4, 5, 78, 98, 35, 1, 45};
		System.out.println(Arrays.toString(array));
	    int[] result = bubbleSort(array);		
		System.out.println(Arrays.toString(result));
	}

}
