package studyDec;

public class Main {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount("18", 19L);
		CheckingAccount ca = new CheckingAccount("20",21L,22);
		SavingsAccount sa = new SavingsAccount("23",24L,25);
		
		ba.display();
		ca.display();
		sa.display();
		

	}

}
