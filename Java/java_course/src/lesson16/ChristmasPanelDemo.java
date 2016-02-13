package lesson16;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChristmasPanelDemo {
	
	public static void main(String[] args) {
		
		JFrame frame=new JFrame("Christmas Panel Demo");
		frame.setSize(1000, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		
		JPanel panel=new ChristmasPanel();
		frame.add(panel);
		
		frame.setVisible(true);
	}

}
