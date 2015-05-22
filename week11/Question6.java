package week11;
class Coin implements Comparable<Double>{
	double value;
	String nick;
	public Coin(double value, String nick){
		this.value = value;
		this.nick = nick;
	}
	@Override
	public int compareTo(Double o) {
		if(o < value) return 1;
		else if(o == value) return 0;
		else return -1;
	}
	public double getValue(){
		return this.value;
	}
	
}
public class Question6 {

	public static void main(String[] args) {
		Coin c1 = new Coin(1.0, "1.0 coin");
		Coin c2 = new Coin(2.0, "2.0 coin");
		if (c1.compareTo(c2.getValue()) > 0){
			System.out.println("c1 is bigger.");
		}
		else if(c1.compareTo(c2.getValue()) < 0){
			System.out.println("c2 is bigger.");
		}
		else System.out.println("It is same.");
	}

}
