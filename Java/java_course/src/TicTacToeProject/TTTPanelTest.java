package TicTacToeProject;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TTTPanelTest {

	public static void main(String[] args) {

		JFrame f = new JFrame("Sea Chess");
		f.setSize(600, 600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		ArrayList<String> signList = new ArrayList();
		signList.add("X");
		signList.add("O");
		signList.add("#");
		signList.add("@");
		String[] signArray = signList.toArray(new String[signList.size()]);

		String rows = JOptionPane
				.showInputDialog("Enter the dimensions of the board n X n :");
		int row = Integer.parseInt(rows);

		String namePlayer1 = JOptionPane.showInputDialog(
				"Enter the name of Player1 :", "Player1");
		Object sign1 = JOptionPane.showInputDialog(null,
				"Please choose a sign", "Choose sign",
				JOptionPane.QUESTION_MESSAGE, null, signArray, signArray[0]);
		String signPlayer1 = (String) sign1;

		signList.remove(sign1);
		signArray = signList.toArray(new String[signList.size()]);

		String namePlayer2 = JOptionPane.showInputDialog(
				"Enter the name of Player2 :", "Player2");
		Object sign2 = JOptionPane.showInputDialog(null,
				"Please choose a sign", "Choose sign",
				JOptionPane.QUESTION_MESSAGE, null, signArray, signArray[0]);

		
		String signPlayer2 = (String) sign2;

		Player player1 = new Player(namePlayer1, signPlayer1);
		Player player2 = new Player(namePlayer2, signPlayer2);

		JPanel p = new TTTPanel(player1, player2, row);

		f.add(p);
		f.setVisible(true);

	}

}
