package com.softacad;

import java.util.Arrays;

// O(n)= n log n - best sort complexity
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array = {10,15, 3,1 , 11, 18, 21, 22};
		int[] sortedArray = mergeSort(array);
		System.out.println(Arrays.toString(sortedArray));
	}

	private static int[] mergeSort(int[] array) {
		// TODO Auto-generated method stub
		if (array.length<=1){
			return array;
		}
		int[] leftPart = Arrays.copyOfRange(array, 0, array.length/2);
		int[] rigthPart = Arrays.copyOfRange(array, array.length/2, array.length);
		
		int[] leftPartSoreted = mergeSort(leftPart);
		int[] rigthPartSoreted = mergeSort(rigthPart);
		int[] mergedArray = merge(leftPartSoreted, rigthPartSoreted);
		
		return mergedArray;
	}
	
	private static int[] merge(int[] leftPartSorted, int[] rigthPartSorted){
		int[] result = new int[leftPartSorted.length + rigthPartSorted.length];
		int i=0;
		int j=0;
		while(i< leftPartSorted.length && j<rigthPartSorted.length){
			if (leftPartSorted[i] < rigthPartSorted[j]){
				result[i+j] = leftPartSorted[i];
				i++;
			} else {
				result[i+j] = rigthPartSorted[j];
				j++;
			}
		} 
		
		return result;
	}
	
	

}
