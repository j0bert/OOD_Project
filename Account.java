package accounts;

public abstract class Account {
	
	String accountOwner;
	static int accountID = 10000;
	double balance;
	double interestRate;
	
	public String getAccountOwner() {return accountOwner;}
	public void setAccountOwner(String accountOwner) {this.accountOwner = accountOwner;}
	
	public int getAccountID() {System.out.println("GOT ACCOUNT ID"); return accountID;}
	public void setAccountID(int accountID) {this.accountID = accountID;}

	public double getBalance() {return balance;}
	public void setBalance(double balance) {this.balance = balance;}
	
	public double getInterestRate() {return interestRate;}
	public void setInterestRate(double interestRate) {this.interestRate = interestRate;}
	
	public void showData(){
		System.out.println("This account belongs to " + getAccountOwner() + ". The current balance is " + getBalance() + ". There is an interest"
				+ " rate of " + getInterestRate()*100 + " percent. The accountID is " + getAccountID());
	}
	
}