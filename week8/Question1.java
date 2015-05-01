package week09;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.*;
import net.miginfocom.swing.MigLayout;

public class Question1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Question 1");
		frame.setSize(400,160);
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
		TextField f2 = new TextField();
		f2.setColumns(1);
		TextField f1 = new TextField();
		f1.setColumns(1);
		
		JPanel p3 = new JPanel();
		JButton b1 = new JButton("OK");
		b1.setAlignmentX(Component.CENTER_ALIGNMENT);
		JButton b2 = new JButton("Cancel");
		JButton b3 = new JButton("Help");
		Dimension d = new Dimension(30,10);
		FlowLayout fl_p3 = new FlowLayout(FlowLayout.CENTER, 5, 10);
		p3.setLayout(fl_p3);
		
		p3.add(b1);
		p3.add(b2);
		p3.add(b3);
		
		frame.getContentPane().setLayout(new GridLayout(1,3));
		frame.getContentPane().add(p1);
		frame.getContentPane().add(p2);
		p2.setLayout(new MigLayout("", "[128px]", "[13px][13px][13px][13px]"));
		JLabel ff1 = new JLabel("X: ");
		ff1.setHorizontalAlignment(SwingConstants.RIGHT);
		ff1.setVerticalAlignment(SwingConstants.BOTTOM);
		p2.add(ff1, "flowx,cell 0 1,grow");
		p2.add(f2, "cell 0 1,grow");
		
		JLabel ff2 = new JLabel("Y: ");
		ff2.setHorizontalAlignment(SwingConstants.RIGHT);
		ff2.setVerticalAlignment(SwingConstants.TOP);
		ff2.setLabelFor(f2);
		p2.add(ff2, "flowx,cell 0 3,grow");
		p2.add(f1, "cell 0 3,grow");
		frame.getContentPane().add(p3);
		frame.setVisible(true);
	}

}
