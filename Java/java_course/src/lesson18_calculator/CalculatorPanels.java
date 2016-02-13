package lesson18_calculator;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CalculatorPanels {
	static Font font = new Font("Verdana",Font.BOLD, 25);
	static String upString="";
	static String downString="";
	static JTextArea textField;
	
	static class NorthPanel extends JPanel {
		
		
		NorthPanel(){
			this.setLayout(new FlowLayout());
			textField=new JTextArea(2,50);
			textField.setFont(font);
			textField.setEditable(false);
			this.add(textField);			
		}		
	}
	
	static class CenterPanel extends JPanel{
		final static int rows=4;
		final static int cols=4;
		
		private JButton[][] buttons;
		
		
	   CenterPanel(){
		   this.setLayout(new GridLayout(4,4,8,8));
		   buttons=new JButton[rows][cols];
		   for(int i=0;i<rows;i++){
			   for(int j=0;j<cols;j++){
				   buttons[i][j]=new JButton();
				   buttons[i][j].setFont(font);				   
				   this.add(buttons[i][j]);
				   buttons[i][j].addActionListener(new buttonsListener());
			   }
		   }
		   
		   //row 1
		   buttons[0][0].setText("7");
	//	   buttons[0][0].addActionListener(new buttonsListener());
		   buttons[0][1].setText("8");
		//   buttons[0][1].addActionListener(new buttonsListener());
		   buttons[0][2].setText("9");
		   buttons[0][3].setText("+");
		   
		   //row 2
		   buttons[1][0].setText("4");
		   buttons[1][1].setText("5");
		   buttons[1][2].setText("6");
		   buttons[1][3].setText("-");
		   
		   //row 3
		   buttons[2][0].setText("1");
		   buttons[2][1].setText("2");
		   buttons[2][2].setText("3");
		   buttons[2][3].setText("*");
		   
		   //row 4
		   buttons[3][0].setText("0");
		   buttons[3][1].setText("C");
		   buttons[3][2].setText("=");
		   buttons[3][3].setText("/");
		   
	   }
		
		
	}
	
	private static class buttonsListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton clicked = (JButton) e.getSource();
			String t="";
			
//			for (int i=0;i<=9;i++){
//				if(clicked.getText().equals(i)){
					downString=downString+clicked.getText();
					t=upString+"\n"+downString;
					textField.setText(t);
							
//				}
//			}

		}

	}

}
