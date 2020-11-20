package fr.orsys.client.dao;

import java.util.ArrayList;
import java.util.List;

import fr.orsys.client.model.Client;

public class ClientDaoImpl {
	
	
	private static ArrayList<Client> tabListClient;
	
	static {
		tabListClient = new ArrayList<Client>();
		Client c1 = new Client(1, "toto", "marie");
		tabListClient.add(c1);
		Client c2 = new Client(2, "titi", "jean");
		tabListClient.add(c2);
		Client c3 = new Client(3, "juju", "daniel");
		tabListClient.add(c3);
		System.out.println("init list");
	}
	
	
	public List<Client> lister(){
		return tabListClient;
	}
	

}
