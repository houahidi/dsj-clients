package fr.carsat.service.soap.document;

public class CalculatriceContratProxy implements fr.carsat.service.soap.document.CalculatriceContrat {
  private String _endpoint = null;
  private fr.carsat.service.soap.document.CalculatriceContrat calculatriceContrat = null;
  
  public CalculatriceContratProxy() {
    _initCalculatriceContratProxy();
  }
  
  public CalculatriceContratProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculatriceContratProxy();
  }
  
  private void _initCalculatriceContratProxy() {
    try {
      calculatriceContrat = (new fr.carsat.service.soap.document.CalculatriceServiceLocator()).getCalculatriceServicePort();
      if (calculatriceContrat != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculatriceContrat)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculatriceContrat)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculatriceContrat != null)
      ((javax.xml.rpc.Stub)calculatriceContrat)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public fr.carsat.service.soap.document.CalculatriceContrat getCalculatriceContrat() {
    if (calculatriceContrat == null)
      _initCalculatriceContratProxy();
    return calculatriceContrat;
  }
  
  public fr.carsat.service.soap.document.ReponseSoustraction soustraction(fr.carsat.service.soap.document.RequeteSoustraction parameters) throws java.rmi.RemoteException{
    if (calculatriceContrat == null)
      _initCalculatriceContratProxy();
    return calculatriceContrat.soustraction(parameters);
  }
  
  public fr.carsat.service.soap.document.ReponseDivision division(fr.carsat.service.soap.document.RequeteDivision parameters) throws java.rmi.RemoteException{
    if (calculatriceContrat == null)
      _initCalculatriceContratProxy();
    return calculatriceContrat.division(parameters);
  }
  
  public void notification(fr.carsat.service.soap.document.RequeteNotification parameters) throws java.rmi.RemoteException{
    if (calculatriceContrat == null)
      _initCalculatriceContratProxy();
    calculatriceContrat.notification(parameters);
  }
  
  public fr.carsat.service.soap.document.ReponseMultiplication multiplication(fr.carsat.service.soap.document.RequeteMultiplication parameters) throws java.rmi.RemoteException{
    if (calculatriceContrat == null)
      _initCalculatriceContratProxy();
    return calculatriceContrat.multiplication(parameters);
  }
  
  public fr.carsat.service.soap.document.ReponseAddition addition(fr.carsat.service.soap.document.RequeteAddition parameters) throws java.rmi.RemoteException{
    if (calculatriceContrat == null)
      _initCalculatriceContratProxy();
    return calculatriceContrat.addition(parameters);
  }
  
  
}