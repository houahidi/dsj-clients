import java.rmi.RemoteException;

import fr.carsat.service.soap.document.CalculatriceContrat;
import fr.carsat.service.soap.document.CalculatriceContratProxy;
import fr.carsat.service.soap.document.ReponseAddition;
import fr.carsat.service.soap.document.RequeteAddition;

public class CalculatriceClientMain {

	public static void main(String[] args) {
		
		
		try {
			
			
			System.out.println("Récupérer le proxy");
			// Etape 1 : récupérer le proxy passe par la génération de code Java à partir du WSDL
	
			CalculatriceContrat proxy = (new CalculatriceContratProxy()).getCalculatriceContrat();
			
			//Etape 2 : appeler l'opération Addition
			System.out.println("additionner 7 et 9");
			
			ReponseAddition reponse  = proxy.addition(new RequeteAddition(7, 9));
			System.out.println("Résultat : "+ reponse.getResultat());
		
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



		
		
		
	}

}
