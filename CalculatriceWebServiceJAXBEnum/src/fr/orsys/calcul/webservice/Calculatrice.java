package fr.orsys.calcul.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;

@WebService(name = "CalculatriceContrat", 
			targetNamespace = "http://localhost:9000/CalculatriceService")

@SOAPBinding(style = Style.DOCUMENT, parameterStyle = ParameterStyle.BARE)
//@SOAPBinding(style = Style.RPC)

public interface Calculatrice {
	
	@WebMethod(operationName = "Add", action = "urn:ADD")
	@WebResult(name = "Result", header = false, partName = "ResultPart")
	double traiter(@WebParam(name = "Operandes", header=false, partName = "OperandesPart") Operandes operandes );
	
	

}
