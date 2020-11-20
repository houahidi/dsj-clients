/**
 * 
 */
package fr.orsys.calcul.webservice;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * @author orsys
 *
 */

@WebService(endpointInterface = "fr.orsys.calcul.webservice.Calculatrice", 
		    serviceName = "CalculatriceService",
		    portName = "CalculatriceServicePort",
		    targetNamespace = "http://localhost:9000/CalculatriceService"
		)		


public class CalculatriceImpl implements Calculatrice {

	@Override
	public double traiter(Operandes operandes) {
		double resultat = 0;
		
		if (operandes.getOperator().equals(OperateurEnum.Add)) {
			System.out.println("additionner "+ operandes.getOp1() +"," + operandes.getOp2());
			
			resultat =  operandes.getOp1()  +  operandes.getOp2();
		}else if  (operandes.getOperator().equals(OperateurEnum.Minus)) {
			System.out.println("soustraire "+ operandes.getOp1() +"," + operandes.getOp2());
			
			resultat =  operandes.getOp1()  -  operandes.getOp2();
		}else if  (operandes.getOperator().equals(OperateurEnum.Divide)) {
			System.out.println("diviser "+ operandes.getOp1() +"," + operandes.getOp2());
			
			resultat =  operandes.getOp1()  /  operandes.getOp2();
		}else  {
			System.out.println("multiplier "+ operandes.getOp1() +"," + operandes.getOp2());
			
			resultat =  operandes.getOp1()  * operandes.getOp2();
		}
		
		
		return resultat;
	}

	
}
