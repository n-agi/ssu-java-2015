package week09;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Question6 {
	private static int[] c = new int[2];
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
				c[0]++;
				l.setText("I was clicked " + c[0] + " times.");
			}
		});
		JButton bb = new JButton("Click me");
		JLabel ll = new JLabel("I was clicked 0 times.");
		bb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				c[1]++;
				ll.setText("I was clicked " + c[1] + " times.");
			}
		});
		JPanel top = new JPanel();
		top.add(b);
		top.add(l);
		JPanel bottom = new JPanel();
		bottom.add(bb);
		bottom.add(ll);
		frame.getContentPane().add(top, BorderLayout.NORTH);
		frame.getContentPane().add(bottom, BorderLayout.SOUTH);
		frame.setVisible(true);
	}

}
