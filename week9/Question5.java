package week09;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Question5 {
	private static int c;
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(300,160);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		JButton b = new JButton("Click me");
		JLabel l = new JLabel("I was clicked 0 times.");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				c++;
				l.setText("I was clicked " + c + " times.");
			}
		});
		frame.getContentPane().add(b, BorderLayout.NORTH);
		frame.getContentPane().add(l, BorderLayout.CENTER);
		frame.setVisible(true);
	}

}
