package lesson15;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class DrawingTrianglePanel extends JPanel {
	
	int xx;
	int yy;
	int zz;
	
	DrawingTrianglePanel(int x, int y, int z){
		this.xx=x;
		this.yy=y;
		this.zz=z;
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);	
		this.setBackground(Color.BLUE);
		int []width={this.getWidth()/2,this.getWidth()/2+this.zz,this.getWidth()/2};
		int []heigth={this.getHeight()/2,this.getHeight()/2,this.getHeight()/2+zz};
		Color c=Color.RED;
		g.setColor(c);
		g.fillPolygon(width,heigth, 3);
	}
	
}
