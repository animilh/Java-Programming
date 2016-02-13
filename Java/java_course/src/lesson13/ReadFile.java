package lesson13;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFile {
	
	public static void readFile(String FileName) throws IOException {
		FileInputStream fis=null;
		BufferedReader in=null;
		try{
			fis= new FileInputStream(FileName);
			in=new BufferedReader(new InputStreamReader(fis));
			  String tmp = null;

		        while ((tmp = in.readLine()) != null) {

		            System.out.println(tmp);

		        }

		    } catch (FileNotFoundException e) {

		        System.out.println("The file \"" + FileName +

		            "\" does not exist! Unable to read it.");

		    }
		finally{
			if(in!=null){
				in.close();
			}
			if(fis!=null){
				fis.close();
			}
		}

		}
	
	public static void main(String[] args) {
		try {

	        readFile("D:\\Java_Lectures&Code\\Lecture 02 - Loops.pdf");

	    } catch (IOException e) {

	        e.printStackTrace();

	    }

	}

	}


