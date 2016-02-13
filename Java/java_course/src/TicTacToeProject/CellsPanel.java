package TicTacToeProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class CellsPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int rows;
	private int cols;
	Font font = new Font("Aharoni", Font.BOLD, 52);
	private JButton[][] cells;
	final static int vgap = 5;
	final static int hgap = 5;

	CellsPanel(int numberOfRows) {
		setRows(numberOfRows);
		setCols(numberOfRows);
		this.setLayout(new GridLayout(rows, cols, hgap, vgap));
		this.cells = new JButton[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				cells[i][j] = new JButton();
				cells[i][j].setText("");
				cells[i][j].setFont(font);
				cells[i][j].setBackground(Color.WHITE);
				this.add(cells[i][j]);
			}
		}

	}

	public JButton[][] getCells() {
		return cells;
	}

	public void setCells(JButton[][] cells) {
		this.cells = cells;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		if (rows <= 0) {
			System.out.println("Bad input for rows of the board");
		} else {
			this.rows = rows;
		}
	}

	public int getCols() {
		return cols;
	}

	public void setCols(int cols) {
		this.cols = cols;
	}
}
