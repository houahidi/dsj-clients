package fr.carsat.service.soap.rpc;

public class CalculatriceContratProxy implements fr.carsat.service.soap.rpc.CalculatriceContrat {
  private String _endpoint = null;
  private fr.carsat.service.soap.rpc.CalculatriceContrat calculatriceContrat = null;
  
  public CalculatriceContratProxy() {
    _initCalculatriceContratProxy();
  }
  
  public CalculatriceContratProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculatriceContratProxy();
  }
  
  private void _initCalculatriceContratProxy() {
    try {
      calculatriceContrat = (new fr.carsat.service.soap.rpc.CalculatriceServiceLocator()).getCalculatriceServicePort();
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
  
  public fr.carsat.service.soap.rpc.CalculatriceContrat getCalculatriceContrat() {
    if (calculatriceContrat == null)
      _initCalculatriceContratProxy();
    return calculatriceContrat;
  }
  
  public double division(double operande1Part, double operande2Part) throws java.rmi.RemoteException{
    if (calculatriceContrat == null)
      _initCalculatriceContratProxy();
    return calculatriceContrat.division(operande1Part, operande2Part);
  }
  
  public double addition(double operande1Part, double operande2Part) throws java.rmi.RemoteException{
    if (calculatriceContrat == null)
      _initCalculatriceContratProxy();
    return calculatriceContrat.addition(operande1Part, operande2Part);
  }
  
  public double multiplication(double operande1Part, double operande2Part) throws java.rmi.RemoteException{
    if (calculatriceContrat == null)
      _initCalculatriceContratProxy();
    return calculatriceContrat.multiplication(operande1Part, operande2Part);
  }
  
  public double soustraction(double operande1Part, double operande2Part) throws java.rmi.RemoteException{
    if (calculatriceContrat == null)
      _initCalculatriceContratProxy();
    return calculatriceContrat.soustraction(operande1Part, operande2Part);
  }
  
  public void notification(java.lang.String message) throws java.rmi.RemoteException{
    if (calculatriceContrat == null)
      _initCalculatriceContratProxy();
    calculatriceContrat.notification(message);
  }
  
  
}