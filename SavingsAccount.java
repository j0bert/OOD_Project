package accounts;

public class SavingsAccount extends Account{
	
	double withdrawMax = 1000.0;
	
	public SavingsAccount(String owner, double balance) {
		setAccountID(++accountID);
		setAccountOwner(owner);
		setBalance(balance);
		setInterestRate(0.12);
	}
	
}