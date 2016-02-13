package Arrays;

import java.util.Arrays;

public class ArraysCopying {
	public static void main(String[] args) {
		int[] oldArray={2,3,4};
		
		int[] newArray=new int[oldArray.length];
		
		for(int i=0;i<oldArray.length;i++){
			newArray[i]=oldArray[i];
		}
		oldArray[0]=34;
		System.out.println(Arrays.toString(oldArray));
		System.out.println(Arrays.toString(newArray));
		
	}

}
