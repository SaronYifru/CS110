package assignments.eventhandling;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventExample extends JFrame{
	public EventExample() {
		
		JPanel p = new JPanel();
		JTextField tf = new JTextField(12);
		tf.addActionListener(new TFHandler());
		JButton b = new JButton("Press Me");
		JButton b2 = new JButton("No, Press Me");
		JButton b3 = new JButton("Active Button");
		JTextField tf1 = new JTextField("Key", 12);
		ButtonHandler handler = new ButtonHandler(tf);
		b2.addActionListener(handler);
		b.addActionListener(handler);
		b3.addMouseListener(new MouseTracker());
		tf1.addKeyListener(new KeyTracker());
		p.add(b3);
		p.add(b2);
		p.add(tf);
		p.add(b);
		p.add(tf1);
		add(p);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		EventExample event = new EventExample();
		
		
	}
	class ButtonHandler implements ActionListener {
         private JTextField tf;
         public ButtonHandler(JTextField tf) {
        	 this.tf = tf;
         }
		@Override
		public void actionPerformed(ActionEvent arg0) {
			JButton b = (JButton) arg0.getSource();
			String text = b.getText();
			tf.setText(text);
			
		}
		
	}
	class TFHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			JTextField tf = (JTextField) arg0.getSource();
			String s = tf.getText();
			System.out.println(s);
		}
		
	}
	class MouseTracker implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			System.out.println("Enter...");
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			System.out.println("Exit");
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	class KeyTracker implements KeyListener {

		@Override
		public void keyPressed(KeyEvent arg0) {
			char character = arg0.getKeyChar();
			System.out.print(character);
			
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
