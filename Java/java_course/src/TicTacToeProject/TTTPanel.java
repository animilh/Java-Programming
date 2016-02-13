package TicTacToeProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TTTPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Font myTextFont = new Font("Aharoni", Font.BOLD, 21);
	static Color backColor = new Color(64, 224, 208); // 64-224-208
	// game states PLAYING,EQUAL,XWON,OWON
	public static final int PLAYING = 0;
	public static final int EQUAL = 1;
	public static final int XWON = 2; // player1 win the game
	public static final int OWON = 3; // player2 win the game

	private JLabel label;
	private JButton playButton;
	private CellsPanel board;
	private boolean xTurn = false; // player1 turn
	private boolean oTurn = false; // player2 turn
	private int gameState;
	private Player player1;
	private Player player2;
	private int rows;
	private int fontSize;

	TTTPanel(Player player1, Player player2, int rows) {

		this.player1 = player1;
		this.player2 = player2;
		setRows(rows);

		BorderLayout b = new BorderLayout();
		this.setLayout(b);

		JPanel p = new JPanel(new FlowLayout());
		label = new JLabel();
		label.setText("It's " + player1.getName() + "'s turn");
		label.setAlignmentY(CENTER_ALIGNMENT);
		p.add(label);
		label.setFont(myTextFont);
		p.setBackground(backColor);
		playButton = new JButton("Play");
		p.add(playButton);
		playButton.setFont(myTextFont);
		playButton.setBackground(Color.WHITE);
		playButton.setVisible(false);
		this.add(BorderLayout.NORTH, p);

		JPanel pe = new JPanel();
		pe.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
		pe.setBackground(backColor);
		this.add(BorderLayout.EAST, pe);

		JPanel pw = new JPanel();
		pw.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
		pw.setBackground(backColor);
		this.add(BorderLayout.WEST, pw);

		JPanel ps = new JPanel();
		ps.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
		ps.setBackground(backColor);
		ps.add(new JTextArea());
		this.add(BorderLayout.SOUTH, ps);

		board = new CellsPanel(rows);
		board.setBackground(backColor);
		this.add(BorderLayout.CENTER, board);
		initGame();

		playButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				initGame();
			}

		});

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				board.getCells()[i][j].addActionListener((new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						JButton clickedButton = (JButton) e.getSource();
						play(clickedButton);
					}
				}));
			}
		}
	}

	protected void play(JButton clickedButton) {
		// TODO Auto-generated method stub
		int i = rows - 3;
		fontSize = 100 - i * 13;

		if (gameState == PLAYING) {
			if (xTurn && isEnabled(clickedButton)) {
				clickedButton.setText(player1.getSign());
				clickedButton.setForeground(Color.RED);
				clickedButton.setFont(new Font("Aharoni", Font.BOLD, fontSize));
				// clickedButton.setEnabled(false);
				updateGameState(clickedButton);

			}
			if (oTurn && isEnabled(clickedButton)) {
				clickedButton.setText(player2.getSign());
				clickedButton.setForeground(new Color(46, 139, 87));
				clickedButton.setFont(new Font("Aharoni", Font.BOLD, fontSize));
				// clickedButton.setEnabled(false);
				updateGameState(clickedButton);
			}
		}
	}

	private boolean isEnabled(JButton clickedButton) {
		// TODO Auto-generated method stub
		return "".equals(clickedButton.getText());
	}

	private void updateGameState(JButton clickedButton) {
		// check if Player1 has won the game
		if (hasWon(player1.getSign())) {
			gameState = XWON;
			label.setText(player1.getName()
					+ " win the game! Click Play to start it again.");
			playButton.setVisible(true);
			return;
		}

		// check if Player2 has won the game
		else if (hasWon(player2.getSign())) {
			gameState = OWON;
			label.setText(player2.getName()
					+ " win the game! Click Play to start it again.");
			playButton.setVisible(true);
			return;
		}

		// check if the game is equal
		else if (isEqual()) {
			gameState = EQUAL;
			label.setText("The game is equal! Click Play to start it again.");
			label.setAlignmentY(LEFT_ALIGNMENT);
			playButton.setVisible(true);
			playButton.setAlignmentY(RIGHT_ALIGNMENT);
			return;
		}
		// still playing
		gameState = PLAYING;
		changePlayerTurn();

	}

	private boolean hasWon(String symbol) {
		// TODO Auto-generated method stub
		int count = 0;

		// check the main diagonal for win
		for (int i = 0; i < rows; i++) {

			if (symbol.equals(board.getCells()[i][i].getText())) {
				count++;
			}
		}
		if (count == rows) {
			return true;
		}
		count = 0;

		// check the second diagonal for win
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				if (i + j == rows - 1) {
					if (symbol.equals(board.getCells()[i][j].getText())) {
						count++;
					}
				}

			}
		}

		if (count == rows) {
			return true;
		}

		count = 0;

		// check the rows for win
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				if (symbol.equals(board.getCells()[i][j].getText())) {
					count++;
				}
			}

			if (count == rows) {
				return true;
			} else {
				count = 0;
			}
		}
		// check the colons for win
		for (int j = 0; j < rows; j++) {
			for (int i = 0; i < rows; i++) {
				if (symbol.equals(board.getCells()[i][j].getText())) {
					count++;
				}
			}

			if (count == rows) {
				return true;
			}
			count = 0;

		}
		return false;
	}

	private boolean isEqual() {
		// TODO Auto-generated method stub
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				if ("".equals(board.getCells()[i][j].getText())) {
					return false;
				}
			}
		}
		return true;
	}

	private void changePlayerTurn() {
		// TODO Auto-generated method stub
		if (xTurn) {
			xTurn = false;
			oTurn = true;
			label.setText("It's " + player2.getName() + "'s turn");
		} else {
			xTurn = true;
			oTurn = false;
			label.setText("It's " + player1.getName() + "'s turn");
		}

	}

	protected void initGame() {
		// TODO Auto-generated method stub
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				board.getCells()[i][j].setText("");
				board.getCells()[i][j].setEnabled(true);
			}
		}
		xTurn = true;
		label.setText("It's " + player1.getName() + "'s turn");
		playButton.setVisible(false);
		gameState = PLAYING;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {

		if (rows < 3) {
			System.out
					.println("Bad input for number of rows. Please input rows >= 3 !");
			return;
		}

		this.rows = rows;
	}
}
