package lesson17;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuessPanel extends JPanel {
		private JLabel labelGuess;
		GuessPanel(){
			this.setLayout(new FlowLayout(FlowLayout.CENTER,0,20));
	//		labelGuess.setText("������ ����� � "+HWTest.yourNumber());
			this.add(labelGuess);
			this.setBackground(Color.WHITE);
			labelGuess.setFont(HWTest.newTextFont);
			
			
		}
	}

