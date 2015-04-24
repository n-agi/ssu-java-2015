package week08;
import javax.swing.JFrame;
public class Question1 {
	public static void main(String[] args){
		JFrame myFrame = new JFrame();
		myFrame.setTitle("Rectangle");
		myFrame.setSize(500, 500);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyRect m1 = new MyRect();
		myFrame.add(m1);
		myFrame.setVisible(true);
	}
}
