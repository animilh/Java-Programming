package hw15;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ShapesDrawing {

	static final int width = 1024;
	static final int heigth = 768;

	static Color getColorToString(Object color) {
		if ("WHITE".equals(color))
			return Color.WHITE;
		if ("YELLOW".equals(color))
			return Color.YELLOW;
		if ("ORANGE".equals(color))
			return Color.ORANGE;
		if ("RED".equals(color))
			return Color.RED;
		if ("BLUE".equals(color))
			return Color.BLUE;
		if ("GREEN".equals(color))
			return Color.GREEN;

		return Color.BLACK;
	}

	public static void main(String[] args) {

		String[] shapes = { "Square", "Circle" };
		Object myShape = JOptionPane.showInputDialog(null, "Choose a shape",
				"Shape", JOptionPane.PLAIN_MESSAGE, null, shapes, shapes[0]);
		System.out.println(myShape);

		String numberOfShapes = JOptionPane
				.showInputDialog("Enter number of shapes to be drawn");
		System.out.println(numberOfShapes);
		int number = Integer.parseInt(numberOfShapes);

		String distanceShapes = JOptionPane
				.showInputDialog("Enter distance between shapes");
		System.out.println(distanceShapes);
		int distance = Integer.parseInt(distanceShapes);

		Object[] colors = { "WHITE", "YELLOW", "ORANGE", "RED", "BLUE", "GREEN" };
		Object myColor = JOptionPane.showInputDialog(null, "Choose a color",
				"Color", JOptionPane.PLAIN_MESSAGE, null, colors, colors[0]);
		System.out.println(myColor);

		JFrame frame = new JFrame("Drawing Shapes");
		frame.setSize(width, heigth);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		
//		JPanel panel=new JPanel(){
//			@Override
//			public void paintComponent(Graphics g){
//		}
		
		JPanel panel;
		if ("Square".equals(myShape)) {
			panel = new SquarePanel(0, 0, 150, number, distance,
					getColorToString(myColor));
		} else {
			panel = new CirclePanel(0, 0, 150, number, distance,
					getColorToString(myColor));
		}
		frame.add(panel);
		frame.setVisible(true);

	}

}
