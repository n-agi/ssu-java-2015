package week8;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
class rect2 extends JComponent{
	public void paint(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Question8.c);
		g2.fillRect(105, 50, 80, 80);
	}
}
public class Question8 {
	public static Color c = new Color(0,0,0);
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(300, 300);
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		JRadioButton r1 = new JRadioButton("RED");
		JRadioButton r2 = new JRadioButton("GREEN");
		JRadioButton r3 = new JRadioButton("BLUE");
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		p.add(r1);
		p.add(r2);
		p.add(r3);
		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout(1,1));
		JButton b = new JButton("Change Color");
		rect2 r = new rect2();
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(r1.isSelected())
				{
					c = new Color(255,0,0);
					r.repaint();
					
				}
				else if(r2.isSelected()){
					c = new Color(0,255,0);
					r.repaint();
				}
				else if(r3.isSelected()){
					c = new Color(0,0,255);
					r.repaint();
				}
			}
		});
		p3.add(b);
		JPanel bp = new JPanel();
		bp.setLayout(new BorderLayout());
		bp.add(r,BorderLayout.CENTER);
		
		frame.add(p,BorderLayout.NORTH);
		frame.add(bp,BorderLayout.CENTER);
		frame.add(p3,BorderLayout.SOUTH);
		frame.setVisible(true);
		
	}

}
