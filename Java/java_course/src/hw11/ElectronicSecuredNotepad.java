package hw11;

public class ElectronicSecuredNotepad extends SecuredNotepad implements
		IÅlectronicDevice {

	// attributes

	boolean isStarted;

	// constructor

	ElectronicSecuredNotepad(int numberOfPages, String password) {
		super(numberOfPages, password);
		this.isStarted=false;
	}

	// methods

	@Override
	public void addText(int number, String text) {
		if (!this.isStarted()) {
			System.out
					.println("The Electronic Secured Notepad has been stopped.");
		} else {
			super.addText(number, text);
		}
	}

	@Override
	public void overwriteText(int number, String text) {
		if (!this.isStarted()) {
			System.out
					.println("The Electronic Secured Notepad has been stopped.");
		} else {
			super.overwriteText(number, text);
		}
	}

	@Override
	public void deleteText(int number) {
		if (!this.isStarted()) {
			System.out
					.println("The Electronic Secured Notepad has been stopped.");
		} else {
			super.deleteText(number);
		}
	}

	@Override
	public void printAllPages() {
		if (!this.isStarted()) {
			System.out
					.println("The Electronic Secured Notepad has been stopped.");
		} else {
			super.printAllPages();
		}
	}

	@Override
	public void start() {
		System.out.println("Strating the Electronic Secured Notepad");
		this.isStarted = true;

	}

	@Override
	public void stop() {
		System.out.println("Stopping the Electronic Secured Notepad");
		this.isStarted = false;

	}

	@Override
	public boolean isStarted() {
		return this.isStarted;
	}

}
