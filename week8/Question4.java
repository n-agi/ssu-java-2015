package week8;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Question4 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Container content = frame.getContentPane();
		frame.setSize(340,190);
		SpringLayout layout = new SpringLayout();
		frame.setLayout(layout);
		Font a = new Font("Arial",Font.BOLD,16);
		JLabel in = new JLabel("Enter the reading in Celcius");
		in.setFont(a);
		layout.putConstraint(SpringLayout.WEST, in, 60, SpringLayout.WEST, content);
		layout.putConstraint(SpringLayout.NORTH, in, 10, SpringLayout.NORTH, content);
		frame.getContentPane().add(in);
		JTextField field = new JTextField(15);
		layout.putConstraint(SpringLayout.WEST, field, 50, SpringLayout.WEST, content);
		layout.putConstraint(SpringLayout.NORTH,field, 43, SpringLayout.NORTH, content);
		frame.getContentPane().add(field);
		JButton b = new JButton("Convert");
		layout.putConstraint(SpringLayout.WEST, b, 220, SpringLayout.WEST, content);
		layout.putConstraint(SpringLayout.NORTH,b, 40, SpringLayout.NORTH, content);
		JLabel result = new JLabel();
		layout.putConstraint(SpringLayout.WEST, result, 60, SpringLayout.WEST, content);
		layout.putConstraint(SpringLayout.NORTH,result, 90, SpringLayout.NORTH, content);
		Font bbb = new Font("Arial",Font.BOLD,30);
		result.setFont(bbb);
		
		frame.getContentPane().add(result);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double value = 9.0 / 5.0 * (double)Integer.parseInt(field.getText()) + 32.0;
				result.setText("Farenheit= "+Double.toString(value));
				
			}
		});
		frame.getContentPane().add(b);

		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	

}
