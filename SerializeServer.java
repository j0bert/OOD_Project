package server;

import java.io.*;
import java.util.*;
import accounts.Account;

public class SerializeServer {
	
	public static void serialize(ArrayList<Account> list){
		try {
			FileOutputStream fileOut = new FileOutputStream("/Users/joelsnider/Desktop/workspace/server.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(list);
			out.close();
			fileOut.close();
			System.out.println("SERVER SAVED");
		}
		catch (IOException e){
			e.printStackTrace();
			System.out.println("IOExeption");
		}
	}

}
