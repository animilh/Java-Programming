package lesson11;

public class NotepadDemo {
	public static void main(String[] args) {

		SimpleNotepad notepad = new SimpleNotepad(3);
		notepad.addText(0, "contains numbers");
		notepad.addText(0, "Wednesday 12/11/2014");
		notepad.addText(1, "do not contains numbers");
		notepad.printAllPages();

		SecuredNotepad securedNotepad = new SecuredNotepad(3, "qwer");
		securedNotepad.addText(0, "Dobyr den");
		securedNotepad.addText(1, "Guten Morgen");
		securedNotepad.printAllPages();

		INotepad notepad1 = new SimpleNotepad(3);
		notepad1.addText(0, "srqda ");
		notepad1.addText(0, "12/11/2014");
		notepad1.addText(1, "chetwyrtyk ");
		notepad1.addText(1, "13/11/2014");
		notepad1.addText(2, "No digits!");
		notepad1.printAllPagesWithDigits();

		// String str1="The text co7ntains a number";
		// System.out.println(str1.matches(".*\\d+.*"));
	}
}
