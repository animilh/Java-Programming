package numerals;
import java.util.Scanner;

public class BinToDec {
	
	public static int convertBinToDecimal(String binary){
		int result = 0;
		int power = 0;		
		
		for (int i=binary.length()-1; i>=0; i--){
			result += Character.getNumericValue(binary.charAt(i)) * powerOfTwo(power);
			power++;
		}
		
		return result;
	}

	public static int powerOfTwo(int power) {
		if (power == 0){
			return 1;
		}
		int result = 1;
		for(int i=0; i<power; i++){
			result *= 2;
		}		
		return result;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("binary number -> ");
		String binary = sc.nextLine();
		System.out.println("decimal representation -> "+convertBinToDecimal(binary));
		
		sc.close();
		
	}

}
