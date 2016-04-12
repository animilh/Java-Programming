package numerals;
import java.util.Scanner;
import numerals.DecToBin;

public class Task5{

    public static int howManyBitsInDecimal(int number){
		return DecToBin.convertDecToBin(number).length();
	}
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number -> ");
		int number = sc.nextInt();
		sc.close();
		System.out.println("Number of bits of binary representation are " + howManyBitsInDecimal(number));
	}

}
