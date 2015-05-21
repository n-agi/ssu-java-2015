package week10;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
class Circle extends JComponent{
	private int cx;
	private int cy;
	private int radius;
	@Override
	public void paint(Graphics g){
		System.out.println("x: "+cx);
		System.out.println("y: "+cy);
		System.out.println("rad: "+radius);
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.drawRect(0, 0, 9999, 9999);
		g2d.fillRect(cx-5,cy-5,10,10);
		g2d.drawOval((cx-radius), (cy-radius), (int)radius*2, (int)radius*2);
	}
	public int ggetX() {
		return cx;
	}
	public void setX(int x) {
		this.cx = x;
	}
	public int ggetY() {
		return cy;
	}
	public void setY(int y) {
		this.cy = y;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}
public class Question2 {

	static final Circle c = new Circle();
	static class Mouse implements MouseListener{
		int clicked=0;
		public void mousePressed(MouseEvent arg0){
			if(clicked == 0){
			c.setX(arg0.getX());
			c.setY(arg0.getY());
			clicked++;
			}
			else if (clicked == 1){
				double a =(arg0.getX() - c.ggetX());
				double b =(arg0.getY() - c.ggetY());
				c.setRadius((int)Math.sqrt(a*a+b*b));
				c.repaint();
				clicked++;
			}
	
		}
		@Override
		public void mouseClicked(MouseEvent arg0) {
		}
		@Override
		public void mouseEntered(MouseEvent arg0) {}
		@Override
		public void mouseExited(MouseEvent arg0) {}
		@Override
		public void mouseReleased(MouseEvent arg0) {}
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MouseListener m = new Mouse();
		c.addMouseListener(m);
		frame.getContentPane().setPreferredSize(new Dimension(100,100));
		frame.getContentPane().setLayout(new GridLayout(1,1));
		frame.getContentPane().add(c,BorderLayout.CENTER);
		frame.setVisible(true);
	}

}
