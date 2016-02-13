package lesson19;

import java.io.File;
import java.io.IOException;

public class FileTest {
	
	public static void main(String[] args)  {
		File dir=new File("C:\\SoftAcad\\iotest");
		boolean exists = dir.exists();
		System.out.println(exists);
		if(!exists){
			dir.mkdir();
			System.out.println("Folder created");
		}
		File f1=new File("C:\\SoftAcad\\iotest\\test.txt");
		try {
			boolean created=f1.createNewFile(); // prawi opit da syzdade fila, ako opita e uspeshen go syzdawa i (true) ako ne vryshta false
			if(created){
				System.out.println("OK");
			}
			else{
				System.out.println("Already exists!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File[] files=dir.listFiles();
		for(int i=0;i<files.length;i++){
//			System.out.println(files[i]); // absoliutniq pyt override toString();
			System.out.println(files[i].getName()); // samo imenata na file-a
			System.out.println(files[i].list());
//			System.out.println(files[i].getFreeSpace());
		}
		
//		File[] filesw=f1.listFiles(); // ako imame file a ne folder ne dava kompilation error, a hste dade npe
//		for(int i=0;i<filesw.length;i++){
//			System.out.println(filesw[i]);
		
//		for(int i=0;i<files.length;i++){
//			if(files[i].getName().startsWith("t")||files[i].getName().startsWith("T")){
//				if(files[i].delete()){
//					System.out.println(files[i].getName()+" is deleted");
//				}
//				
//			}
//		}
			
		}
	}


