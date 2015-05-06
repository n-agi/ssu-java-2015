package week8;
import javax.swing.*;

import java.util.Random;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Rectangle;
class rect extends JComponent{
	private List<Rectangle> squares = new ArrayList<Rectangle>();
	public void addSquare(int x, int y, int width, int height){
		squares.add(new Rectangle(x,y,width,height));
	}
	public void paint(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		Random r = new Random();
		for(Rectangle rect : squares){
			g2.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
			g2.draw(rect);
		}
	}
}
public class Question7 {

	public static void main(String[] args) {
		String stringInput = JOptionPane.showInputDialog("Enter number.");
		int i = Integer.parseInt(stringInput);
		JFrame frame = new JFrame();
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rect r = new rect();
		Random rr = new Random();
		for(int l = 0 ; l < i ; l++){
			int x= rr.nextInt(300);
			int y= rr.nextInt(300);
			r.addSquare(x, y, rr.nextInt(300-x), rr.nextInt(300-y));
		}
		frame.getContentPane().add(r);
		frame.setVisible(true);
	}
		   

}
