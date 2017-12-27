package com.incture.accpay.pi.pogrn;
/**
 * PO_Details_ResponseCONVERSION_TABLEItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

public class PO_Details_ResponseCONVERSION_TABLEItem  implements java.io.Serializable {
    private java.lang.String PO_ITEM;

    private java.lang.String MATNR;

    private java.lang.String MEINH;

    private java.lang.String MEINS;

    private java.math.BigDecimal UMREN;

    private java.math.BigDecimal UMREZ;

    public PO_Details_ResponseCONVERSION_TABLEItem() {
    }

    public PO_Details_ResponseCONVERSION_TABLEItem(
           java.lang.String PO_ITEM,
           java.lang.String MATNR,
           java.lang.String MEINH,
           java.lang.String MEINS,
           java.math.BigDecimal UMREN,
           java.math.BigDecimal UMREZ) {
           this.PO_ITEM = PO_ITEM;
           this.MATNR = MATNR;
           this.MEINH = MEINH;
           this.MEINS = MEINS;
           this.UMREN = UMREN;
           this.UMREZ = UMREZ;
    }


    /**
     * Gets the PO_ITEM value for this PO_Details_ResponseCONVERSION_TABLEItem.
     * 
     * @return PO_ITEM
     */
    public java.lang.String getPO_ITEM() {
        return PO_ITEM;
    }


    /**
     * Sets the PO_ITEM value for this PO_Details_ResponseCONVERSION_TABLEItem.
     * 
     * @param PO_ITEM
     */
    public void setPO_ITEM(java.lang.String PO_ITEM) {
        this.PO_ITEM = PO_ITEM;
    }


    /**
     * Gets the MATNR value for this PO_Details_ResponseCONVERSION_TABLEItem.
     * 
     * @return MATNR
     */
    public java.lang.String getMATNR() {
        return MATNR;
    }


    /**
     * Sets the MATNR value for this PO_Details_ResponseCONVERSION_TABLEItem.
     * 
     * @param MATNR
     */
    public void setMATNR(java.lang.String MATNR) {
        this.MATNR = MATNR;
    }


    /**
     * Gets the MEINH value for this PO_Details_ResponseCONVERSION_TABLEItem.
     * 
     * @return MEINH
     */
    public java.lang.String getMEINH() {
        return MEINH;
    }


    /**
     * Sets the MEINH value for this PO_Details_ResponseCONVERSION_TABLEItem.
     * 
     * @param MEINH
     */
    public void setMEINH(java.lang.String MEINH) {
        this.MEINH = MEINH;
    }


    /**
     * Gets the MEINS value for this PO_Details_ResponseCONVERSION_TABLEItem.
     * 
     * @return MEINS
     */
    public java.lang.String getMEINS() {
        return MEINS;
    }


    /**
     * Sets the MEINS value for this PO_Details_ResponseCONVERSION_TABLEItem.
     * 
     * @param MEINS
     */
    public void setMEINS(java.lang.String MEINS) {
        this.MEINS = MEINS;
    }


    /**
     * Gets the UMREN value for this PO_Details_ResponseCONVERSION_TABLEItem.
     * 
     * @return UMREN
     */
    public java.math.BigDecimal getUMREN() {
        return UMREN;
    }


    /**
     * Sets the UMREN value for this PO_Details_ResponseCONVERSION_TABLEItem.
     * 
     * @param UMREN
     */
    public void setUMREN(java.math.BigDecimal UMREN) {
        this.UMREN = UMREN;
    }


    /**
     * Gets the UMREZ value for this PO_Details_ResponseCONVERSION_TABLEItem.
     * 
     * @return UMREZ
     */
    public java.math.BigDecimal getUMREZ() {
        return UMREZ;
    }


    /**
     * Sets the UMREZ value for this PO_Details_ResponseCONVERSION_TABLEItem.
     * 
     * @param UMREZ
     */
    public void setUMREZ(java.math.BigDecimal UMREZ) {
        this.UMREZ = UMREZ;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PO_Details_ResponseCONVERSION_TABLEItem)) return false;
        PO_Details_ResponseCONVERSION_TABLEItem other = (PO_Details_ResponseCONVERSION_TABLEItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PO_ITEM==null && other.getPO_ITEM()==null) || 
             (this.PO_ITEM!=null &&
              this.PO_ITEM.equals(other.getPO_ITEM()))) &&
            ((this.MATNR==null && other.getMATNR()==null) || 
             (this.MATNR!=null &&
              this.MATNR.equals(other.getMATNR()))) &&
            ((this.MEINH==null && other.getMEINH()==null) || 
             (this.MEINH!=null &&
              this.MEINH.equals(other.getMEINH()))) &&
            ((this.MEINS==null && other.getMEINS()==null) || 
             (this.MEINS!=null &&
              this.MEINS.equals(other.getMEINS()))) &&
            ((this.UMREN==null && other.getUMREN()==null) || 
             (this.UMREN!=null &&
              this.UMREN.equals(other.getUMREN()))) &&
            ((this.UMREZ==null && other.getUMREZ()==null) || 
             (this.UMREZ!=null &&
              this.UMREZ.equals(other.getUMREZ())));
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
        if (getPO_ITEM() != null) {
            _hashCode += getPO_ITEM().hashCode();
        }
        if (getMATNR() != null) {
            _hashCode += getMATNR().hashCode();
        }
        if (getMEINH() != null) {
            _hashCode += getMEINH().hashCode();
        }
        if (getMEINS() != null) {
            _hashCode += getMEINS().hashCode();
        }
        if (getUMREN() != null) {
            _hashCode += getUMREN().hashCode();
        }
        if (getUMREZ() != null) {
            _hashCode += getUMREZ().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PO_Details_ResponseCONVERSION_TABLEItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://incture.com/AccountPayable", ">>PO_Details_Response>CONVERSION_TABLE>item"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PO_ITEM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PO_ITEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MATNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MATNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MEINH");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MEINH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MEINS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MEINS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UMREN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UMREN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UMREZ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UMREZ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
