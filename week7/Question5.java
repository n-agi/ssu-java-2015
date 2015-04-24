package week08;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JComponent;
class Radius extends JComponent{
	private double r;
	private double diameter;
	private double circumference;
	private double area;
	public Radius(double r){
		this.r = r;
		this.diameter = 2 * r;
		this.circumference = 2 * Math.PI * r;
		this.area = Math.PI * r * r;
	}
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D)g;
		Ellipse2D e= new Ellipse2D.Double(10, 10, r, r);
		g2.draw(e);
		g2.drawString("Area="+area,10,100);
		g2.drawString("Diameter="+diameter,10,130);
		g2.drawString("Circumference="+circumference,10,160);
	}
	
}
public class Question5 {

	public static void main(String[] args) {
		double radius = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Radius : ");
		radius = s.nextDouble();
		JFrame frame = new JFrame();
		frame.setTitle("Radius");
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Radius r = new Radius(radius);
		frame.add(r);
		frame.setVisible(true);
	}

}
