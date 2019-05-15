import java.util.Scanner;

import accounts.*;
import server.*;
public class Main {

	public static void main(String[] args) {
		
		//System.out.println(server.Server.getInstance());
		//server.Server.getInstance();
		//server.Server.getInstance();
		
		AccountFactory fact = new AccountFactory();
		server.Server.getInstance();

		/*
		CheckingAccount check = (CheckingAccount) fact.makeNewAccount("checking", "Dave", 2104.24);
		check.showData();
		
		SavingsAccount sav = (SavingsAccount) fact.makeNewAccount("savings", "Joe", 1);
		sav.showData();
		
		SavingsAccount sav1 = (SavingsAccount) fact.makeNewAccount("savings", "Joe", 1);
		sav1.showData();
		
		SavingsAccount sav2 = (SavingsAccount) fact.makeNewAccount("savings", "Joe", 1);
		sav2.showData();
		
		SavingsAccount sav3 = (SavingsAccount) fact.makeNewAccount("savings", "Joe", 1);
		sav3.showData();
		
		SavingsAccount sav4 = (SavingsAccount) fact.makeNewAccount("savings", "Joe", 1);
		sav4.showData();
		*/
		
		Scanner input = new Scanner(System.in);
		String type = null;
		String name = null;
		double num = 0.0;
		//Account newAcct = new Account();
		System.out.println("What type of bank account do you want to create? (Enter 'savings' or 'checking'):");
		if (input.hasNextLine()){
			type = input.nextLine();
		}
		input = new Scanner(System.in);
		System.out.println("What is your name?");
		if (input.hasNextLine()){
			name = input.nextLine();
		}
		input = new Scanner(System.in);
		System.out.println("How much is in the account?");
		if (input.hasNextLine()){
			String amount = input.nextLine();
			num = Double.valueOf(amount);
		}
		
		if (type.equals("savings")){
			SavingsAccount newAcct = (SavingsAccount) fact.makeNewAccount(type, name, num);
			newAcct.showData();}
		if (type.equals("checking")){
			CheckingAccount newAcct = (CheckingAccount) fact.makeNewAccount(type, name, num);
			newAcct.showData();}
		}
		
		
		
}
