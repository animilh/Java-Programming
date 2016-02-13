package HW1;

import java.util.Scanner;

public class Zad3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        System.out.print("x=");
        int x = sc.nextInt();
        
        System.out.print("y=");
        int y = sc.nextInt();
        
        System.out.println("Initial order : "+x+" "+y);
        
        int z = x;
        x = y;
        y = z;
        
        System.out.println("After shift : "+x+" "+y);
	}

}
