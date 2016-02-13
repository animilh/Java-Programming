package calculator;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CalculatorPanel extends JPanel {
	private JTextArea text;
	private ButtonsPanel buttons;
	private String upString="";
	private String downString="";
	private int result=0;
	private String action="+";
	
	public CalculatorPanel(){
		BorderLayout b = new BorderLayout();
		this.setLayout(b);
		
		text = new JTextArea(2,10);
		text.setFont(ButtonsPanel.font);
		this.add(text, BorderLayout.NORTH);
		
		buttons = new ButtonsPanel();
		this.add(buttons, BorderLayout.CENTER);
		
		JButton[] digitButtons=buttons.getDigitButtons();
		
		for(int i=0;i<digitButtons.length;i++){
			digitButtons[i].addActionListener(new digitButtonListener());
		}
		
		
		buttons.getDiv().addActionListener(new operationListener());
		buttons.getSub().addActionListener(new operationListener());
		buttons.getSum().addActionListener(new operationListener());
		buttons.getMul().addActionListener(new operationListener());		
		buttons.getMc().addMouseListener(new clearListener());
		buttons.getEq().addActionListener(new equalsListener());
				
	}
	
	private class equalsListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			upString="";
			downString=""+result;
			text.setText(upString + "\n" + downString);			
		}
		
	}
	
	private class operationListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				JButton clickedOperation= (JButton) arg0.getSource();
				String textClicked=clickedOperation.getText();
				int newNumber=Integer.parseInt(downString);	
				
				if("+".equals(action)){
					result=result+newNumber;					
				}
				else if("-".equals(action)){
					result=result-newNumber;					
				}
				else if("*".equals(action)){
					result=result*newNumber;					
				}
				else {
					result=result/newNumber;					
				}
				action=textClicked;
				System.out.println(result);
				upString=upString+downString+action;
				downString="";
				text.setText(upString+"\n"+downString);
				
			}

	}
	 
	 private class clearListener implements MouseListener {

		
		@Override
		public void mouseClicked(MouseEvent e) {
			
			if (e.getButton() == MouseEvent.BUTTON1) {
				downString="";
				text.setText(upString+"\n"+downString);
			}
			else if(e.getButton() == MouseEvent.BUTTON3) {
				downString="";
				upString="";
				result=0;
				action="+";
				text.setText(upString+"\n"+downString);
			}

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		 
	 }
	 
	 private class digitButtonListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton clicked = (JButton) e.getSource();
				String t = "";

				downString = downString
						+ clicked.getText();
				t = upString + "\n" + downString;
				text.setText(t);
				
				
		}
	}
}

