package week_13;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.*;
class myPanel2 extends JPanel{
	Random r;
	public myPanel2(){
		super();
		r = new Random();
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		for(int i = 0 ; i < 20 ; i++){
			Font f = new Font("Arial",Font.PLAIN,r.nextInt(30));
			g2d.setColor(new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256)));
			g2d.setFont(f);
			g2d.drawString(Question4.ss, r.nextInt(500), r.nextInt(500));
		}
	}
}
public class Question4 {
	public static String ss = "";
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your message : ");
		ss = s.nextLine();
		JFrame frame = new JFrame();
		frame.setLayout(new GridLayout(1,1));
		myPanel2 p = new myPanel2();
		p.setBackground(new Color(0,0,0));
		frame.getContentPane().add(p);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ActionListener a = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				p.repaint();
			}
		};
		Timer t = new Timer(1000,a);
		t.setRepeats(true);
		t.start();
		frame.setVisible(true);
	}

}
