package week08;
import javax.swing.JFrame;
import javax.swing.JComponent;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.Random;
import java.awt.BasicStroke;
class RandomLine extends JComponent{
	private double x1;
	private double x2;
	private double y1;
	private double y2;
	private Random rnd = new Random();
	public RandomLine(){
		x1 = 0;
		x2 = 0;
		y1 = 0;
		y2 = 0;
	}
	public void paintComponent(Graphics g){
		Line2D.Double ld = new Line2D.Double(x1, y1, x2, y2);
		Graphics2D g2 = (Graphics2D)g;
		Random r = new Random();
		for(int i = 0; i < 20; i++){
			x1 = rnd.nextDouble() * 500;
			x2 = rnd.nextDouble() * 500;
			y1 = rnd.nextDouble() * 500;
			y2 = rnd.nextDouble() * 500;
			ld.setLine(x1, y1, x2, y2);
			g2.setColor(new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),255));
			g2.setStroke(new BasicStroke(rnd.nextFloat() * 10));
			g2.draw(ld);
		}
	}
}
public class Question3 {
	public static void main(String[] args){
		JFrame myFrame = new JFrame();
		myFrame.setTitle("Random Line");
		myFrame.setSize(500, 500);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RandomLine rl = new RandomLine();
		myFrame.add(rl);
		myFrame.setVisible(true);
	}
}
