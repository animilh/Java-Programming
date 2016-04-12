package numerals;

import java.math.*;
import numerals.BitConverter;

public class Task6{
	
	static final int base = 2;

    public static BigInteger decPresentation(int number, String unit){
		BigInteger result = new BigInteger("0");
		long numberOfBits = BitConverter.convertToBits(number, unit);
		for(int power=0; power<numberOfBits; power++){
			result = result.add(BigInteger.valueOf((long)Math.pow(base, power)));
		}		
		return result;
	}
	
	public static void main(String []args){		
        if (args.length>0){
        	try{
        		System.out.println("The biggest decimal that can be represented with "+args[0]+""
        				+ " "+args[1]+" is "+decPresentation(Integer.parseInt(args[0]), args[1]));	
        	}
        	catch (NumberFormatException e) {
        		System.out.println("The first argument " + args[0] + " should be a number");
        	}        	
        } else {
	    	System.out.println("No arguments");
	    }

	}

}