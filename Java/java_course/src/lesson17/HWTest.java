package lesson17;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import lesson17.HWTest.PanelButtons;
import lesson17.LayoutTest.PanelNorth;
import lesson17.LayoutTest.PanelSouth;
import lesson17.Button;

public class HWTest {

	static Font newTextFont=new Font("Serif", Font.BOLD, 21); 
  
	
	
	static class PanelNorth extends JPanel{
		private JLabel label;
		PanelNorth(){
			this.setLayout(new FlowLayout(FlowLayout.CENTER,0,20));
			label=new JLabel();
//			label.setText("Please choose a number below and say it load TWO times!");
			label.setText("Изберете си число и го кажете силно 2-3 пъти");
			this.add(label);
			this.setBackground(Color.WHITE);
			label.setFont(newTextFont);
			
		}
	}
	
	static class PanelSouth extends JPanel{
	  static Button button;
		static Button button1;
		static Button button2;
   	   static Button button3;
		JLabel label;
		PanelSouth(){
			this.setLayout(new BorderLayout());
			label=new JLabel("      Натиснете бутона, чийто цвят е и вашето число");
			this.add(label,BorderLayout.NORTH);
			this.setBackground(Color.WHITE);
			label.setFont(newTextFont);			
			
			 button=new Button("BLUE",Color.BLUE);

			 button1= new Button("GREEN",Color.GREEN);

			 button2= new Button("PINK",Color.PINK);

			 button3=new Button("YELLOW",Color.YELLOW);

			
			JPanel pss=new JPanel();
			pss.setLayout(new FlowLayout(FlowLayout.CENTER,5,10));
			pss.add(button);
			pss.add(button1);
			pss.add(button2);
			pss.add(button3);
			pss.setBackground(Color.WHITE);
			this.add(pss,BorderLayout.SOUTH);
			

			button.addActionListener(new buttonsListener());
			button1.addActionListener(new buttonsListener());
			button2.addActionListener(new buttonsListener());
			button3.addActionListener(new buttonsListener());
				
				
	}
		
		
	}
	
	
	
	static class PanelCenter extends JPanel{
		
		JTextField a11=new JTextField("5");
		JTextField a12=new JTextField("18");
		JTextField a13=new JTextField("2");
		JTextField a14=new JTextField("35");
		JTextField a21=new JTextField("10");
		JTextField a22=new JTextField("3");
		JTextField a23=new JTextField("15");
		JTextField a24=new JTextField("0");		
		
		JTextField a31=new JTextField("27");
		JTextField a32=new JTextField("6");
		JTextField a33=new JTextField("11");
		JTextField a34=new JTextField("22");
		JTextField a41=new JTextField("33");
		JTextField a42=new JTextField("8");
		JTextField a43=new JTextField("19");
		JTextField a44=new JTextField("1");
		
		PanelCenter(){
			this.setLayout(new GridLayout(4, 4));
			this.add(a11);
			a11.setBackground(Color.GREEN);
			a11.setEditable(false);
			a11.setSize(10, 10);
			a11.setFont(newTextFont);
			a11.setHorizontalAlignment(JTextField.CENTER);
			this.add(a12);
			a12.setBackground(Color.PINK);
			a12.setEditable(false);
			a12.setFont(newTextFont);
			a12.setHorizontalAlignment(JTextField.CENTER);
			this.add(a13);
			a13.setBackground(Color.YELLOW);
			a13.setEditable(false);
			a13.setFont(newTextFont);
			a13.setHorizontalAlignment(JTextField.CENTER);
			this.add(a14);
			a14.setBackground(Color.BLUE);
			a14.setEditable(false);
			a14.setFont(newTextFont);
			a14.setHorizontalAlignment(JTextField.CENTER);
			this.add(a21);
			a21.setBackground(Color.PINK);
			a21.setEditable(false);
			a21.setFont(newTextFont);
			a21.setHorizontalAlignment(JTextField.CENTER);
			this.add(a22);
			a22.setBackground(Color.BLUE);
			a22.setEditable(false);
			a22.setFont(newTextFont);
			a22.setHorizontalAlignment(JTextField.CENTER);
			this.add(a23);
			a23.setBackground(Color.GREEN);
			a23.setEditable(false);
			a23.setFont(newTextFont);
			a23.setHorizontalAlignment(JTextField.CENTER);
			this.add(a24);
			a24.setBackground(Color.YELLOW);
			a24.setEditable(false);
			a24.setFont(newTextFont);
			a24.setHorizontalAlignment(JTextField.CENTER);
			this.add(a31).setBackground(Color.BLUE);
			a31.setEditable(false);
			a31.setFont(newTextFont);
			a31.setHorizontalAlignment(JTextField.CENTER);
			this.add(a32).setBackground(Color.YELLOW);
			a32.setEditable(false);
			a32.setFont(newTextFont);
			a32.setHorizontalAlignment(JTextField.CENTER);
			this.add(a33).setBackground(Color.PINK);
			a33.setEditable(false);
			a33.setFont(newTextFont);
			a33.setHorizontalAlignment(JTextField.CENTER);
			this.add(a34).setBackground(Color.GREEN);
			a34.setEditable(false);
			a34.setFont(newTextFont);
			a34.setHorizontalAlignment(JTextField.CENTER);
			
			this.add(a41).setBackground(Color.YELLOW);
			a41.setEditable(false);
			a41.setFont(newTextFont);
			a41.setHorizontalAlignment(JTextField.CENTER);
			this.add(a42).setBackground(Color.GREEN);
			a42.setEditable(false);
			a42.setFont(newTextFont);
			a42.setHorizontalAlignment(JTextField.CENTER);
			this.add(a43).setBackground(Color.BLUE);
			a43.setEditable(false);
			a43.setFont(newTextFont);
			a43.setHorizontalAlignment(JTextField.CENTER);
			this.add(a44).setBackground(Color.PINK);
			a44.setEditable(false);
			a44.setFont(newTextFont);
			a44.setHorizontalAlignment(JTextField.CENTER);
			
		}
	}
		
		static class PanelButtons extends JPanel{
		static String clickedButtonName;	
		 static	Button buttonPan1;
		 static Button buttonPan2;
		 static Button buttonPan3;
		 static Button buttonPan4;
			JLabel label;
			PanelButtons(){
				this.setLayout(new BorderLayout());
				label=new JLabel("     Натиснете бутона, който съдържа вашето число");
				this.add(label,BorderLayout.NORTH);
				this.setBackground(Color.WHITE);
				label.setFont(newTextFont);			
				
				buttonPan1=new Button("      5     10     27     33      ",Color.RED);
				buttonPan2=new Button("      18     3     6     8      ",Color.YELLOW);

				buttonPan3=new Button("      2     15     11     19      ",Color.CYAN);

				buttonPan4=new Button("      35     0     22     1      ",Color.ORANGE);

				
				JPanel pss=new JPanel();
				pss.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
				pss.add(buttonPan1);
				pss.add(buttonPan2);
				pss.add(buttonPan3);
				pss.add(buttonPan4);
				pss.setBackground(Color.WHITE);
				this.add(pss,BorderLayout.SOUTH);				

				buttonPan1.addActionListener(new buttonsPanelListener());
				buttonPan2.addActionListener(new buttonsPanelListener());
				buttonPan3.addActionListener(new buttonsPanelListener());
				buttonPan4.addActionListener(new buttonsPanelListener());
 				}
			
		}
		
		
		
	

	}
	



