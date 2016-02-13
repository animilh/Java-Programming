package lesson12;

public class ExceptionTest {

	static void printArrayInfo(int[] array) {
		try {
//			"afsgdg".charAt(-1);
			System.out.println(array.length);// koda w try spira da se izpylnqwa sled greshkata
			System.out.println(array[2]);
			System.out.println("Some text ...");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		
	}

	public static void main(String[] args) {
		int[] a = new int[1];
		int[] b=null;
		

		printArrayInfo(a);
	}
}
