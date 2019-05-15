package server;

import java.util.ArrayList;
import accounts.*;

public class Server implements java.io.Serializable {
	
	private static Server firstInstance = null;
	
	static ArrayList<Account> server = new ArrayList<Account>();
	
	private Server(){};
	
	public static Server getInstance(){
		if (firstInstance == null){
			firstInstance = new Server();
			System.out.println("NEW SERVER CREATED");
			showIDs();}
		else{
			System.out.println("Bank account server already created!");}
		
		SerializeServer.serialize(server);
		return firstInstance;
	}

	public static void showIDs(){
		for (int i = 0; i < server.size(); i++){
			System.out.println(server.get(i).getAccountID());
		}
	}
	
}