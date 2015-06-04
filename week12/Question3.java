package week12;
class PrintNameThread extends Thread{
	private String name;
	public PrintNameThread(String name){
		this.name = name;
	}
	public void run(){
		System.out.println(name);
		System.out.println(name);
		System.out.println(name);
		System.out.println(name);
		System.out.println(name);
	}
}
public class Question3 {

	public static void main(String[] args) {
		PrintNameThread pnt1 = new PrintNameThread("Kim");
		Thread t1 = new Thread(pnt1);
		t1.start();
		        
		PrintNameThread pnt2 = new PrintNameThread("John");
		Thread t2 = new Thread(pnt2);
		t2.start();
		        
		PrintNameThread pnt3 = new PrintNameThread("Park");
		Thread t3 = new Thread(pnt3);
		t3.start();	   
	}

}
