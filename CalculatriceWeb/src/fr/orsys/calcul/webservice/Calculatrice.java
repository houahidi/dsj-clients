package fr.orsys.calcul.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "CalculatriceContrat", 
			targetNamespace = "http://localhost:9000/CalculatriceService")

@SOAPBinding(style = Style.DOCUMENT, parameterStyle = ParameterStyle.WRAPPED )
//@SOAPBinding(style = Style.RPC)

public interface Calculatrice {
	
	@WebMethod(operationName = "Add", action = "urn:ADD")
	@WebResult(name = "Result", header = false, partName = "ResultPart")
	@RequestWrapper(localName ="RequestEnvelope")
	@ResponseWrapper(localName ="ResponseEnvelope")
	double additionner(@WebParam(name = "Operande1", header=false, partName = "Operande1Part") double op1 , 
						@WebParam(name = "Operande2", partName = "Operande2Part") double op2);
	@WebMethod(exclude = false)
	double diviser(double op1 , double op2);
	@WebMethod(exclude = false)
	double multiplier(double op1 , double op2);
	@WebMethod(exclude = false)
	double soustraire(double op1 , double op2);

}
