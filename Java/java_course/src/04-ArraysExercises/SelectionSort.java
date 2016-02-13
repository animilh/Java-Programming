package ArraysExercises;

public class SelectionSort {
public static void main(String[] args) {
	int[] array = { 8, 2, 5, 1, 9, 4, 3, 12, 87, 43 };
	
	for (int i = 0; i < array.length; i++) {
		int min=i;
		for (int j=i;j<array.length;j++){
			if(array[min]>array[j]){
				min=j; //namirame index-a na min element ot masiva i q postawqme w chaloto
			}
		}
		//razmenqme stojnostite
		int tmp=array[i];
		array[i]=array[min];
		array[min]=tmp;
	}
		//printirame sort masiv
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
				
}
}

