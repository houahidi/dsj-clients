package fr.orsys.client.model;

import java.util.ArrayList;

public class Client {
	
	private int id;
	private String name;
	private String lastName;
	//private ArrayList listClients;


	public Client() {
		
		// TODO Auto-generated constructor stub
	}

	public Client(int id, String name, String lastName) {
		super();
		this.id =id;
		this.name = name;
		this.lastName = lastName;
			// TODO Auto-generated constructor stub
		}
	
//	public Client(ArrayList<Client> list) {
//		super();
//		this.listClients = list; 
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
		

}
