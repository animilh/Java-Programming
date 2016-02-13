package hw11;

public class SimpleNotepad implements INotepad {

	private static final int NUMBER_OF_PAGES = 3;
	Page[] notebook;
	int number;

	// constructor
	SimpleNotepad() {

	}

	SimpleNotepad(int numberOfPages) {
		if (numberOfPages > 0) {
			notebook = new Page[numberOfPages];

		} else {
			notebook = new Page[NUMBER_OF_PAGES];

		}
		for (int i = 0; i < numberOfPages; i++) {
			notebook[i] = new Page("title" + (i + 1), "");
		}
	}

	// methods

	@Override
	public boolean searchWord(String word) {
		if (word == null || word.equals("")) {
			System.out.println("Incorrect input for word");
			return false;
		}
		boolean containsWord = false;
		for (int i = 0; i < notebook.length; i++) {
			if (notebook[i].searchWord(word)) {
				containsWord = true;
				return containsWord;
			}
		}
		return containsWord;
	}

	@Override
	public void printAllPagesWithDigits() {
		for (int i = 0; i < notebook.length; i++) {
			if (notebook[i].containsDigits()) {
				System.out.println(notebook[i].reviewText());
			}
		}
	}

	private boolean checkPageNumber(int number) {
		return number >= 0 && number < this.notebook.length;
	}

	public void addText(int number, String text) {
		if (checkPageNumber(number)) {
			notebook[number].addText(notebook[number].normalize(text));
		} else {
			System.out.println("Bad input for page number");
		}
	}

	public void overwriteText(int number, String text) {
		if (checkPageNumber(number)) {
			notebook[number].deleteText();

			notebook[number].setText(notebook[number].normalize(text));
		} else {
			System.out.println("Bad input for page number");
		}
	}

	public void deleteText(int number) {
		if (checkPageNumber(number)) {
			notebook[number].deleteText();
		} else {
			System.out.println("Bad input for page number");
		}
	}

	public void printAllPages() {
		if (checkPageNumber(number)) {
			for (int i = 0; i < NUMBER_OF_PAGES; i++) {
				if (notebook[i] != null) {
					System.out.println(notebook[i].reviewText());
				}
			}
		} else {
			System.out.println("Bad input for page number");
		}

	}

	public Page[] getNotebook() {
		return notebook;
	}

	public void setNotebook(Page[] notebook) {
		this.notebook = notebook;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public static int getNumberOfPages() {
		return NUMBER_OF_PAGES;
	}

}
