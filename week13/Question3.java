package week_13;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Date;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

class myPanel extends JPanel implements MouseMotionListener, Runnable{
	Font f;
	int x;
	int y;
	String data;
	public void setData(String d){
		setSize(500,500);
		this.data = d;
	}
	public myPanel(){
		super();
		data = "";
		f = new Font("Arial",Font.BOLD,45);
		addMouseMotionListener(this);
		Thread t = new Thread(this);
		t.start();
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(new Color(255,0,0));
		g2d.setFont(f);
		g2d.drawString(data, x,y);
	}
	@Override
	public void mouseDragged(MouseEvent arg0) {
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		
	}
	@Override
	public void run() {
		while(true){
		repaint();
		try {
			Thread.sleep(16);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
public class Question3 {
	public static void main(String args[]){
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(1,1));
		myPanel p = new myPanel();
		p.setBackground(Color.GREEN);
		frame.getContentPane().add(p);
		ActionListener a = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Date date = new Date();
				long t1 = date.getTime();
				p.setData((t1 / 1000 / 60 / 60) % 24 + ":" + (t1 / 1000 / 60) % 60 + ":" + (t1 / 1000) % 60);
			}
		};
		Timer timer = new Timer(1000,a);
		timer.setRepeats(true);
		timer.start();
		
		frame.setVisible(true);
	}
	
}
