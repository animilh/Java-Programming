package lesson19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StreamDemo {
 public static void main(String[] args) {
	File f=new File("C:\\SoftAcad\\iotest\\tatata.xls");
	FileInputStream is=null;
	FileInputStream is2=null;
	try {
		is=new FileInputStream(f);
		is2=new FileInputStream(f);
		int b=is.read();
		int c=is.read();
		while(b!=-1 && c!=-1){
			b=is.read();
			c=is.read();
			System.out.println(b+"|"+c);
		}
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
		try {
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
