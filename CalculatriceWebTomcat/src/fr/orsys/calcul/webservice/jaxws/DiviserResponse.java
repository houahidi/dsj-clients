
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

@XmlRootElement(name = "diviserResponse", namespace = "http://localhost:9000/CalculatriceService")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "diviserResponse", namespace = "http://localhost:9000/CalculatriceService")

public class DiviserResponse {

    @XmlElement(name = "return")
    private double _return;

    public double getReturn() {
        return this._return;
    }

    public void setReturn(double new_return)  {
        this._return = new_return;
    }

}
