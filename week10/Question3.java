package week10;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer t = new Timer();
		t.schedule(new t_callback(),0,1000);
	}
	public static class t_callback extends TimerTask{
		@Override
		public void run(){
			Date t = new Date();
			System.out.println(t);
		}
	}

}
