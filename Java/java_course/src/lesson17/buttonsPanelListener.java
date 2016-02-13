package lesson17;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import lesson17.HWTest.PanelButtons;

public class buttonsPanelListener implements ActionListener {

	static String buttonPanelName;
	
	@Override
	public void actionPerformed(ActionEvent e) {
	 
		JButton button = (JButton)e.getSource();
        String label = button.getText();
        buttonPanelName=label;
		JOptionPane.showMessageDialog(null, "Вашето число е "+Button.yourNumber()+". Пуснете си Мейдън и пийте една бира!");
	}

}

 
