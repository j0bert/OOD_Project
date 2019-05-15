package server;

import accounts.*;

public class AccountFactory {
	
	public Account makeNewAccount(String newAccountType, String owner, double balance){
		
		Account newAccount = null;	
		
		if (newAccountType.equals("checking")){
			
			CheckingAccount checkAcct = new CheckingAccount(owner, balance);
			server.Server.server.add(checkAcct);
			System.out.println("CHECKING ACCOUNT ADDED TO SERVER");
			return checkAcct;
			
		}
		
		if (newAccountType.equals("savings")){

			SavingsAccount savAcct = new SavingsAccount(owner, balance);
			server.Server.server.add(savAcct);
			System.out.println("SAVINGS ACCOUNT ADDED TO SERVER");
			return savAcct;
			
		}
		
		else{
			server.Server.server.add(newAccount);
			System.out.println("BASE ACCOUNT ADDED TO SERVER");
			return newAccount;
		}

	}

}
