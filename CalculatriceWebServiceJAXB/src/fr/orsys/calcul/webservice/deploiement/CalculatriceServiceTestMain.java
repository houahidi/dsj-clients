package fr.orsys.calcul.webservice.deploiement;

import javax.xml.ws.Endpoint;

import fr.orsys.calcul.webservice.CalculatriceImpl;

public class CalculatriceServiceTestMain {

	public static void main(String[] args) {
		
		
		
		String url = "http://localhost:10000/CalculatriceService";
		
		System.out.println("Publier le service CalculatriceService : "+url);
		
		Endpoint.publish(url, new CalculatriceImpl());

	}

}
