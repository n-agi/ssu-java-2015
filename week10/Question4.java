package week10;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Question4 {

	public static void main(String[] args) {
		JLabel label = new JLabel(new Date().toString());
		ActionListener task = new ActionListener(){
			public void actionPerformed(ActionEvent event){
				Date t = new Date();
				label.setText(t.toString());
			}
		};
		JFrame frame = new JFrame();
		frame.setSize(200,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.getContentPane().add(label, BorderLayout.CENTER);
		Timer t = new Timer(1000,task);
		t.setRepeats(true);
		t.start();
		frame.setVisible(true);
	}

}
