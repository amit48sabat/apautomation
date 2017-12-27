/**
 * ThreeWay_Matching_ResponseITEMS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package AccountsPayable.CW;

public class ThreeWay_Matching_ResponseITEMS  implements java.io.Serializable {
    private java.lang.String PONUMBER;

    private java.lang.String POITEM_ID;

    private java.lang.String MESSAGE;

    public ThreeWay_Matching_ResponseITEMS() {
    }

    public ThreeWay_Matching_ResponseITEMS(
           java.lang.String PONUMBER,
           java.lang.String POITEM_ID,
           java.lang.String MESSAGE) {
           this.PONUMBER = PONUMBER;
           this.POITEM_ID = POITEM_ID;
           this.MESSAGE = MESSAGE;
    }


    /**
     * Gets the PONUMBER value for this ThreeWay_Matching_ResponseITEMS.
     * 
     * @return PONUMBER
     */
    public java.lang.String getPONUMBER() {
        return PONUMBER;
    }


    /**
     * Sets the PONUMBER value for this ThreeWay_Matching_ResponseITEMS.
     * 
     * @param PONUMBER
     */
    public void setPONUMBER(java.lang.String PONUMBER) {
        this.PONUMBER = PONUMBER;
    }


    /**
     * Gets the POITEM_ID value for this ThreeWay_Matching_ResponseITEMS.
     * 
     * @return POITEM_ID
     */
    public java.lang.String getPOITEM_ID() {
        return POITEM_ID;
    }


    /**
     * Sets the POITEM_ID value for this ThreeWay_Matching_ResponseITEMS.
     * 
     * @param POITEM_ID
     */
    public void setPOITEM_ID(java.lang.String POITEM_ID) {
        this.POITEM_ID = POITEM_ID;
    }


    /**
     * Gets the MESSAGE value for this ThreeWay_Matching_ResponseITEMS.
     * 
     * @return MESSAGE
     */
    public java.lang.String getMESSAGE() {
        return MESSAGE;
    }


    /**
     * Sets the MESSAGE value for this ThreeWay_Matching_ResponseITEMS.
     * 
     * @param MESSAGE
     */
    public void setMESSAGE(java.lang.String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ThreeWay_Matching_ResponseITEMS)) return false;
        ThreeWay_Matching_ResponseITEMS other = (ThreeWay_Matching_ResponseITEMS) obj;
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
            ((this.POITEM_ID==null && other.getPOITEM_ID()==null) || 
             (this.POITEM_ID!=null &&
              this.POITEM_ID.equals(other.getPOITEM_ID()))) &&
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
        if (getPONUMBER() != null) {
            _hashCode += getPONUMBER().hashCode();
        }
        if (getPOITEM_ID() != null) {
            _hashCode += getPOITEM_ID().hashCode();
        }
        if (getMESSAGE() != null) {
            _hashCode += getMESSAGE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThreeWay_Matching_ResponseITEMS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:CW:AccountsPayable", ">ThreeWay_Matching_Response>ITEMS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PONUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PONUMBER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POITEM_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "POITEM_ID"));
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
