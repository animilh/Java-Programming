package lesson5_String;

public class StringMethods {
	public static void main(String[] args) {
		String str="a,b,c,d,e";
		System.out.println(str.length());
		
		String[] splitted=str.split(",");
		for(int i=0;i<splitted.length;i++){
			System.out.println(splitted[i]);
		}
	}

}
