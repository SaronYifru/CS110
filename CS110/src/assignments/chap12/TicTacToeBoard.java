package assignments.chap12;

import java.awt.*;
import javax.swing.*;

public class TicTacToeBoard extends JFrame {
	private final int INTEGERVALUEFORX = 1;
	private final int INTEGERVALUEFORO = 0;
	final int HORIZONTALDIMENSION = 230;
	final int VERTICALDIMENSION = 230;
	private final int ROWSINGRID = 3;
	private final int COLUMNSINGRID = 3;
	private final int NUMBEROFSLOTS = 9;
	private ImageIcon iconX = new ImageIcon("src/x.gif");
	private ImageIcon iconO = new ImageIcon("src/o.gif");

	public TicTacToeBoard() {
		setLayout(new GridLayout(ROWSINGRID, COLUMNSINGRID));
		setSize(HORIZONTALDIMENSION, VERTICALDIMENSION);
		for (int i = 0; i < NUMBEROFSLOTS; i++) {
			int integer = (int) (Math.random() * 3);
			if (integer == INTEGERVALUEFORX) {
				add(new JLabel(iconX, JLabel.CENTER));
			} else if (integer == INTEGERVALUEFORO) {
				add(new JLabel(iconO, JLabel.CENTER));
			} else {
				add(new JLabel());
			}

		}

	}

	public static void main(String[] args) {
		String NAMEOFBOARD = "Exercise 12_7";
		TicTacToeBoard ticTacToe = new TicTacToeBoard();
		ticTacToe.setTitle(NAMEOFBOARD);
		ticTacToe.setVisible(true);
	}

}
