/**
 * CalculatriceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.carsat.service.soap.document;

public class CalculatriceServiceLocator extends org.apache.axis.client.Service implements fr.carsat.service.soap.document.CalculatriceService {

    public CalculatriceServiceLocator() {
    }


    public CalculatriceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CalculatriceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CalculatriceServicePort
    private java.lang.String CalculatriceServicePort_address = "http://192.168.8.3:9001/CalculatriceWebService";

    public java.lang.String getCalculatriceServicePortAddress() {
        return CalculatriceServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CalculatriceServicePortWSDDServiceName = "CalculatriceServicePort";

    public java.lang.String getCalculatriceServicePortWSDDServiceName() {
        return CalculatriceServicePortWSDDServiceName;
    }

    public void setCalculatriceServicePortWSDDServiceName(java.lang.String name) {
        CalculatriceServicePortWSDDServiceName = name;
    }

    public fr.carsat.service.soap.document.CalculatriceContrat getCalculatriceServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CalculatriceServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCalculatriceServicePort(endpoint);
    }

    public fr.carsat.service.soap.document.CalculatriceContrat getCalculatriceServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            fr.carsat.service.soap.document.CalculatriceServicePortBindingStub _stub = new fr.carsat.service.soap.document.CalculatriceServicePortBindingStub(portAddress, this);
            _stub.setPortName(getCalculatriceServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCalculatriceServicePortEndpointAddress(java.lang.String address) {
        CalculatriceServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (fr.carsat.service.soap.document.CalculatriceContrat.class.isAssignableFrom(serviceEndpointInterface)) {
                fr.carsat.service.soap.document.CalculatriceServicePortBindingStub _stub = new fr.carsat.service.soap.document.CalculatriceServicePortBindingStub(new java.net.URL(CalculatriceServicePort_address), this);
                _stub.setPortName(getCalculatriceServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CalculatriceServicePort".equals(inputPortName)) {
            return getCalculatriceServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://document.soap.service.carsat.fr/", "CalculatriceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://document.soap.service.carsat.fr/", "CalculatriceServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CalculatriceServicePort".equals(portName)) {
            setCalculatriceServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
