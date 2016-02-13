package lesson13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionThrow {

	public static void main(String[] args) {
		String str="Zad1.java";
		openFile(str);
		RuntimeException exception = new RuntimeException("Problem");
		throw exception;
		
	}

	// public static void openFile(String FileName) throws FileNotFoundException // v methoda kojto vika openFile zadyljitelno se prawi prowerka dali imme kod kojto obrabotva hwyrlenoto izkliuchenie
	// {
	// FileInputStream fis= new FileInputStream (FileName);
	// }

	public static void openFile(String FileName){
		try{
			FileInputStream fis=new FileInputStream(FileName);
			
		}catch(FileNotFoundException e){
			System.out.println("The specified file is not found!");
			System.out.println(e.getStackTrace());			
		}
	}
}
