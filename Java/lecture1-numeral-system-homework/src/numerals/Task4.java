package numerals;
import java.util.Scanner;

public class Task4{
	
	static final int base = 2;

    public static float convertToDecFraction(String binFrac){
		float result = 0;
		
		String[] sp = binFrac.split("\\.");
		int power = 0;
		
		for(int i=sp[0].length()-1; i>=0; i--){
			result += Character.getNumericValue(sp[0].charAt(i)) * Math.pow(base, power);
			power++;
		}
		
		power = -1;
		for(int i=0; i<sp[1].length(); i++){
			result += Character.getNumericValue(sp[1].charAt(i)) * Math.pow(base, power);
			power--;
		}		
		return result;
	}
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a binary fraction -> ");
		String binFrac = sc.nextLine();
		System.out.println("The decimal representation is "+ convertToDecFraction(binFrac));		
		sc.close();
	}

}