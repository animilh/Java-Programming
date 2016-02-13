package lesson16;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Panel extends JPanel {
	
	private JComboBox combo; 
	private JButton buttonEnc;
	private JButton buttonClear;
	private JLabel label1;
	private JTextField field;
	private JLabel label2;
	private JTextArea textArea;
	
	Object[] c={"Encript","Decript"};
	
	Panel()
	{
		combo=new JComboBox(c);
		this.add(this.combo);
		
		label1=new JLabel("Text to encrypt.");
		this.add(this.label1);
		
		field=new JTextField(15);
		this.add(field);
		
		buttonEnc=new JButton("Encrypt");
		this.add(buttonEnc);
		buttonEnc.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		buttonClear=new JButton("Clear");
		this.add(buttonClear);
		
		textArea=new JTextArea(3,15);
		this.add(textArea);
		
		label2=new JLabel("Info change Encryption/Decryption mode");
		this.add(this.label2);
		
		
	}
}
