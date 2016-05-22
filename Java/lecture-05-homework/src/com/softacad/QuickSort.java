package com.softacad;

import java.util.Arrays;

public class QuickSort{

    private static void quickSort(int[] array, int left, int rigth){
	
	if (rigth - left < 1) {
		return;
	}		
		int partIndex = partition(array, left, rigth);
		quickSort(array, left, partIndex-1);
		quickSort(array, partIndex+1, rigth);
	}
	
	private static int partition(int[] array, int left, int rigth){
		int leftPointer = left;
		int rigthPointer = rigth;
		int pivot = array[(left + rigth)/2];
		
		while(true){
			while (leftPointer <= rigth && array[leftPointer] > pivot){
				++leftPointer;
			}
			while (rigthPointer >= left && array[rigthPointer] < pivot){
				--rigthPointer;
			}
			
			if(leftPointer >= rigthPointer){
				break;
			} else {
				int temp = array[leftPointer];
				array[leftPointer] = array[rigthPointer];
				array[rigthPointer] = temp;
			}
		}		
		return leftPointer;		
	}
	
	public static void main(String[] args){
		int[] array = {78, 3, 12, 45, 10, 8, 83, 91};
		System.out.println(Arrays.toString(array));
		
		int size = array.length;
		quickSort(array, 0, size-1);
		System.out.println("Array after Quick Sort : ");
		System.out.println(Arrays.toString(array));		
		
	}

}
