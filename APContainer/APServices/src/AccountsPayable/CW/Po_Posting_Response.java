/**
 * Po_Posting_Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package AccountsPayable.CW;

public class Po_Posting_Response  implements java.io.Serializable {
    private java.lang.String FISCAL_YEAR;

    private java.lang.String INVOICEDOCNUMBER;

    private java.lang.String ID;

    private java.lang.String NUMBER;

    private java.lang.String MESSAGE;

    public Po_Posting_Response() {
    }

    public Po_Posting_Response(
           java.lang.String FISCAL_YEAR,
           java.lang.String INVOICEDOCNUMBER,
           java.lang.String ID,
           java.lang.String NUMBER,
           java.lang.String MESSAGE) {
           this.FISCAL_YEAR = FISCAL_YEAR;
           this.INVOICEDOCNUMBER = INVOICEDOCNUMBER;
           this.ID = ID;
           this.NUMBER = NUMBER;
           this.MESSAGE = MESSAGE;
    }


    /**
     * Gets the FISCAL_YEAR value for this Po_Posting_Response.
     * 
     * @return FISCAL_YEAR
     */
    public java.lang.String getFISCAL_YEAR() {
        return FISCAL_YEAR;
    }


    /**
     * Sets the FISCAL_YEAR value for this Po_Posting_Response.
     * 
     * @param FISCAL_YEAR
     */
    public void setFISCAL_YEAR(java.lang.String FISCAL_YEAR) {
        this.FISCAL_YEAR = FISCAL_YEAR;
    }


    /**
     * Gets the INVOICEDOCNUMBER value for this Po_Posting_Response.
     * 
     * @return INVOICEDOCNUMBER
     */
    public java.lang.String getINVOICEDOCNUMBER() {
        return INVOICEDOCNUMBER;
    }


    /**
     * Sets the INVOICEDOCNUMBER value for this Po_Posting_Response.
     * 
     * @param INVOICEDOCNUMBER
     */
    public void setINVOICEDOCNUMBER(java.lang.String INVOICEDOCNUMBER) {
        this.INVOICEDOCNUMBER = INVOICEDOCNUMBER;
    }


    /**
     * Gets the ID value for this Po_Posting_Response.
     * 
     * @return ID
     */
    public java.lang.String getID() {
        return ID;
    }


    /**
     * Sets the ID value for this Po_Posting_Response.
     * 
     * @param ID
     */
    public void setID(java.lang.String ID) {
        this.ID = ID;
    }


    /**
     * Gets the NUMBER value for this Po_Posting_Response.
     * 
     * @return NUMBER
     */
    public java.lang.String getNUMBER() {
        return NUMBER;
    }


    /**
     * Sets the NUMBER value for this Po_Posting_Response.
     * 
     * @param NUMBER
     */
    public void setNUMBER(java.lang.String NUMBER) {
        this.NUMBER = NUMBER;
    }


    /**
     * Gets the MESSAGE value for this Po_Posting_Response.
     * 
     * @return MESSAGE
     */
    public java.lang.String getMESSAGE() {
        return MESSAGE;
    }


    /**
     * Sets the MESSAGE value for this Po_Posting_Response.
     * 
     * @param MESSAGE
     */
    public void setMESSAGE(java.lang.String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Po_Posting_Response)) return false;
        Po_Posting_Response other = (Po_Posting_Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.FISCAL_YEAR==null && other.getFISCAL_YEAR()==null) || 
             (this.FISCAL_YEAR!=null &&
              this.FISCAL_YEAR.equals(other.getFISCAL_YEAR()))) &&
            ((this.INVOICEDOCNUMBER==null && other.getINVOICEDOCNUMBER()==null) || 
             (this.INVOICEDOCNUMBER!=null &&
              this.INVOICEDOCNUMBER.equals(other.getINVOICEDOCNUMBER()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.NUMBER==null && other.getNUMBER()==null) || 
             (this.NUMBER!=null &&
              this.NUMBER.equals(other.getNUMBER()))) &&
            ((this.MESSAGE==null && other.getMESSAGE()==null) || 
             (this.MESSAGE!=null &&
              this.MESSAGE.equals(other.getMESSAGE())));
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
        if (getFISCAL_YEAR() != null) {
            _hashCode += getFISCAL_YEAR().hashCode();
        }
        if (getINVOICEDOCNUMBER() != null) {
            _hashCode += getINVOICEDOCNUMBER().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getNUMBER() != null) {
            _hashCode += getNUMBER().hashCode();
        }
        if (getMESSAGE() != null) {
            _hashCode += getMESSAGE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Po_Posting_Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:CW:AccountsPayable", "Po_Posting_Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FISCAL_YEAR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FISCAL_YEAR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INVOICEDOCNUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "INVOICEDOCNUMBER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NUMBER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MESSAGE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MESSAGE"));
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
