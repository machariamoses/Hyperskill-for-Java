package studyDec;

public class SavingsAccount extends BankAccount {
	 double interestRate = 22;

	 public SavingsAccount(String number, Long balance, double interestRate) {
		super(number, balance);
		this.interestRate = interestRate;
	 }
	 
	 public void display() {
			super.display();
			System.out.println(this.interestRate);
		}
}
