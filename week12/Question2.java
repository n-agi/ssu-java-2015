package week12;
class T2 extends Thread{
	private int cnt = 0;
	
	public void run(){
		while(cnt != 2){
			System.out.println("Hello World!");
			cnt++;
		}
	}
}
public class Question2 {

	public static void main(String[] args) {
		T2 tt[] = new T2[5];
		for(int i = 0 ; i < 5 ; i++){
			tt[i] = new T2();
			tt[i].run();
		}
	}

}
