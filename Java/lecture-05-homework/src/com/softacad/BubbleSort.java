package com.softacad;

import java.util.Arrays;

public class BubbleSort{

	// sort array in descending order
	
	private static int[] bubbleSort(int[] array){
		
		int[] result = Arrays.copyOf(array, array.length);
	
	    for(int i=0; i<result.length; i++){
		    for(int j=0; j<result.length-1-i; j++){
			    if(array[j] < result[j+1]){
				    int temp = result[j];
				    result[j] = result[j+1];
				    result[j+1] = temp;
				}
			}
		}
	    return result;
	}
	
	public static void main(String[] args){
	    int[] array = {4, 5, 78, 98, 35, 1, 45};
		System.out.println(Arrays.toString(array));
	    int[] result = bubbleSort(array);		
		System.out.println(Arrays.toString(result));
	}

}
