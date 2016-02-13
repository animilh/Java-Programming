package lesson01;

import java.util.Scanner;

public class Price {
public static void main (String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Price :");
	//int price=1000;
	int price=sc.nextInt();
	double tax=price*0.2; //price*20/100;
	System.out.print("Percent :");
    double percent=sc.nextDouble();
	
	System.out.println("DDS of price : "+tax);
}
}
