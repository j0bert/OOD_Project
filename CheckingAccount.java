package accounts;

public class CheckingAccount extends Account{
	
	double withdrawMax = 500.0;
	double overdrawMax = -300.0;
	
	public CheckingAccount(String owner, double balance) {
		setAccountID(++accountID);
		setAccountOwner(owner);
		setBalance(balance);
		setInterestRate(0.17);
	}

}