package week8;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class Question1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Question 1");
		frame.setSize(300,160);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p1 = new JPanel();
		JCheckBox c1 = new JCheckBox("Snap to Grid");
		c1.setHorizontalAlignment(SwingConstants.CENTER);
		c1.setVerticalAlignment(SwingConstants.BOTTOM);
		JCheckBox c2 = new JCheckBox("Show Grid");
		c2.setHorizontalAlignment(SwingConstants.CENTER);
		c2.setVerticalAlignment(SwingConstants.TOP);
		p1.setLayout(new GridLayout(2,1));
		p1.add(c1);
		p1.add(c2);
		JPanel p2 = new JPanel();

		JTextField f2 = new JTextField();
		f2.setColumns(3);
		JTextField f1 = new JTextField();
		f1.setColumns(3);
		
		JPanel p3 = new JPanel();
		JButton b1 = new JButton("OK");
		b1.setAlignmentX(Component.CENTER_ALIGNMENT);
		JButton b2 = new JButton("Cancel");
		JButton b3 = new JButton("Help");
		FlowLayout fl_p3 = new FlowLayout(FlowLayout.CENTER, 5, 10);
		p3.setLayout(fl_p3);
		
		p3.add(b1);
		p3.add(b2);
		p3.add(b3);
		
		frame.getContentPane().setLayout(new GridLayout(1,3));
		frame.getContentPane().add(p1);
		
		SpringLayout l = new SpringLayout();
		p2.setLayout(l);
		JLabel ff1 = new JLabel("X: ");
		ff1.setHorizontalAlignment(SwingConstants.RIGHT);
		ff1.setVerticalAlignment(SwingConstants.BOTTOM);
		ff1.setLabelFor(f1);
		l.putConstraint(SpringLayout.WEST,ff1,20,SpringLayout.WEST,p2);
		l.putConstraint(SpringLayout.NORTH,ff1,28,SpringLayout.NORTH,p2);
		p2.add(ff1);
		l.putConstraint(SpringLayout.WEST, f1, 40, SpringLayout.WEST, p2);
		l.putConstraint(SpringLayout.NORTH,f1,28,SpringLayout.NORTH,p2);
		p2.add(f1);
		JLabel ff2 = new JLabel("Y: ");
		ff2.setHorizontalAlignment(SwingConstants.RIGHT);
		ff2.setVerticalAlignment(SwingConstants.TOP);
		ff2.setLabelFor(f2);
		l.putConstraint(SpringLayout.WEST,ff2,20,SpringLayout.WEST,p2);
		l.putConstraint(SpringLayout.NORTH,ff2,69,SpringLayout.NORTH,p2);
		p2.add(ff2);
		l.putConstraint(SpringLayout.WEST, f2, 40, SpringLayout.WEST, p2);
		l.putConstraint(SpringLayout.NORTH,f2, 69,SpringLayout.NORTH,p2);
		p2.add(f2);
		frame.getContentPane().add(p2);
		frame.getContentPane().add(p3);
		frame.setVisible(true);
	}

}
