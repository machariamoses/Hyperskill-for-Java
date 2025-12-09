package studyDec;

class CheckingAccount extends BankAccount{
	
	double fee;

	public CheckingAccount(String number, Long balance,double fee) {
		super(number,balance);
		this.fee = fee;
		
	}
	public void display() {
		super.display();
		System.out.println(this.fee);
	}
	
}
