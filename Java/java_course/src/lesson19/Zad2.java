package lesson19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Zad2 {
static	ArrayList<File> fileList = new ArrayList<File>();
	public static ArrayList<File> listDuplicatingFiles(String dirPath) {
		File dir = new File(dirPath);
	
		if (!dir.exists()) {
			System.out.println("The folder doesn't exist!");
		}

		File[] files = dir.listFiles();
		for (int i = 0; i < files.length; i++) {

			if (files[i].isFile()) {
				fileList.add(files[i]);
//				 System.out.println(files[i].getName()); // samo imenata na
				// file-a
			} else {
				if (files[i].isDirectory()) {
					File[] fileSubf = files[i].listFiles();
					for (int j = 0; j < fileSubf.length; j++) {
						if (fileSubf[j].isFile()) {
							fileList.add(fileSubf[j]);
				//			 System.out.println(fileSubf[j].getName());
						} else {
							if (fileSubf[j].isDirectory()) {
								String fileSubPath = fileSubf[j]
										.getAbsolutePath();
								listDuplicatingFiles(fileSubPath);
							}

						}
					}
				}

			}
		}

		return fileList;

	}

	public static void main(String[] args) {
		ArrayList<File> fileList=listDuplicatingFiles("C:\\SoftAcad\\iotest\\snimki");
		boolean equal=true;
		int b=0;
		int c=0;
		FileInputStream is=null;
		FileInputStream js=null;
		for (int i=0; i<fileList.size(); i++){
			for (int j=i+1; j<fileList.size(); j++){			
				b=0;
				c=0;
				try {
					is=new FileInputStream(fileList.get(i));
					js= new FileInputStream(fileList.get(j));
					while(b!=-1 && c!=-1){
						b=is.read();
						c=js.read();
						if(b!=c){
							equal=false;
							break;
						}
					}	
						if(equal){ fileList.get(j).delete();}
						else {
							continue;
						}
						
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
//				finally{
//					try {
//						if(is!=null)
//						is.close();
//						if(js!=null)
//						js.close();
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					
//				}
//			System.out.println(fileList.get(i).getName());
		}
	}
		
		for(int i=0; i<fileList.size(); i++){
			System.out.println(fileList.get(i).getName());
		}
	}

}
