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
	public double additionner(double op1, double op2) {
		System.out.println("additionner "+ op1 +"," + op2);
		
		return op1  + op2;
	}

	@Override
	public double diviser(double op1, double op2) {
		System.out.println("diviser "+ op1 +"," + op2);
		
		return op1  / op2;
	}

	@Override
	public double multiplier(double op1, double op2) {
		System.out.println("multiplier "+ op1 +"," + op2);
		
		return op1  * op2;
	}

	@Override
	public double soustraire(double op1, double op2) {
		System.out.println("soustraire "+ op1 +"," + op2);
		
		return op1  -  op2;
	}

}
