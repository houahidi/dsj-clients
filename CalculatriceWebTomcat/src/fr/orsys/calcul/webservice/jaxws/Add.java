
package fr.orsys.calcul.webservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.4.1
 * Thu Nov 19 10:09:07 GMT+01:00 2020
 * Generated source version: 3.4.1
 */

@XmlRootElement(name = "RequestEnvelope", namespace = "http://localhost:9000/CalculatriceService")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestEnvelope", namespace = "http://localhost:9000/CalculatriceService", propOrder = {"Operande1", "Operande2"})

public class Add {

    @XmlElement(name = "Operande1")
    private double Operande1;
    @XmlElement(name = "Operande2")
    private double Operande2;

    public double getOperande1() {
        return this.Operande1;
    }

    public void setOperande1(double newOperande1)  {
        this.Operande1 = newOperande1;
    }

    public double getOperande2() {
        return this.Operande2;
    }

    public void setOperande2(double newOperande2)  {
        this.Operande2 = newOperande2;
    }

}

