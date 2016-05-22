package booleanlogic;

public class BitWiseOperations {
	public static void main(String[] args) {
		int x=60;
		int y=40;
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		System.out.println(Integer.toBinaryString(x & y));
		System.out.println(Integer.toBinaryString(x | y));
		System.out.println(Integer.toBinaryString(x ^ y));
		System.out.println(Integer.toBinaryString(~x));
		System.out.println(~x);
		System.out.println("x>>2="+Integer.toBinaryString(x>>2));
		System.out.println("x>>2="+(x>>2)); 
		System.out.println("x<<2="+Integer.toBinaryString(x<<2));
		
		int z = -20;
		System.out.println(Integer.toBinaryString(z>>2));
		System.out.println(z>>2);
		System.out.println(Integer.toBinaryString(z>>>2));
		System.out.println(z>>> 2);
	}

}
