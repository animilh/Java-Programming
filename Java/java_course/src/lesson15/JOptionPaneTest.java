package lesson15;

import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;

class Page{
	private String text;
	private String title;
	
	Page(String text,String title){
		this.text=text;
		this.title=title;
	}
	
	@Override
	public String toString(){
		return this.getTitle()+" | "+this.getText();
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}

public class JOptionPaneTest {
public static void main(String[] args) {
//	JOptionPane.showMessageDialog(null, "Gagagaga");
//	 JOptionPane.showMessageDialog(null, "New gagagga", "Title", JOptionPane.WARNING_MESSAGE);
//	 JOptionPane.showMessageDialog(null,"Hey zdrawej :)","New Title ",JOptionPane.INFORMATION_MESSAGE);
//	 
	 int choice=JOptionPane.showConfirmDialog(null, "Are you female ?", "Confirm Message",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
	 System.out.println(choice);
	 
	 String name=JOptionPane.showInputDialog("Enter your name :","name");
	 System.out.println("Your name is : "+name);
	 String[] car={"BMW","LADA","Gofl","Pegeot"};
	 Object myCar=JOptionPane.showInputDialog(null, "Your car is", "Select car", JOptionPane.QUESTION_MESSAGE,null , car, null);
	 System.out.println(myCar);
	 
	 Page [] pages=new Page[2];
	 pages[0]=new Page("Text1","title1");
	 pages[1]=new Page("Text2","title2");
	 
	 Object myPage=JOptionPane.showInputDialog(null, "Please choose a page", "Choose page", JOptionPane.QUESTION_MESSAGE, null, pages, pages[0]);
	 System.out.println(myPage);
	 
	 String radioButton=JRadioButtonMenuItem()
}
}

