package lesson16;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class IncDecPanel {
	
	public static void main(String[] args) {
		
		String numberX = JOptionPane.showInputDialog("Enter value between 1 to 10");
		System.out.println(numberX);
		int number = Integer.parseInt(numberX);
		
		JFrame f=new JFrame("Encripting/Decripting text");
		f.setSize(1024, 768);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(true);
		
		JPanel panel=new Panel();
		f.add(panel);	
		f.setVisible(true);
		
		
		
	}

}
