package calculator;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonsPanel extends JPanel {
	
	static Font font = new Font("Verdana", Font.BOLD, 25);
	private JButton[] digitButtons;
	private JButton sum;
	private JButton sub;
	private JButton mul;
	private JButton div;
	private JButton eq;
	private JButton mc;

	public ButtonsPanel() {
		setLayout(new GridLayout(4, 4, 10, 10));

		digitButtons = new JButton[10];
		for (int i = 0; i < digitButtons.length; i++) {
			digitButtons[i] = new JButton(i + "");
//			digitButtons[i].addActionListener(new digitButtonListener());
			digitButtons[i].setFont(font);
		}

		sum = new JButton("+");
		sum.setFont(font);
		sub = new JButton("-");
		sub.setFont(font);
		mul = new JButton("*");
		mul.setFont(font);
		div = new JButton("/");
		div.setFont(font);
		eq = new JButton("=");
		eq.setFont(font);
		mc = new JButton("C");
		mc.setFont(font);
		
		// first row
		this.add(digitButtons[7]);
		this.add(digitButtons[8]);
		this.add(digitButtons[9]);
		this.add(sum);

		// second row
		this.add(digitButtons[4]);
		this.add(digitButtons[5]);
		this.add(digitButtons[6]);
		this.add(sub);

		// third row
		this.add(digitButtons[1]);
		this.add(digitButtons[2]);
		this.add(digitButtons[3]);
		this.add(mul);

		// fourth row
		this.add(digitButtons[0]);
		this.add(mc);
		this.add(eq);
		this.add(div);
	}
	
	public JButton[] getDigitButtons() {
		return digitButtons;
	}

	public void setDigitButtons(JButton[] digitButtons) {
		this.digitButtons = digitButtons;
	}

	public JButton getSum() {
		return sum;
	}

	public void setSum(JButton sum) {
		this.sum = sum;
	}

	public JButton getSub() {
		return sub;
	}

	public void setSub(JButton sub) {
		this.sub = sub;
	}

	public JButton getMul() {
		return mul;
	}

	public void setMul(JButton mul) {
		this.mul = mul;
	}

	public JButton getDiv() {
		return div;
	}

	public void setDiv(JButton div) {
		this.div = div;
	}

	public JButton getEq() {
		return eq;
	}

	public void setEq(JButton eq) {
		this.eq = eq;
	}

	public JButton getMc() {
		return mc;
	}

	public void setMc(JButton mc) {
		this.mc = mc;
	}

	
}
