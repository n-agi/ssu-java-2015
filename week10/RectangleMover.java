package week10;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;
class Pair<T>{
	T p1, p2;
	Pair(T p1, T p2){
		this.p1 = p1;
		this.p2 = p2;
	}
}
public class RectangleMover {
   private static final int FRAME_WIDTH = 300;
   private static final int FRAME_HEIGHT = 400;
   static int deltax= 1;
   static int deltay= 1;
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setTitle("An animated rectangle");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      final RectangleComponent component = new RectangleComponent();
      frame.setLayout(new GridLayout(1,1));
      frame.add(component);

      frame.setVisible(true);

      class TimerListener implements ActionListener
      {
         public void actionPerformed(ActionEvent event)
         {
            //System.out.print(component.getBox().x+", "+component.getBox().y+"(");
        	 //System.out.println(component.getBox().width);
            //System.out.println((component.getBox().width+component.getBox().x)+", "+(component.getBox().height+component.getBox().y)+")");
            if((component.getBox().x+component.getBox().width+15) == FRAME_WIDTH){
            	deltax *= -1;
            }
            else if(component.getBox().x == 0){
            	deltax *= -1;
            }
            else if(component.getBox().y+component.getBox().height+35 == FRAME_HEIGHT){
            	deltay *= -1;
            }
            else if(component.getBox().y == 0){
            	deltay *= -1;
            }
            component.moveBy(deltax,deltay);
         }
      }

      ActionListener listener = new TimerListener();

      final int DELAY = 5; // Milliseconds between timer ticks
      Timer t = new Timer(DELAY, listener);
      t.start();      
   }

}
