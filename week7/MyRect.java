package week08;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
public class MyRect extends JComponent {
	private int x;
	private int y;
	private int width;
	private int height;
	public MyRect(){
		x = 0;
		y = 0;
		width = 40;
		height = 40;
	}
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D)g;
		Rectangle r1 = new Rectangle(x, y, width, height);
		for(int i = 0; i < 10; i++){
			x += 10;
			y += 10;
			width += 10;
			height += 10;
			r1.setBounds(x, y, width, height);
			g2.draw(r1);
		}
	}
}
