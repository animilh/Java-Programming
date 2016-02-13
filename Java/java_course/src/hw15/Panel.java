package hw15;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel extends JPanel {
	
	JComboBox combo; 
	JButton buttonEnc;
	JButton buttonClear;
	JLabel label1;
	JTextField field1;
	JLabel label2;
	JTextField field2;
	
	Object[] c={"Encript","Decript"};
	
	Panel()
	{
		combo=new JComboBox(c);
		this.add(combo);
		
		buttonEnc=new JButton("Encrypt");
		buttonClear=new JButton("Clear");
	}
}
