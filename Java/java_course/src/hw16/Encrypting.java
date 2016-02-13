package hw16;

public class Encrypting {
	
//	static char [] alpha={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	static int x=2;
	static int asciiChar;
	
	public static String encrypth(String text){
		if("".equals(text)){
			System.out.println("Bad input for text");
			return "";
		}
		String encText="";
		
		char [] a=text.toCharArray();
		for (int i=0;i<a.length;i++){
			asciiChar=(int) a[i]+x+i;
			a[i]=(char) asciiChar;
			encText+=a[i];
			
			}
			
		
		return encText;
	}
	
	public static String decrypth(String text){
		if("".equals(text)){
			System.out.println("Bad input for text");
			return "";
		}
		String decText="";
		char []a=text.toLowerCase().toCharArray();
		for (int i=0;i<a.length;i++){
			asciiChar=(int) a[i]-x-i;
			a[i]=(char) asciiChar;
			decText+=a[i];
		}
		return decText;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(encrypth("aaaa"));
		System.out.println(decrypth("cdef"));
//	int ascii=(int)alpha[0];
	//	System.out.println(ascii);

	}

}
