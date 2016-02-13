package hw15;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class CirclePanel extends JPanel {

	int x;
	int y;
	int side;
	int number;
	int distance;
	Color color;

	CirclePanel(int x, int y, int side, int number, int distance, Color color) {
		setX(x);
		setY(y);
		setSide(side);
		setNumber(number);
		setDistance(distance);
		setColor(color);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(this.color);
		for (int i = 0; i < number; i++) {
			g.drawOval(x + i * this.distance, y + i * this.distance, side, side);
		}

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if (x < 0) {
			System.out.println("Bad input for x.");
			return;
		}
		this.x = x;
	}

	public int getY() {

		return y;
	}

	public void setY(int y) {
		if (y < 0) {
			System.out.println("Bad input for y.");
			return;
		}
		this.y = y;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		if (side < 0) {
			System.out.println("Bad input for side.");
			return;
		}
		this.side = side;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		if (number < 0) {
			System.out.println("Bad input for number of shapes.");
			return;
		}
		this.number = number;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		if (distance < 0) {
			System.out.println("Bad input for distance between shapes.");
			return;
		}
		this.distance = distance;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		if ("".equals(color)) {
			this.color = Color.BLACK;
		}
		this.color = color;

	}

}
