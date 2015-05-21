package week10;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.Date;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

class CarComponent2 extends JComponent{
	Car car1 = new Car(0, 0);	
	Car car2 = new Car(240,230);
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		car1.draw(g2);
		car2.draw(g2);
	}
	public void nextRender(){
		car1.setxLeft(car1.getxLeft()+1);
		car2.setxLeft(car2.getxLeft()-1);
		this.repaint();
	}
}

public class Question6 {
	public static void main(String[] args) {
		CarComponent2 component = new CarComponent2();
		ActionListener task = new ActionListener(){
			public void actionPerformed(ActionEvent event){
				component.nextRender();
			}
		};
		JFrame frame = new JFrame();
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(component);

		Timer t = new Timer(17,task);
		t.setRepeats(true);
		t.start();
		frame.setVisible(true);
	}

}
