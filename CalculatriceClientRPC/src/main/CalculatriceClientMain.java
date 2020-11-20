package main;

import java.rmi.RemoteException;

import fr.carsat.service.soap.rpc.CalculatriceContrat;
import fr.carsat.service.soap.rpc.CalculatriceContratProxy;

public class CalculatriceClientMain {

	public static void main(String[] args) {

		try {
			//Récupere le proxy
	
			CalculatriceContrat proxy = (new CalculatriceContratProxy()).getCalculatriceContrat();
			
			
			System.out.println(proxy.addition(34,644));
			
			
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
