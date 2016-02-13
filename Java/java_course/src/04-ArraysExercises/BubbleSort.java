package ArraysExercises;

public class BubbleSort {
	public static void main(String[] args) {
		int[] array = { 8, 2, 5, 1, 9, 4, 3, 12, 87, 43 };
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
		//}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
}
