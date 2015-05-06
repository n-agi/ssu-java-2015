package week8;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Question5 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Container content = frame.getContentPane();
		frame.setSize(340,220);
		SpringLayout layout = new SpringLayout();
		frame.setLayout(layout);
		Font a = new Font("Arial",Font.BOLD,16);
		JLabel in = new JLabel("Give me values");
		in.setFont(a);
		layout.putConstraint(SpringLayout.WEST, in, 60, SpringLayout.WEST, content);
		layout.putConstraint(SpringLayout.NORTH, in, 10, SpringLayout.NORTH, content);
		frame.getContentPane().add(in);
		JLabel in2 = new JLabel("Miles");
		layout.putConstraint(SpringLayout.WEST, in2, 5, SpringLayout.WEST, content);
		layout.putConstraint(SpringLayout.NORTH, in2, 45, SpringLayout.NORTH, content);
		frame.getContentPane().add(in2);
		JLabel in3 = new JLabel("Gallons");
		layout.putConstraint(SpringLayout.WEST, in3, 5, SpringLayout.WEST, content);
		layout.putConstraint(SpringLayout.NORTH, in3, 75, SpringLayout.NORTH, content);
		frame.getContentPane().add(in3);
		JTextField field = new JTextField("",15);
		layout.putConstraint(SpringLayout.WEST, field, 50, SpringLayout.WEST, content);
		layout.putConstraint(SpringLayout.NORTH,field, 43, SpringLayout.NORTH, content);
		frame.getContentPane().add(field);
		JButton b = new JButton("Calculate");
		layout.putConstraint(SpringLayout.WEST, b, 220, SpringLayout.WEST, content);
		layout.putConstraint(SpringLayout.NORTH,b, 55, SpringLayout.NORTH, content);
		JTextField field2 = new JTextField("",15);
		layout.putConstraint(SpringLayout.WEST, field2, 50, SpringLayout.WEST, content);
		layout.putConstraint(SpringLayout.NORTH,field2, 73, SpringLayout.NORTH, content);
		frame.getContentPane().add(field2);
		JLabel result = new JLabel();
		layout.putConstraint(SpringLayout.WEST, result, 60, SpringLayout.WEST, content);
		layout.putConstraint(SpringLayout.NORTH,result, 100, SpringLayout.NORTH, content);
		Font bbb = new Font("Arial",Font.BOLD,30);
		result.setFont(bbb);
		
		frame.getContentPane().add(result);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double value = (double)Integer.parseInt(field.getText()) / (double)Integer.parseInt(field2.getText());
				result.setText("MPG= "+Double.toString(value));
				
			}
		});
		frame.getContentPane().add(b);

		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
