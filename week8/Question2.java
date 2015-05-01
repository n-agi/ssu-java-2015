package week09;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Component;
import net.miginfocom.swing.MigLayout;
public class Question2 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setSize(400,224);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().setLayout(new MigLayout("", "[400px][180px]", "[150px]"));
		
				JPanel p1 = new JPanel();
				
						frame.getContentPane().add(p1, "cell 0 0,growx");
						p1.setLayout(new MigLayout("", "[400px]", "[40px][40px][40px]"));
						
						JLabel lblPrinterMyPrinter = new JLabel("Printer: My Printer");
						lblPrinterMyPrinter.setHorizontalAlignment(SwingConstants.LEFT);
						p1.add(lblPrinterMyPrinter, "cell 0 0,grow");
						
						JPanel panel_1 = new JPanel();
						p1.add(panel_1, "cell 0 1,grow");
						panel_1.setLayout(new MigLayout("", "[137px][137px]", "[40px]"));
						
						JPanel panel_2 = new JPanel();
						panel_1.add(panel_2, "cell 0 0,grow");
						panel_2.setLayout(new MigLayout("", "[137px]", "[10px][10px][10px]"));
						
						JCheckBox chckbxImage = new JCheckBox("Image");
						chckbxImage.setToolTipText("");
						chckbxImage.setHorizontalAlignment(SwingConstants.RIGHT);
						panel_2.add(chckbxImage, "cell 0 0,grow");
						
						JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Text");
						chckbxNewCheckBox_1.setHorizontalAlignment(SwingConstants.RIGHT);
						panel_2.add(chckbxNewCheckBox_1, "cell 0 1,grow");
						
						JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Code");
						chckbxNewCheckBox_2.setHorizontalAlignment(SwingConstants.RIGHT);
						panel_2.add(chckbxNewCheckBox_2, "cell 0 2,grow");
						
						JPanel panel_3 = new JPanel();
						panel_1.add(panel_3, "cell 1 0,grow");
						panel_3.setLayout(new MigLayout("", "[137px]", "[30px][30px][30px]"));
						
						JRadioButton rdbtnWer = new JRadioButton("Selection");
						panel_3.add(rdbtnWer, "cell 0 0,grow");
						
						JRadioButton rdbtnNewRadioButton = new JRadioButton("All");
						panel_3.add(rdbtnNewRadioButton, "cell 0 1,grow");
						
						JRadioButton rdbtnApplet = new JRadioButton("Applet");
						panel_3.add(rdbtnApplet, "cell 0 2,grow");
						
						JPanel panel = new JPanel();
						p1.add(panel, "cell 0 2,grow");
						
						JLabel lblPrintQuality = new JLabel("Print Quality:");
						panel.add(lblPrintQuality);
						
						JComboBox comboBox = new JComboBox();
						comboBox.addItem("High");
						panel.add(comboBox);
						
						JCheckBox chckbxNewCheckBox = new JCheckBox("Print to File");
						panel.add(chckbxNewCheckBox);
		JPanel p3 = new JPanel();
		frame.getContentPane().add(p3, "cell 1 0,grow");
		p3.setLayout(new MigLayout("", "[77px]", "[23px][23px][23px][23px]"));
		
		JButton btnOk = new JButton("OK");
		btnOk.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		btnOk.setAlignmentX(Component.CENTER_ALIGNMENT);
		p3.add(btnOk, "cell 0 0,alignx center,aligny bottom");
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		btnCancel.setAlignmentX(Component.CENTER_ALIGNMENT);
		p3.add(btnCancel, "cell 0 1,alignx center,aligny bottom");
		
		JButton btnSetup = new JButton("Setup...");
		btnSetup.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		btnSetup.setAlignmentX(Component.CENTER_ALIGNMENT);
		p3.add(btnSetup, "cell 0 2,alignx center,aligny bottom");
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		btnHelp.setAlignmentX(Component.CENTER_ALIGNMENT);
		p3.add(btnHelp, "cell 0 3,alignx center,aligny bottom");
		frame.setVisible(true);
	}

}
