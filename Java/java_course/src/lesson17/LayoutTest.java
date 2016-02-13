package lesson17;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class LayoutTest {
	public static void main(String[] args) {
		// FlowLayout - layout po podrazbirane za JPanel , redi elementite w centyra kato gi mesti na lqwo, kato zapylni reda sliza na dolu i t.n. 
		JFrame f = new JFrame("Layout test");
		f.setSize(900, 900);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p=new JPanel();
		JPanel pn=new PanelNorth();
		JPanel ps=new PanelSouth();
		JPanel pw=new JPanel();
		pw.setLayout(new FlowLayout(FlowLayout.CENTER,150,0));
		pw.setBackground(Color.RED);
		JTextArea area=new JTextArea();
		p.setLayout(new BorderLayout());
		p.add(area, BorderLayout.CENTER);
		p.add(pn,BorderLayout.NORTH);
		p.add(ps,BorderLayout.SOUTH);
		p.add(pw,BorderLayout.WEST);
		
		
		f.add(p);
		f.setVisible(true);
		
	}
	
	static class PanelNorth extends JPanel{
		private JLabel label;
		PanelNorth(){
			this.setLayout(new FlowLayout(FlowLayout.RIGHT));
			label=new JLabel();
			label.setText("Test Border input");
			this.add(label);
		}
	}
	
	static class PanelSouth extends JPanel{
		JButton button;
		PanelSouth(){
			button=new JButton("Click me");
			this.setLayout(new FlowLayout(FlowLayout.LEFT,50,0));
			this.add(button);
		}
	}
	
}

