package lesson18_calculator;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import lesson18_calculator.CalculatorPanels.CenterPanel;
import lesson18_calculator.CalculatorPanels.NorthPanel;

public class CalculatorDemo {
public static void main(String[] args) {
	JFrame f=new JFrame("Calculator");
	f.setSize(400, 400);
	f.setResizable(false);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JPanel p=new JPanel();
	JPanel pn=new NorthPanel();
	JPanel pc=new CenterPanel();
	
	p.setLayout(new BorderLayout());
	p.add(pn,BorderLayout.NORTH);
	p.add(pc,BorderLayout.CENTER);
	
	f.add(p);
	f.setVisible(true);
	
	
}
}
