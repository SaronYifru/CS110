package assignments.chap12;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Pe122 {

	public static void main(String[] args) {
		JFrame frame1 = new JFrame();
		frame1.setLayout(new BorderLayout());
		//create the two panels
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		//set the layout of the panels to FlowLayout
		panel1.setLayout(new FlowLayout());
		panel2.setLayout(new FlowLayout());
		//add buttons to panel1
		panel1.add(new JButton("Button1"));
		panel1.add(new JButton("Button2"));
		panel1.add(new JButton("Button3"));
		//add buttons to panel2
		panel2.add(new JButton("Button4"));
		panel2.add(new JButton("Button5"));
		panel2.add(new JButton("Button6"));
		//add panels to frame
		frame1.add(panel1, BorderLayout.CENTER);
		frame1.add(panel2, BorderLayout.SOUTH);
		frame1.pack();
		frame1.setTitle("Exercise12_2");
		frame1.setVisible(true);
		
	}

}
