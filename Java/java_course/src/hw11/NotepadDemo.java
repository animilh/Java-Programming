package hw11;

public class NotepadDemo {
	public static void main(String[] args) {

		INotepad notepad = new SimpleNotepad(3);
		
		notepad.addText(0, "Wednesday");
		notepad.addText(0, "12/11/2014");
		notepad.addText(1, "Thursday");
		notepad.addText(1, "13/11/2014");
		notepad.addText(2, "No digits!");
		notepad.printAllPagesWithDigits();

		ElectronicSecuredNotepad eSecuredNotepad = new ElectronicSecuredNotepad(
				3, "6azsxJ");
		eSecuredNotepad.start();
		eSecuredNotepad.addText(0, "Dobyr den");
		eSecuredNotepad.addText(1, "Guten Morgen");
		eSecuredNotepad.printAllPages();
		eSecuredNotepad.stop();
		
		INotepad notepad3 = new ElectronicSecuredNotepad(3,"iop");
		
		if(notepad3 instanceof ElectronicSecuredNotepad){
			ElectronicSecuredNotepad e1 = (ElectronicSecuredNotepad) notepad3 ;
			e1.start();
			e1.stop();
		}

	}
}
