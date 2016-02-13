package lesson15;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameTest {
	public static void main(String[] args) {
		JFrame f=new JFrame("Drawing Program");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setSize(1000, 700);
		f.setResizable(true); // ne moje da promenqme razmerite na prozoreca
		JPanel panel=new JPanel();
		//add components to the panel
		
		f.add(panel);
		
		f.setVisible(true);
		
		
		}

}
