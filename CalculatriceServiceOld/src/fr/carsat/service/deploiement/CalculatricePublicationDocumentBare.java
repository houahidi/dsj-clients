package fr.carsat.service.deploiement;

import javax.xml.ws.Endpoint;

import fr.carsat.service.soap.documentbare.CalculatriceServiceImpl;

public class CalculatricePublicationDocumentBare {

	public static void main(String[] args) {
		
		System.out.println("Publication du web service en tant que Application Java autonome");
		String url = "http://192.168.8.3:9002/CalculatriceWebService";
		System.out.println("Url : "+url);
		//Instanciation du service
		CalculatriceServiceImpl service = new CalculatriceServiceImpl();
		//Publication
		Endpoint.publish(url,service);

	}

}
