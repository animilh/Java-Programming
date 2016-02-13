package HW1;

import java.util.Scanner;

public class Zad6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a1=");
		int a1 = sc.nextInt();
		
		System.out.print("a2=");
		int a2 = sc.nextInt();
		
		System.out.print("a3=");
		int a3 = sc.nextInt();
		
		System.out.println("Initial order : "+a1+" "+a2+" "+a3);
  
		int temp = a1;
		    a1 = a2;
            a2 = a3;
            a3 = temp;
            
        System.out.println("Order after shift : "+a1+" "+a2+" "+a3);    
	}

}
