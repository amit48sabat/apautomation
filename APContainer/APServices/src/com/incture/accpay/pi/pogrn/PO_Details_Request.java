package com.incture.accpay.pi.pogrn;
/**
 * PO_Details_Request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

public class PO_Details_Request  implements java.io.Serializable {
    private java.lang.String PONUMBER;

    private java.lang.String ACCOUNT_ASSIGNMENT;

    public PO_Details_Request() {
    }

    public PO_Details_Request(
           java.lang.String PONUMBER,
           java.lang.String ACCOUNT_ASSIGNMENT) {
           this.PONUMBER = PONUMBER;
           this.ACCOUNT_ASSIGNMENT = ACCOUNT_ASSIGNMENT;
    }


    /**
     * Gets the PONUMBER value for this PO_Details_Request.
     * 
     * @return PONUMBER
     */
    public java.lang.String getPONUMBER() {
        return PONUMBER;
    }


    /**
     * Sets the PONUMBER value for this PO_Details_Request.
     * 
     * @param PONUMBER
     */
    public void setPONUMBER(java.lang.String PONUMBER) {
        this.PONUMBER = PONUMBER;
    }


    /**
     * Gets the ACCOUNT_ASSIGNMENT value for this PO_Details_Request.
     * 
     * @return ACCOUNT_ASSIGNMENT
     */
    public java.lang.String getACCOUNT_ASSIGNMENT() {
        return ACCOUNT_ASSIGNMENT;
    }


    /**
     * Sets the ACCOUNT_ASSIGNMENT value for this PO_Details_Request.
     * 
     * @param ACCOUNT_ASSIGNMENT
     */
    public void setACCOUNT_ASSIGNMENT(java.lang.String ACCOUNT_ASSIGNMENT) {
        this.ACCOUNT_ASSIGNMENT = ACCOUNT_ASSIGNMENT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PO_Details_Request)) return false;
        PO_Details_Request other = (PO_Details_Request) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PONUMBER==null && other.getPONUMBER()==null) || 
             (this.PONUMBER!=null &&
              this.PONUMBER.equals(other.getPONUMBER()))) &&
            ((this.ACCOUNT_ASSIGNMENT==null && other.getACCOUNT_ASSIGNMENT()==null) || 
             (this.ACCOUNT_ASSIGNMENT!=null &&
              this.ACCOUNT_ASSIGNMENT.equals(other.getACCOUNT_ASSIGNMENT())));
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
        if (getPONUMBER() != null) {
            _hashCode += getPONUMBER().hashCode();
        }
        if (getACCOUNT_ASSIGNMENT() != null) {
            _hashCode += getACCOUNT_ASSIGNMENT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PO_Details_Request.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://incture.com/AccountPayable", "PO_Details_Request"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PONUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PONUMBER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACCOUNT_ASSIGNMENT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ACCOUNT_ASSIGNMENT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
