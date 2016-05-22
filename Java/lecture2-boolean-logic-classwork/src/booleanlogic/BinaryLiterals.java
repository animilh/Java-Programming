package booleanlogic;

public class BinaryLiterals {
	public static void main(String[] args){
		int a =15; // decimal
		System.out.println(a);
		
		int b = 0xf; // hexadecimal
		System.out.println(b);
		
		int c = 017; // octal
		System.out.println(c);
		
		int d = 0b1111; // binary
		System.out.println(d);
		
		int bigNumber=23_223_987;
		
		System.out.println(bigNumber);
		
		System.out.println(Integer.toBinaryString(a)); // ako ima 0 otpred se triqt
	}

}
