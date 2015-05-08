package week09;
class PrimeSequence implements Sequence{
	int val = 1;
	public int nextPrime(){
		while(true){
			if(!isPrime(this.val))
				val++;
			else {break;}
		}
		return val++;
	}
	private static boolean isPrime(int num) {
		if (num == 0 || num == 1) return false;
        if (num == 2 ) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
}
}
public class Question4 {

	public static void main(String[] args) {
		PrimeSequence s = new PrimeSequence();
		for(int i = 0 ; i < 10 ; i++){
			System.out.println(s.nextPrime());
		}
	}

}
