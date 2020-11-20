package fr.orsys.calcul.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name="OperandeComplexType", propOrder = {"op2","op1"})
public class Operandes {
	
	private double op1;
	private double op2;
	

	public Operandes() {
		
	}
	

	public Operandes(double op1, double op2) {
		super();
		this.op1 = op1;
		this.op2 = op2;
	}


	@XmlAttribute(name = "Operande1")
	public double getOp1() {
		return op1;
	}


	public void setOp1(double op1) {
		this.op1 = op1;
	}

	@XmlAttribute(name = "Operande2")
	public double getOp2() {
		return op2;
	}


	public void setOp2(double op2) {
		this.op2 = op2;
	}
	
	
	

}
