package hw16;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class EncryptionPanelDemo {
	static int x;

	public static void main(String[] args) {

		String numberX = JOptionPane
				.showInputDialog("Enter value between 1 to 10");
		System.out.println(numberX);
		x = Integer.parseInt(numberX);

		JFrame f = new JFrame("Encripting/Decripting text");
		f.setSize(1024, 768);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);// po dobre da e false da ne se chupi

		EncryptionPanel panel = new EncryptionPanel();
		System.out.println(panel.getButtonClear().getText());

		f.add(panel);
		panel.setBackground(Color.ORANGE);

		f.setVisible(true);

	}

}
