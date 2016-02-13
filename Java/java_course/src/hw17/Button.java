package hw17;

import java.awt.Color;

import javax.swing.JButton;

class Button extends JButton {
	private Color color;
	boolean isClicked;

	Button(String text, Color color) {
		super(text);
		this.setBackground(color);
		this.color = this.getBackground();
	}

	public static Button getClickedButton(Button b) {
		if (b.isClicked) {
			return b;
		}
		return null;
	}

	static String yourNumber() {
		String yourNumber = "666";
		if ("BLUE".equals(HWTest.PanelButtons.clickedButtonName)) {
			if ("      5     10     27     33      "
					.equals(buttonsPanelListener.buttonPanelName)) {
				yourNumber = "27";
			}
			if ("      18     3     6     8      "
					.equals(buttonsPanelListener.buttonPanelName)) {
				yourNumber = "3";
			}
			if ("      2     15     11     19      "
					.equals(buttonsPanelListener.buttonPanelName)) {
				yourNumber = "19";
			}
			if ("      35     0     22     1      "
					.equals(buttonsPanelListener.buttonPanelName)) {
				yourNumber = "35";
			}
		}

		if ("GREEN".equals(HWTest.PanelButtons.clickedButtonName)) {
			if ("      5     10     27     33      "
					.equals(buttonsPanelListener.buttonPanelName)) {
				yourNumber = "5";
			}
			if ("      18     3     6     8      "
					.equals(buttonsPanelListener.buttonPanelName)) {
				yourNumber = "8";
			}
			if ("      2     15     11     19      "
					.equals(buttonsPanelListener.buttonPanelName)) {
				yourNumber = "15";
			}
			if ("      35     0     22     1      "
					.equals(buttonsPanelListener.buttonPanelName)) {
				yourNumber = "22";
			}
		}

		if ("PINK".equals(HWTest.PanelButtons.clickedButtonName)) {
			if ("      5     10     27     33      "
					.equals(buttonsPanelListener.buttonPanelName)) {
				yourNumber = "10";
			}
			if ("      18     3     6     8      "
					.equals(buttonsPanelListener.buttonPanelName)) {
				yourNumber = "18";
			}
			if ("      2     15     11     19      "
					.equals(buttonsPanelListener.buttonPanelName)) {
				yourNumber = "11";
			}
			if ("      35     0     22     1      "
					.equals(buttonsPanelListener.buttonPanelName)) {
				yourNumber = "1";
			}
		}

		if ("YELLOW".equals(HWTest.PanelButtons.clickedButtonName)) {
			if ("      5     10     27     33      "
					.equals(buttonsPanelListener.buttonPanelName)) {
				yourNumber = "33";
			}
			if ("      18     3     6     8      "
					.equals(buttonsPanelListener.buttonPanelName)) {
				yourNumber = "6";
			}
			if ("      2     15     11     19      "
					.equals(buttonsPanelListener.buttonPanelName)) {
				yourNumber = "2";
			}
			if ("      35     0     22     1      "
					.equals(buttonsPanelListener.buttonPanelName)) {
				yourNumber = "0";
			}
		}

		return yourNumber;

	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}