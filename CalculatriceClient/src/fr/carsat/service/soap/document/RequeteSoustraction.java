/**
 * RequeteSoustraction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.carsat.service.soap.document;

public class RequeteSoustraction  implements java.io.Serializable {
    private double operande1;

    private double operande2;

    public RequeteSoustraction() {
    }

    public RequeteSoustraction(
           double operande1,
           double operande2) {
           this.operande1 = operande1;
           this.operande2 = operande2;
    }


    /**
     * Gets the operande1 value for this RequeteSoustraction.
     * 
     * @return operande1
     */
    public double getOperande1() {
        return operande1;
    }


    /**
     * Sets the operande1 value for this RequeteSoustraction.
     * 
     * @param operande1
     */
    public void setOperande1(double operande1) {
        this.operande1 = operande1;
    }


    /**
     * Gets the operande2 value for this RequeteSoustraction.
     * 
     * @return operande2
     */
    public double getOperande2() {
        return operande2;
    }


    /**
     * Sets the operande2 value for this RequeteSoustraction.
     * 
     * @param operande2
     */
    public void setOperande2(double operande2) {
        this.operande2 = operande2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequeteSoustraction)) return false;
        RequeteSoustraction other = (RequeteSoustraction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.operande1 == other.getOperande1() &&
            this.operande2 == other.getOperande2();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Double(getOperande1()).hashCode();
        _hashCode += new Double(getOperande2()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequeteSoustraction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://document.soap.service.carsat.fr/", "RequeteSoustraction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operande1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Operande1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operande2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Operande2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
