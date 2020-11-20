package fr.orsys.calcul.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlEnum
@XmlType(name="OperatorNomenclature")
public enum OperateurEnum {
	
	Add,
	Divide,
	Minus,
	Multiply

}
