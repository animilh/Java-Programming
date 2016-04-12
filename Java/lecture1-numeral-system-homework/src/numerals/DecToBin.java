package numerals;
import java.util.Scanner;

public class DecToBin {
	
	public static StringBuilder convertDecToBin(int number){		
		StringBuilder result = new StringBuilder();
		while (number!=0){
			result.append(number%2);
			number = number/2;			
		}
		return result.reverse();
	}

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);		
		System.out.println("decimal number -> ");
		int number = sc.nextInt();
		System.out.println("binary representation -> "+convertDecToBin(number));		
		sc.close();
		
	}
}
