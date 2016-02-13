package hw17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import hw17.Button;
import hw17.HWTest.PanelButtons;

public class buttonsListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		JButton button = (JButton) e.getSource();
		String label = button.getText();

		PanelButtons pb = new PanelButtons();
		pb.clickedButtonName = label;

		JFrame f = new JFrame("Познай числото");
		f.setSize(1000, 900);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(pb);
		f.setVisible(true);

	}

}
