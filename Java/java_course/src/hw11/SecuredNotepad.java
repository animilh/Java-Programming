package hw11;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {

	String password;

	SecuredNotepad secNotepad;
	String inputPass;
	Scanner input = new Scanner(System.in);

	// constructor

	SecuredNotepad(int numberOfPages, String password) {
		super(numberOfPages);
		if (strongPassword(password)) {
			setPassword(password);
		} else {			
			throw new IllegalArgumentException("Your password is not strong! It must be at least 5 symbols long and have to contain at least 1 symbol from each group - (A-Z),(a-z),(0-9)");
		}
	}

	// methods

	private boolean strongPassword(String password) {
		if(password == null || (password
				.length() < 5)){
			return false;			
		}
		
		boolean hasLowerCases = false;
		boolean hasUpperCases = false;
		boolean hasDigit = false;
		for (int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);
			
			if (Character.isLowerCase(ch)) {
				hasLowerCases = true;
				
			}
			if (Character.isUpperCase(ch)) {
				hasUpperCases = true;
				
			}

			if (Character.isDigit(ch)) {
				hasDigit = true;
				
			}
		}
		return (hasLowerCases && hasUpperCases && hasDigit);

	}

	private boolean validPassword() {

		System.out.println("Insert a password:");
		inputPass = input.nextLine();
		// input.close();
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
