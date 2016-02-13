package lesson19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class CharacterStreams {
	public static void main(String[] args) {
		File f=new File("C:\\SoftAcad\\iotest\\file1.doc");
		Scanner sc=null;
	//	InputStream 
		try {
			sc=new Scanner(f);
			while(sc.hasNextLine()){
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			sc.close();
		}
		
		PrintStream ps=null;
		
		try {
			ps=new PrintStream(f);
			ps.append("Line44");
			ps.print("Line44");
			ps.println("Line44");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			ps.close();
		}
		Writer wr=null;
		try {
			wr=new PrintWriter(f);
			//wr.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				wr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
