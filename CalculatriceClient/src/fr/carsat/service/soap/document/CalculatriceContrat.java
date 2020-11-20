/**
 * CalculatriceContrat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.carsat.service.soap.document;

public interface CalculatriceContrat extends java.rmi.Remote {
    public fr.carsat.service.soap.document.ReponseSoustraction soustraction(fr.carsat.service.soap.document.RequeteSoustraction parameters) throws java.rmi.RemoteException;
    public fr.carsat.service.soap.document.ReponseDivision division(fr.carsat.service.soap.document.RequeteDivision parameters) throws java.rmi.RemoteException;
    public void notification(fr.carsat.service.soap.document.RequeteNotification parameters) throws java.rmi.RemoteException;
    public fr.carsat.service.soap.document.ReponseMultiplication multiplication(fr.carsat.service.soap.document.RequeteMultiplication parameters) throws java.rmi.RemoteException;
    public fr.carsat.service.soap.document.ReponseAddition addition(fr.carsat.service.soap.document.RequeteAddition parameters) throws java.rmi.RemoteException;
}
