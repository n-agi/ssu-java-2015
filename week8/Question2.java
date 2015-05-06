package week8;
import javax.swing.*;
import java.awt.Container;

public class Question2 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		SpringLayout layout = new SpringLayout();
		Container contentPane = frame.getContentPane();
		
		frame.setSize(360,170);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(layout);

		JLabel l1 = new JLabel("Printer: myPrinter");
		layout.putConstraint(SpringLayout.WEST, l1, 30, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, l1, 10, SpringLayout.NORTH, contentPane);
		contentPane.add(l1);
		
		JCheckBox c1 = new JCheckBox("Image");
		layout.putConstraint(SpringLayout.WEST, c1, 30, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, c1, 30, SpringLayout.NORTH, contentPane);
		contentPane.add(c1);
		JCheckBox c2 = new JCheckBox("Text");
		layout.putConstraint(SpringLayout.WEST, c2, 30, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, c2, 50, SpringLayout.NORTH, contentPane);
		contentPane.add(c2);
		JCheckBox c3 = new JCheckBox("Code");
		layout.putConstraint(SpringLayout.WEST, c3, 30, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, c3, 70, SpringLayout.NORTH, contentPane);
		contentPane.add(c3);

		JRadioButton r1 = new JRadioButton("Selection");
		layout.putConstraint(SpringLayout.WEST, r1, 120, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, r1, 30, SpringLayout.NORTH, contentPane);
		contentPane.add(r1);
		JRadioButton r2 = new JRadioButton("All");
		layout.putConstraint(SpringLayout.WEST, r2, 120, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, r2, 50, SpringLayout.NORTH, contentPane);
		contentPane.add(r2);
		JRadioButton r3 = new JRadioButton("Applet");
		layout.putConstraint(SpringLayout.WEST, r3, 120, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, r3, 70, SpringLayout.NORTH, contentPane);
		contentPane.add(r3);
		
		JLabel l2 = new JLabel("Print Quality:");
		layout.putConstraint(SpringLayout.WEST, l2, 30, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, l2, 100, SpringLayout.NORTH, contentPane);
		contentPane.add(l2);
		
		JComboBox co1 = new JComboBox();
		co1.addItem("High");
		layout.putConstraint(SpringLayout.WEST, co1, 110, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, co1, 98, SpringLayout.NORTH, contentPane);
		contentPane.add(co1);
		
		JCheckBox c4 = new JCheckBox("Print to File");
		layout.putConstraint(SpringLayout.WEST, c4, 160, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, c4, 98, SpringLayout.NORTH, contentPane);
		contentPane.add(c4);

		JButton b1 = new JButton("OK");
		layout.putConstraint(SpringLayout.WEST, b1, 270, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, b1, 10, SpringLayout.NORTH, contentPane);
		contentPane.add(b1);
		JButton b2 = new JButton("Cancel");
		layout.putConstraint(SpringLayout.WEST, b2, 260, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, b2, 40, SpringLayout.NORTH, contentPane);
		contentPane.add(b2);
		JButton b3 = new JButton("Setup...");
		layout.putConstraint(SpringLayout.WEST, b3, 258, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, b3, 70, SpringLayout.NORTH, contentPane);
		contentPane.add(b3);
		JButton b4 = new JButton("Help");
		layout.putConstraint(SpringLayout.WEST, b4, 266, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, b4, 100, SpringLayout.NORTH, contentPane);
		contentPane.add(b4);
		frame.setVisible(true);
	}

}
