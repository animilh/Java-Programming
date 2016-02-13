package hw16;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EncryptionPanel extends JPanel {

	private static final String ENCRYPT_ITEM_TEXT="Encrypt";
	private static final String DECRYPT_ITEM_TEXT="Decrypt";
	private JComboBox combo;
	private JButton buttonEnc;
	private JButton buttonClear;
	private JLabel label1;
	private JTextField field;
	private JLabel label2;
	private JTextArea textArea;
	private int asciiChar;
	private JScrollPane scroll;

	Object[] c = { ENCRYPT_ITEM_TEXT, DECRYPT_ITEM_TEXT };

	EncryptionPanel() {
		setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
		combo = new JComboBox(c);
		this.add(this.combo);
		comboBoxListener comboListener = new comboBoxListener();
		combo.addActionListener(comboListener);

		label1 = new JLabel("Text to encrypt.");
		this.add(this.label1);

		field = new JTextField(15);
		this.add(field);
		field.setBackground(Color.YELLOW);

		buttonEnc = new JButton(ENCRYPT_ITEM_TEXT);
		this.add(buttonEnc);
		buttonEnc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if ("".equals(field.getText())) {
					textArea.setText("");
				} else {
					if ("Encrypt".equals(buttonEnc.getText())) {

						textArea.setText(textArea.getText() + "\n"
								+ encrypth(field.getText()));

					} else {

						textArea.setText(textArea.getText() + "\n"
								+ decrypth(field.getText()));

					}
				}

			}

		});

		buttonClear = new JButton("Clear");
		this.add(buttonClear);
		buttonClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");

			}
		});
		textArea = new JTextArea(7, 15);
		scroll=new JScrollPane(textArea);
        this.add(scroll);
		
//		this.add(textArea);
		textArea.setAutoscrolls(true);
		textArea.setBackground(Color.YELLOW);
		
		
		
		

		label2 = new JLabel("Info change Encryption/Decryption mode");
		this.add(this.label2);

	}

	private class comboBoxListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			if (DECRYPT_ITEM_TEXT.equals(combo.getSelectedItem().toString())) {

				label1.setText("Text to decprypt");
				buttonEnc.setText(DECRYPT_ITEM_TEXT);
				label2.setText("Info : press this button to clear the text area");

			} else {
				label1.setText("Text to encprypt");
				buttonEnc.setText(ENCRYPT_ITEM_TEXT);
				label2.setText("Info change Encryption/Decryption mode");
			}
		}
	}

	public String encrypth(String text) {
		if ("".equals(text)) {
			System.out.println("Bad input for text");
			return "";
		}
		String encText = "Encrypt:\n";
		encText+=text;
		encText+="->";

		char[] a = text.toCharArray();
		for (int i = 0; i < a.length; i++) {
			asciiChar = (int) a[i] + EncryptionPanelDemo.x + i-1;
			a[i] = (char) asciiChar;
			encText += a[i];

		}

		return encText;
	}

	public String decrypth(String text) {
		if ("".equals(text)) {
			System.out.println("Bad input for text");
			return "";
		}
		String decText = "Decrypt:\n"+text+"->";
		char[] a = text.toCharArray();
		for (int i = 0; i < a.length; i++) {
			asciiChar = (int) a[i] - EncryptionPanelDemo.x - i+1;
			a[i] = (char) asciiChar;
			decText += a[i];
		}
		return decText;

	}

	public JButton getButtonClear() {
		return buttonClear;
	}

	public void setButtonClear(JButton buttonClear) {
		this.buttonClear = buttonClear;
	}

}
