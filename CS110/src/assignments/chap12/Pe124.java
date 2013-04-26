package assignments.chap12;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Pe124 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		frame.setTitle("Exercise12_4");
		MyPanel panel1 = new MyPanel("button1", "button2", "button3");
		MyPanel panel2 = new MyPanel("button4", "button5", "button6");
		frame.add(panel1);
		frame.add(panel2);
		frame.pack();
		frame.setVisible(true);

		}

}
