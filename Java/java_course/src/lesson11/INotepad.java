package lesson11;

public interface INotepad {

	public void addText(int number, String text);

	public void overwriteText(int number, String text);

	public void deleteText(int number);

	public void printAllPages();

	public boolean searchWord(String word);

	public void printAllPagesWithDigits();

}
