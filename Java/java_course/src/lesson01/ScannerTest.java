package lesson01;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.print("Enter name: ");
		//String name = sc.nextLine();

		//System.out.print("Enter age:");
		//int age = sc.nextInt();
		//System.out.println("My name is " +name + " and I'm " + age+" years old!");
		System.out.println("My name is " + sc.nextLine());
	}
}
