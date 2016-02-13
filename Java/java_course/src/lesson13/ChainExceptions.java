package lesson13;

public class ChainExceptions {
	
	public static void main(String[] args) {
		
		String s=null;
		testMethod(s);
		
		}
	public static void testMethod(String s){
		try{
			System.out.println(s.length());
		}
		catch(NullPointerException npe){
			throw new RuntimeException("Error when trying to print string's length", npe);
		}
	}

}
