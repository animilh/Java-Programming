package lesson15;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TestDrawing  { 
	
	public static void main(String[] args) {  
		
		String x=JOptionPane.showInputDialog("Input the size x :");
		System.out.println(x);
		int xx=Integer.parseInt(x);
		
		String y=JOptionPane.showInputDialog("Input the size y :");
		System.out.println(y);
		int yy=Integer.parseInt(y);
		
		String z=JOptionPane.showInputDialog("Input the size z :");
		System.out.println(z);
		int zz=Integer.parseInt(z);
		
		JFrame f=new JFrame("Triangle");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setSize(xx, yy);
//		f.setResizable(false); // ne moje da promenqme razmerite na prozoreca
		JPanel panel=new DrawingTrianglePanel(xx,yy,zz);
		//add components to the panel
		
		f.add(panel);
//		
//		JButton b=new JButton("Click me");
//		JCheckBox ch=new JCheckBox();
//		ch.setLabel("Check Box");
//		JFileChooser file= new JFileChooser();
//	
//		panel.add(b, null);
//		panel.add(ch, null);
//		panel.add(file, null);
		
		f.setVisible(true);
		
	}

}

