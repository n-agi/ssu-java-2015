package week09;

import javax.swing.*;

import java.awt.*;
import java.awt.geom.Ellipse2D;
class circle extends JComponent{
	private int x;
	private int y;
	private int radius;
	public circle(int x, int y, int radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void paint(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.RED);
		g2d.fillOval(x, y, radius/2, radius/2);

	}
}
public class Question7 {

	public static void main(String[] args) {
		String stringInput = JOptionPane.showInputDialog("Enter x.");
		int x = Integer.parseInt(stringInput);
		stringInput = JOptionPane.showInputDialog("Enter y.");
		int y = Integer.parseInt(stringInput);
		stringInput = JOptionPane.showInputDialog("Enter radius.");
		int radius = Integer.parseInt(stringInput);
		JFrame frame = new JFrame();
		frame.getContentPane().add(new circle(x,y,radius));
		frame.setSize(300,160);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
