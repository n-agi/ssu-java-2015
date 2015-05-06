package week8;
import java.awt.BorderLayout;
import java.util.Scanner;
import java.awt.Font;

import javax.swing.*;
public class Question3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String in;
		System.out.print("Please Enter your name : ");
		in = s.nextLine();
		JFrame frame = new JFrame();
		frame.setSize(340,340);
		Font a = new Font("Arial",Font.BOLD,40);
		JLabel l = new JLabel("GoodDay! " + in);
		l.setFont(a);
		frame.setLayout(new BorderLayout());
		l.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(l, BorderLayout.NORTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
