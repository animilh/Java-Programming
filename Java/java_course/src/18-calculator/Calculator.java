package calculator;

import javax.swing.JFrame;

public class Calculator {
	public static void main(String[] args) {
		JFrame f = new JFrame("Calculator");
		f.setSize(400, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CalculatorPanel calcPanel = new CalculatorPanel();
		f.add(calcPanel);
		f.setVisible(true);
	}
}
