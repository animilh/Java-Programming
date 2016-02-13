package hw17;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import hw17.HWTest.PanelCenter;
import hw17.HWTest.PanelNorth;
import hw17.HWTest.PanelSouth;

public class GuessTest {

	public static void main(String[] args) {

		JFrame f = new JFrame("Познай числото");
		f.setSize(1245, 1000);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();
		JPanel pn = new PanelNorth();
		JPanel ps = new PanelSouth();
		JPanel pc = new PanelCenter();

		p.setLayout(new BorderLayout());
		p.add(pc, BorderLayout.CENTER);
		p.add(pn, BorderLayout.NORTH);
		p.add(ps, BorderLayout.SOUTH);

		f.add(p);
		f.setVisible(true);

	}

}
