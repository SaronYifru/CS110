package assignments.chap12;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TicTacToeBoard extends JFrame {
	private final int INTEGERVALUEFORX = 1;
	private final int INTEGERVALUEFORO = 0;
	
	private final int ROWSINGRID = 3;
	private final int COLUMNSINGRID = 3;
	
	public TicTacToeBoard() {
		setLayout(new GridLayout(ROWSINGRID, COLUMNSINGRID));
		for (int i = 0; i < 9; i++) {
			int integer = (int)(Math.random() * 3);
			if (integer == INTEGERVALUEFORX) {
				add(new JLabel("X", JLabel.CENTER));
			}
			else if(integer == INTEGERVALUEFORO) {
				add(new JLabel("O", JLabel.CENTER));
			}
			else {
				add(new JLabel());
			}
			
		}
		
	}
	public static void main(String[] args) {
		final String NAMEOFBOARD = "Exercise 12_7";
		final int HORIZONTALDIMENSION = 230;
		final int VERTICALDIMENSION = 230;
		TicTacToeBoard ticTacToe = new TicTacToeBoard();
		ticTacToe.setTitle(NAMEOFBOARD);
		ticTacToe.setSize(HORIZONTALDIMENSION, VERTICALDIMENSION);
		ticTacToe.setVisible(true);
	}
	
	

	
}	
	


