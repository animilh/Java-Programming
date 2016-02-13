package lesson13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.xml.bind.DataBindingException;

public class ExceptionWrapping {
	static void readFromDBAndWriteToFile() throws Exception {
		//... 
		try{
			File f = new File("asdas");
			Scanner sc = new Scanner(f);
			
			File.class.getMethod("dasda", null);
		}
		catch(IOException e){
			throw new Exception("Error creating file", e);
		} catch (NoSuchMethodException e) {
			throw new Exception("error getting method for class", e);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static int writeInFile() throws FileNotFoundException {
		
		//throw new RuntimeException();
		File f = new File("asdas");
		try {
			//Scanner sc = new Scanner(f);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return 1;
	}
	
	
//	static void testSoftAcadException() throws SoftAcadException {
//		
//		//....
//		throw new SoftAcadException("SoftAcad", null);
//		//......
//	}
	
	public static void main(String[] args) throws Exception {
		try {
			writeInFile();
			System.out.println("after write in file");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//System.out.println(e.getMessage());
			try{
				
			}
			catch(Exception ex){
				throw ex;
			}
			finally{
				System.out.println("inner finally");
			}
			throw e;
		}
		finally{
			System.out.println("Clean up...");
		}
		
		System.out.println("after catch");
		
//		try {
//			readFromDBAndWriteToFile();
//		} 
//		catch (IndexOutOfBoundsException e) {
//			System.out.println(e.getCause().getMessage());
//			//System.out.println(e.getMessage());
//		}
//		catch (StringIndexOutOfBoundsException e) {
//			System.out.println(e.getCause().getMessage());
//			//System.out.println(e.getMessage());
//		}

		
//		try {
//			testSoftAcadException();
//		} catch (SoftAcadException e) {
//			e.printStackTrace();
//			System.out.println(e.getTime());
//		}
	}
}

