package week08;
import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
class Spiral extends JComponent{
	public Spiral(){
	}
	public void paintComponent(Graphics g){
		int[] xdata = new int[30];
		int[] ydata = new int[30];
		int theta = 45;
		final int x = 300;
		final int y = 300;
		final int r = 45;
		for(int i = 0 ; i < 30 ; i++){
			xdata[i] = (int)(x + r * Math.sin(theta) * i / 8);
			ydata[i] = (int)(y - r * Math.cos(theta) * i / 8); 
			theta += 45;
		}
		Graphics2D g2 = (Graphics2D)g;
		g.drawPolyline(xdata, ydata, 30);
	}
}
public class Question2 {
	
	public static void main(String[] args){
		JFrame myFrame = new JFrame();
		myFrame.setTitle("Spiral");
		myFrame.setSize(500, 500);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Spiral sp = new Spiral();
		myFrame.add(sp);
		myFrame.setVisible(true);
	}
}
