package week08;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JComponent;
class Saver extends JComponent{
	private int lineCount;
	private Random r;
	public Saver(){
		lineCount = 0;
		r = new Random();
	}
	public void paintComponent(Graphics g){
		int x = r.nextInt(500);
		int y = r.nextInt(500);
		for(int i = 0 ; i < lineCount ; i++){
			g.drawLine(x, y, r.nextInt(500), r.nextInt(500));
			x = r.nextInt(500);
			x = r.nextInt(500);
		}
		g.drawString("line : " + lineCount, 100,100);
		lineCount++;
		if(lineCount == 101) lineCount = 0;
		try{Thread.sleep(50);}catch(Exception e){}
		repaint();
	}
}
public class Question6 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Saver");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Saver r = new Saver();
		frame.add(r);
		frame.setVisible(true);
	}

}
