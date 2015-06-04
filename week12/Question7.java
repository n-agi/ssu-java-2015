package week12;
class BankAccount{
	private double balance;
	public BankAccount(double balance){
		if(balance <= 0.0){
			throw new IllegalArgumentException("Negative amount of balance.");
		}
		else this.balance = balance;
	}
	public void deposit(double amount){
		if(amount <= 0.0){
			throw new IllegalArgumentException("Negative amount to deposit.");
		}
		else this.balance+=amount;
	}
	public void withdraw(double amount){
		if(amount <= 0.0 && (amount - balance < 0)){
			throw new IllegalArgumentException("Negative amount to withdraw or insufficient fund.");
		}
		else this.balance-=amount;
	}
	
}
public class Question7 {

	public static void main(String[] args) {
		BankAccount a = new BankAccount(1.0);
		BankAccount b = new BankAccount(-1.0);
		a.deposit(-1.0);
		a.deposit(0.0);
		a.withdraw(0.0);
		a.withdraw(-1.0);
		a.withdraw(9999.0);
	}

}
