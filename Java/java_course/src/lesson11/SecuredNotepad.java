package lesson11;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {

	String password;
	
	String inputPass;
	Scanner input = new Scanner(System.in);

	// constructor

	SecuredNotepad(int numberOfPages, String password) {
		super(numberOfPages);
		setPassword(password);
	}

	// methods

	private boolean validPassword() {
		
		System.out.println("Insert a password:");
		inputPass = input.nextLine();
//		input.close();
		return (inputPass.equals(password));
	}
	
	@Override
	public void addText(int number, String text) {
		if (validPassword()) {
			super.addText(number, text);
		} else {
			System.out.println("Incorrect password!");
		}

	}
   @Override
	public void overwriteText(int number, String text) {
		if (validPassword()) {
			super.overwriteText(number, text);
		} else {
			System.out.println("Incorrect password!");
		}
	}
   @Override
	public void deleteText(int number) {
		if (validPassword()) {
			super.deleteText(number);
		} else {
			System.out.println("Incorrect password!");
		}
	}
   @Override
	public void printAllPages() {
		if (validPassword()) {
			super.printAllPages();
		} else {
			System.out.println("Incorrect password!");
		}
	}
   
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password == null || password.equals("")) {
			System.out.println("Bad input for password");
		}
		this.password = password;
	}

}
