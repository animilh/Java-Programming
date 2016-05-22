package com.softacad;
public class  BinarySearch{
	//search in array in descending order

    public static int binarySearch(int[] array, int startIndex, int endIndex, int searchedEl){
	    int currentIndex = (startIndex + endIndex)/2;
		if(array[currentIndex] == searchedEl){
		    return currentIndex;
		}
		
		if(array[currentIndex] > searchedEl){
		   return binarySearch(array, currentIndex+1, endIndex, searchedEl);
		}
		
		if(array[currentIndex] < searchedEl) {
		   return binarySearch(array, startIndex, currentIndex, searchedEl);
		}
		
		return currentIndex;

	}
	
	public static void main(String[] args){
		
		int array[] = {51, 36, 25, 18, 16, 4, 3};
		int startIndex = 0;
		int endIndex = array.length-1;
		int searchedEl = 16;
        System.out.println("The index of "+searchedEl+" is "+binarySearch(array, startIndex, endIndex, searchedEl));		
	}
}

