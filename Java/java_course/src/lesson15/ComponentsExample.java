package lesson15;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ComponentsExample {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Components Examples");
		frame.setSize(700, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel=new JPanel();
		frame.add(panel);
		
//		JLabel l = new JLabel("Some text");
//		frame.add(l);
//		
//		JButton button=new JButton("Click here");
//		frame.add(button);
//		button.setEnabled(true);
		
//		JTextField field = new JTextField(30);
//		frame.add(field);
//		field.setText("Some text in the field");
//		
		JTextArea te = new JTextArea(5, 10);
		panel.add(te);
//		field.getText();
//		te.getText();
    	
		te.setText("Text in the text area.\n Some text ...");
		te.setEnabled(true);
		
		JScrollPane sp = new JScrollPane(te);
		panel.add(sp);
		
		frame.setVisible(true);
	}

}
