package assignments.chap12;

import java.awt.*;
import javax.swing.*;

public class Pe121 {

	public static void main(String[] args) {
		JFrame frame1 = new JFrame();
		frame1.setLayout(new FlowLayout());
		// create the two panels
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		// set the layout of the panels to FlowLayout
		panel1.setLayout(new FlowLayout());
		panel2.setLayout(new FlowLayout());
		// add buttons to panel1
		for (int i = 1; i <= 3; i++) {
			panel1.add(new JButton("Button" + String.valueOf(i)));
			panel2.add(new JButton("Button" + String.valueOf(i + 3)));
		}

		// add panels to frame
		frame1.add(panel1);
		frame1.add(panel2);
		frame1.pack();
		frame1.setTitle("Exercise12_1");
		frame1.setVisible(true);

	}

}
