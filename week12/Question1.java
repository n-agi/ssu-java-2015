package week12;
class T1 extends Thread{
	public void run(){
		System.out.println("Hello World!");
	}
}
public class Question1 {
	public static void main(String args[]){
		T1 tt = new T1();
		tt.start();
	}
}
