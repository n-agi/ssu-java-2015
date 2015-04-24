package week08;
import javax.swing.JFrame;
import javax.swing.JComponent;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.util.Random;
class randRect extends JComponent{
	private Random r = new Random();
	
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D)g;
		
		for(int i = 0 ; i <20 ; i++){
			int x = r.nextInt(500);
			int y = r.nextInt(500);
			Rectangle2D rect = new Rectangle(x, y, r.nextInt(500-x), r.nextInt(500-y));
			g2.setColor(new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),255));
			g2.setStroke(new BasicStroke(r.nextFloat() * 10));
			g2.draw(rect);
		}
	}
	
}
public class Question4 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Rect");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		randRect r = new randRect();
		frame.add(r);
		frame.setVisible(true);
	}

}
