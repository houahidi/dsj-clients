package fr.orsys.client.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.orsys.client.dao.ClientDaoImpl;
import fr.orsys.client.model.Client;
import fr.orsys.client.service.exceptions.ClientNotFoundException;

@Path("/clients")
public class ClientRest {
	
	private static List<Client> tabListClient;
	private ClientDaoImpl clientDaoImpl;
	
	public ClientRest() {
		if (tabListClient == null) {
			clientDaoImpl = new ClientDaoImpl();
			tabListClient = clientDaoImpl.lister();
		}
		
		System.out.println("instanciation");
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Client getClientById(@PathParam("id") int id) throws ClientNotFoundException {
		Client client = null;
		for(Client item: tabListClient) {
			if(item.getId() == id) {
				client = item;
			}
		}
		if(client == null) throw new ClientNotFoundException("Erreur : le client ayant le id" + id + "n'existe pas.");
		return client;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Client> getClients() {
		return tabListClient;
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public boolean addClients(Client cl) {
		tabListClient.add(cl);
		return true;
	}
	
	
	@PUT
	@Path("/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public boolean updateClients(@PathParam("id") int id, Client cl) {
		Client client = null;
		for(Client item: tabListClient) {
			if(item.getId() == id) {
				client = item;
			}
		}
		if (client != null) {
			tabListClient.remove(client);
			tabListClient.add(cl);
			return true;
		}
		return false;
		
	}
	
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public boolean deleteClientById(@PathParam("id") int id) {
		Client client = null;
		for(Client item: tabListClient) {
			if(item.getId() == id) {
				client = item;
			}
		}
		if (client != null) {
			tabListClient.remove(client);
			return true;
		}
		return false;
	}
}
