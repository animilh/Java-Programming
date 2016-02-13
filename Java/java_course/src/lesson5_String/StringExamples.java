package lesson5_String;

public class StringExamples {
	
	public static void main(String[] args) {
		String firstName="Ivan";
		String lastName="Petrov";
		String fullName=firstName+" "+lastName;
		String greeting="Welcome to \"Softacad\"";
		System.out.println(greeting);
		System.out.println(fullName=="Ivan Petrov"); //srawnqwa referenciite
		System.out.println(fullName.equals("Ivan Petrov"));
	}

}
