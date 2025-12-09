package studyDec;

public class BankAccount {

	 protected String number;
	 protected Long balance;
	 public BankAccount(String number, Long balance) {
		this.number = number;
		this.balance = balance;
	 }
	 
	 protected void display() {
		 System.out.println(this.number+"--"+this.balance);
	 }
    
}
