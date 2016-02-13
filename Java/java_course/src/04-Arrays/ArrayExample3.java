package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample3 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size ot array : ");
		int n=sc.nextInt();
		
		int [] array=new int [n];		
		for(int i=0;i<array.length;i++){
			System.out.print("array["+i+"]=");
			array[i]=sc.nextInt();
		}
		int max=array[0];
		for (int i=0;i<array.length;i++){
			if (max<array[i]){
				max=array[i];
			}
			}
//		for (int i=0;i<array.length;i++){
//			System.out.println(array[i]+" ");
//			
//		}
		
		System.out.println(Arrays.toString(array));
		
		System.out.println("The max value of array is "+max);
	}

}
