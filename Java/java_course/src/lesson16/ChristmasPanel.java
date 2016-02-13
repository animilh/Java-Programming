package lesson16;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ChristmasPanel extends JPanel {
	private JTextArea label;
	private JButton button;
	private JButton button2;
	
	public ChristmasPanel() {
		button = new JButton("click me");
		this.add(button);
		
		button2 = new JButton("click me 2");
		this.add(button2);
		
		label = new JTextArea();
		this.add(label);
		//text = new JLabel("MERRY CHRISTMAS AND HAPPY NEW YEAR!");
		//text.setVisible(false);
		
		ButtonListener listener = new ButtonListener();
		
		button.addActionListener(listener);
		button2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("");
				button2.setText("Haha");
			}
		});
		
		
//		button.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				text.setText("MERRY CHRISTMAS AND HAPPY NEW YEAR!");
//				//text.setVisible(true);
//				//text.setText(text.getText() + " MERRY CHRISTMAS AND HAPPY NEW YEAR!");
//			}
//		});
		

	}
	
	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setText("MERRY CHRISTMAS AND HAPPY NEW YEAR!");
			System.out.println("Merry christmas");
			//text.setVisible(true);
			//text.setText(text.getText() + " MERRY CHRISTMAS AND HAPPY NEW YEAR!");
		}
	}
}