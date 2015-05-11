package homework2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
class myGUI extends JComponent{
	private int leftHeight =0;
	private int rightHeight = 0;
	public myGUI(){
		this.setPreferredSize(new Dimension(300,200));
	}
	@Override
	public void paint(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		//height : 110, (76,30,40,140), (216,30,40,140)
		g2d.setColor(new Color(0xdd,0xdd,0xdd));
		g2d.fillRect(50, 0, 9999, 9999);
		g2d.setColor(Color.RED);
		g2d.fillOval(68, 150, 50, 50);
		g2d.fillOval(208, 150, 50, 50);
		g2d.setColor(Color.PINK);
		g2d.fillRect(76, 30+(132-leftHeight), 40, leftHeight);
		g2d.fillRect(216,30+(132-rightHeight), 40, rightHeight);
		g2d.setColor(Color.RED);
		g2d.drawRect(76, 30, 40, 144);
		g2d.drawRect(216, 30, 40, 144);
		g2d.setColor(Color.BLACK);
		for(int i = 0 ; i < 12; i++){
			g2d.drawLine(90, 30+i*12, 80+35, 30+i*12);
			g2d.drawLine(231, 30+i*12, 256, 30+i*12);
		}
		for(int i = 0 ; i < 6 ; i++){
			g2d.drawString(String.valueOf((double)212-(i*36)), 120, 42+i*24);
			g2d.drawString(String.valueOf((double)100-(i*20)), 260, 42+i*24);
		}
		Font a = new Font("Arial",Font.BOLD,20);
		g2d.setFont(a);
		g2d.drawString("Fahrenheit", 50, 20);
		g2d.drawString("Celcius", 205, 20);
		g2d.setColor(Color.RED);
		
	}
	public void setleftHeight(int value){
		this.leftHeight = value;
	}
	public void setrightHeight(int value){
		this.rightHeight = value;
	}
}
class Calculator {
	private double celcius=0.0;
	private double fahrenheit=0.0;
	
	public Calculator(double value, boolean is_c){
		if(is_c) {this.celcius = value; this.fahrenheit = toF(value);}
		else {this.fahrenheit = value; this.celcius = toC(value);}
	}
	private double toF(double value){
		return (double)((value * 9 / 5) + 32);
	}
	private double toC(double value){
		return (double)(5.0/9.0)*(value - 32.0);
	}
	public double getCelcius() {
		return celcius;
	}
	public void setCelcius(double celcius) {
		this.celcius = celcius;
		if(toF(celcius) < 32.0 || toF(celcius) > 213.0){
			throw new IllegalStateException("Unable value(" + String.valueOf(toF(celcius)) + ")");
		}
		this.fahrenheit = toF(celcius);
	}
	public double getFahrenheit() {
		return fahrenheit;
	}
	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
		if(toC(fahrenheit) < 0.0 || toC(fahrenheit) > 101.0){
			throw new IllegalStateException("Unable value(" + String.valueOf(toC(fahrenheit)) + ")");
		}
		this.celcius = toC(fahrenheit);
	}
	
}

public class Main {
	public static void main(String[] args) {
		JFrame frame;
		JPanel p = new JPanel();
		myGUI gui = new myGUI();
		Calculator calc = new Calculator(0.0,false);
		frame = new JFrame();
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = frame.getContentPane();
		SpringLayout s = new SpringLayout();
		frame.setLayout(s);
		JButton toF = new JButton("To Fahrenheit");
		s.putConstraint(SpringLayout.NORTH, toF, 300, SpringLayout.NORTH, contentPane);
		s.putConstraint(SpringLayout.WEST, toF, 200, SpringLayout.WEST, contentPane);
		contentPane.add(toF);
		JButton toC = new JButton("To Celcius");
		s.putConstraint(SpringLayout.NORTH, toC, 260, SpringLayout.NORTH, contentPane);
		s.putConstraint(SpringLayout.WEST, toC, 200, SpringLayout.WEST, contentPane);
		contentPane.add(toC);
		JTextField F = new JTextField(10);
		s.putConstraint(SpringLayout.NORTH, F, 305, SpringLayout.NORTH, contentPane);
		s.putConstraint(SpringLayout.WEST, F, 50, SpringLayout.WEST, contentPane);
		contentPane.add(F);
		JTextField C = new JTextField(10);
		s.putConstraint(SpringLayout.NORTH, C, 265, SpringLayout.NORTH, contentPane);
		s.putConstraint(SpringLayout.WEST, C, 50, SpringLayout.WEST, contentPane);
		contentPane.add(C);
		s.putConstraint(SpringLayout.NORTH, p, 10, SpringLayout.NORTH, contentPane);
		s.putConstraint(SpringLayout.WEST, p, 10, SpringLayout.WEST, contentPane);

		toF.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				calc.setCelcius(Double.valueOf(F.getText()));	
				C.setText(String.format("%.2f", calc.getFahrenheit()));	
				gui.setleftHeight((int)(((Double.valueOf(F.getText())-32.0 / 180.0) / 100.0) * 132.0));
				gui.setrightHeight((int)(Double.valueOf(F.getText()) / 100.0 * 132.0));
				gui.repaint();
			}
		});
		toC.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				calc.setFahrenheit(Double.valueOf(C.getText()));
				F.setText(String.format("%.2f", calc.getCelcius()));
				gui.setleftHeight((int)(((Double.valueOf(F.getText())-32.0 / 180.0) / 100.0) * 132.0));
				gui.setrightHeight((int)(Double.valueOf(F.getText()) / 100.0 * 132.0));
				gui.repaint();
			}
		});
		p.add(gui);
		contentPane.add(p);
		frame.setVisible(true);
	}

}
