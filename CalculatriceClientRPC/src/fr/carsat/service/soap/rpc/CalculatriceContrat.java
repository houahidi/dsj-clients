/**
 * CalculatriceContrat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.carsat.service.soap.rpc;

public interface CalculatriceContrat extends java.rmi.Remote {
    public double division(double operande1Part, double operande2Part) throws java.rmi.RemoteException;
    public double addition(double operande1Part, double operande2Part) throws java.rmi.RemoteException;
    public double multiplication(double operande1Part, double operande2Part) throws java.rmi.RemoteException;
    public double soustraction(double operande1Part, double operande2Part) throws java.rmi.RemoteException;
    public void notification(java.lang.String message) throws java.rmi.RemoteException;
}
