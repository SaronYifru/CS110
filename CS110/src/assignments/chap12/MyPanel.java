package assignments.chap12;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
	public MyPanel(String button1, String button2, String button3) {
    	this.setLayout(new FlowLayout());
		this.add(new JButton(button1));
    	this.add(new JButton(button2));
    	this.add(new JButton(button3));
    }
}
