package lesson19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class JpegComparation {
	public static void main(String[] args) throws IOException {
		File f1=new File("C:\\SoftAcad\\iotest\\cat1.jpg");
		File f2=new File("C:\\SoftAcad\\iotest\\cat2.jpg");
		
		FileInputStream is1=null;
		FileInputStream is2=null;
		
		try {
			is1=new FileInputStream(f1);
			is2=new FileInputStream(f2);
				int b=0;
				int c=0;
				boolean equal=true;
			while(b!=-1 && c!=-1){
				b=is1.read();
				c=is2.read();
				if(b!=c){
					equal=false;
					break;
				}
								
			}
			if(equal){
				System.out.println("The files are the same");
			} else {
				System.out.println("The files are different");
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
				if(is1!=null)
				is1.close();
				if(is2!=null)
				is2.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
