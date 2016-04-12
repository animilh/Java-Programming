package numerals;

public class BitConverter {
	public static final String kbyte = "KB";
	public static final String mbyte = "MB";
	public static final String gbyte = "GB";
	public static final String tbyte = "TB";
	public static final String bYte = "B";
	
	public static long convertToBits(int number, String unit){
		long result=0;
		
			if(kbyte.equals(unit)){
				result = convertFromKbyte(number);
			}
			
			if(mbyte.equals(unit)){
				result = convertFromMbyte(number);
			}
			
			if(gbyte.equals(unit)){
				result = convertFromGbyte(number);
			}
			
			if(tbyte.equals(unit)){
				result = convertFromTbyte(number);
			}	
			
			if(bYte.equals(unit)){
				result = convertFromByte(number);
			}
			
		return result;
	}

	private static long convertFromTbyte(int tb) {
			return convertFromGbyte(tb) * 1000;
		}
	
	private static long convertFromGbyte(int gb) {
			return convertFromMbyte(gb) * 1000;
		}
	
	private static long convertFromMbyte(int mb) {
			return convertFromKbyte(mb) * 1000;
		}

	private static long convertFromKbyte(int kb) {
		return convertFromByte(kb) * 1000;
	}
	
	private static long convertFromByte(int b) {
		return b * 8;
	}
	
	public static void main(String []args){
		if (args.length > 0) {
			try{
				System.out.println("Convert in bits -> "+convertToBits(Integer.parseInt(args[0]), args[1]));
			}
			catch(NumberFormatException e){
        		System.out.println("The first argument " + args[0] + " should be a number");
			}			
	    } else {
	    	System.out.println("No arguments");
	    }
	
}
	
}	
