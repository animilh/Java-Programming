package lesson11;

public class Page {

	// attributes

	private String title;
	private String text;

	// constructor

	Page(String title, String text) {
		this.setText(text);
		this.setTitle(title);
	}

	// methods
	
	public boolean searchWord(String word){
		if(word==null){
			System.out.println("Incorrect searched word.");
			return false;
		}
		else{
		return this.text.contains(word);
		}
	}
	
	public boolean containsDigits(){
		char[] s=this.text.toCharArray();
	    Boolean foundNum = false;
	    for (int i = 0; i < s.length; i++){
	    	if(Character.isDigit(s[i])){
	    		foundNum=true;
	    		break;
	    	}
	    }
		return foundNum;
	}

	public void addText(String newText) {
		if (newText != null) {
			this.text = this.text + " " + normalize(newText);
		} else {
			System.out.println("No text to add");
		}
	}

	public void deleteText() {
		this.text = "";// po dobre s "" prazen niz a ne s null
	}

	public String reviewText() {
		// System.out.println(this.getText());
		// System.out.println(this.getTitle());
		return this.getTitle() + "\n" + this.getText();

	}

	 String normalize(String text) {
		if (text == null || text.isEmpty()) {
			return "";
		} else {
			return text;
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title == null || title.equals("")) {
			System.out.println("Bad input for title");
			return;
		} else {
			this.title = title;
		}
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		if (text == null)  {
			System.out.println("Bad input for text");
			return;
		} else {
			this.text = text;
		}

	}
}
