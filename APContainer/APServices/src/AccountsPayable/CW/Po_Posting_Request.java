/**
 * Po_Posting_Request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package AccountsPayable.CW;

public class Po_Posting_Request  implements java.io.Serializable {
    private AccountsPayable.CW.Po_Posting_RequestACCOUNTINGDATAItem[][] ACCOUNTINGDATA;

    private AccountsPayable.CW.Po_Posting_RequestPosting_Header posting_Header;

    private AccountsPayable.CW.Po_Posting_RequestPosting_LineItems[] posting_LineItems;

    private AccountsPayable.CW.Po_Posting_RequestGL_ACCOUNT_data[] GL_ACCOUNT_data;

    private AccountsPayable.CW.Po_Posting_RequestMATERIAL_POSTING[] MATERIAL_POSTING;

    public Po_Posting_Request() {
    }

    public Po_Posting_Request(
           AccountsPayable.CW.Po_Posting_RequestACCOUNTINGDATAItem[][] ACCOUNTINGDATA,
           AccountsPayable.CW.Po_Posting_RequestPosting_Header posting_Header,
           AccountsPayable.CW.Po_Posting_RequestPosting_LineItems[] posting_LineItems,
           AccountsPayable.CW.Po_Posting_RequestGL_ACCOUNT_data[] GL_ACCOUNT_data,
           AccountsPayable.CW.Po_Posting_RequestMATERIAL_POSTING[] MATERIAL_POSTING) {
           this.ACCOUNTINGDATA = ACCOUNTINGDATA;
           this.posting_Header = posting_Header;
           this.posting_LineItems = posting_LineItems;
           this.GL_ACCOUNT_data = GL_ACCOUNT_data;
           this.MATERIAL_POSTING = MATERIAL_POSTING;
    }


    /**
     * Gets the ACCOUNTINGDATA value for this Po_Posting_Request.
     * 
     * @return ACCOUNTINGDATA
     */
    public AccountsPayable.CW.Po_Posting_RequestACCOUNTINGDATAItem[][] getACCOUNTINGDATA() {
        return ACCOUNTINGDATA;
    }


    /**
     * Sets the ACCOUNTINGDATA value for this Po_Posting_Request.
     * 
     * @param ACCOUNTINGDATA
     */
    public void setACCOUNTINGDATA(AccountsPayable.CW.Po_Posting_RequestACCOUNTINGDATAItem[][] ACCOUNTINGDATA) {
        this.ACCOUNTINGDATA = ACCOUNTINGDATA;
    }

    public AccountsPayable.CW.Po_Posting_RequestACCOUNTINGDATAItem[] getACCOUNTINGDATA(int i) {
        return this.ACCOUNTINGDATA[i];
    }

    public void setACCOUNTINGDATA(int i, AccountsPayable.CW.Po_Posting_RequestACCOUNTINGDATAItem[] _value) {
        this.ACCOUNTINGDATA[i] = _value;
    }


    /**
     * Gets the posting_Header value for this Po_Posting_Request.
     * 
     * @return posting_Header
     */
    public AccountsPayable.CW.Po_Posting_RequestPosting_Header getPosting_Header() {
        return posting_Header;
    }


    /**
     * Sets the posting_Header value for this Po_Posting_Request.
     * 
     * @param posting_Header
     */
    public void setPosting_Header(AccountsPayable.CW.Po_Posting_RequestPosting_Header posting_Header) {
        this.posting_Header = posting_Header;
    }


    /**
     * Gets the posting_LineItems value for this Po_Posting_Request.
     * 
     * @return posting_LineItems
     */
    public AccountsPayable.CW.Po_Posting_RequestPosting_LineItems[] getPosting_LineItems() {
        return posting_LineItems;
    }


    /**
     * Sets the posting_LineItems value for this Po_Posting_Request.
     * 
     * @param posting_LineItems
     */
    public void setPosting_LineItems(AccountsPayable.CW.Po_Posting_RequestPosting_LineItems[] posting_LineItems) {
        this.posting_LineItems = posting_LineItems;
    }

    public AccountsPayable.CW.Po_Posting_RequestPosting_LineItems getPosting_LineItems(int i) {
        return this.posting_LineItems[i];
    }

    public void setPosting_LineItems(int i, AccountsPayable.CW.Po_Posting_RequestPosting_LineItems _value) {
        this.posting_LineItems[i] = _value;
    }


    /**
     * Gets the GL_ACCOUNT_data value for this Po_Posting_Request.
     * 
     * @return GL_ACCOUNT_data
     */
    public AccountsPayable.CW.Po_Posting_RequestGL_ACCOUNT_data[] getGL_ACCOUNT_data() {
        return GL_ACCOUNT_data;
    }


    /**
     * Sets the GL_ACCOUNT_data value for this Po_Posting_Request.
     * 
     * @param GL_ACCOUNT_data
     */
    public void setGL_ACCOUNT_data(AccountsPayable.CW.Po_Posting_RequestGL_ACCOUNT_data[] GL_ACCOUNT_data) {
        this.GL_ACCOUNT_data = GL_ACCOUNT_data;
    }

    public AccountsPayable.CW.Po_Posting_RequestGL_ACCOUNT_data getGL_ACCOUNT_data(int i) {
        return this.GL_ACCOUNT_data[i];
    }

    public void setGL_ACCOUNT_data(int i, AccountsPayable.CW.Po_Posting_RequestGL_ACCOUNT_data _value) {
        this.GL_ACCOUNT_data[i] = _value;
    }


    /**
     * Gets the MATERIAL_POSTING value for this Po_Posting_Request.
     * 
     * @return MATERIAL_POSTING
     */
    public AccountsPayable.CW.Po_Posting_RequestMATERIAL_POSTING[] getMATERIAL_POSTING() {
        return MATERIAL_POSTING;
    }


    /**
     * Sets the MATERIAL_POSTING value for this Po_Posting_Request.
     * 
     * @param MATERIAL_POSTING
     */
    public void setMATERIAL_POSTING(AccountsPayable.CW.Po_Posting_RequestMATERIAL_POSTING[] MATERIAL_POSTING) {
        this.MATERIAL_POSTING = MATERIAL_POSTING;
    }

    public AccountsPayable.CW.Po_Posting_RequestMATERIAL_POSTING getMATERIAL_POSTING(int i) {
        return this.MATERIAL_POSTING[i];
    }

    public void setMATERIAL_POSTING(int i, AccountsPayable.CW.Po_Posting_RequestMATERIAL_POSTING _value) {
        this.MATERIAL_POSTING[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Po_Posting_Request)) return false;
        Po_Posting_Request other = (Po_Posting_Request) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ACCOUNTINGDATA==null && other.getACCOUNTINGDATA()==null) || 
             (this.ACCOUNTINGDATA!=null &&
              java.util.Arrays.equals(this.ACCOUNTINGDATA, other.getACCOUNTINGDATA()))) &&
            ((this.posting_Header==null && other.getPosting_Header()==null) || 
             (this.posting_Header!=null &&
              this.posting_Header.equals(other.getPosting_Header()))) &&
            ((this.posting_LineItems==null && other.getPosting_LineItems()==null) || 
             (this.posting_LineItems!=null &&
              java.util.Arrays.equals(this.posting_LineItems, other.getPosting_LineItems()))) &&
            ((this.GL_ACCOUNT_data==null && other.getGL_ACCOUNT_data()==null) || 
             (this.GL_ACCOUNT_data!=null &&
              java.util.Arrays.equals(this.GL_ACCOUNT_data, other.getGL_ACCOUNT_data()))) &&
            ((this.MATERIAL_POSTING==null && other.getMATERIAL_POSTING()==null) || 
             (this.MATERIAL_POSTING!=null &&
              java.util.Arrays.equals(this.MATERIAL_POSTING, other.getMATERIAL_POSTING())));
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
        if (getACCOUNTINGDATA() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getACCOUNTINGDATA());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getACCOUNTINGDATA(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPosting_Header() != null) {
            _hashCode += getPosting_Header().hashCode();
        }
        if (getPosting_LineItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPosting_LineItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPosting_LineItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGL_ACCOUNT_data() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGL_ACCOUNT_data());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGL_ACCOUNT_data(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMATERIAL_POSTING() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMATERIAL_POSTING());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMATERIAL_POSTING(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Po_Posting_Request.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:CW:AccountsPayable", "Po_Posting_Request"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACCOUNTINGDATA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ACCOUNTINGDATA"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:CW:AccountsPayable", ">Po_Posting_Request>ACCOUNTINGDATA"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posting_Header");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Posting_Header"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:CW:AccountsPayable", ">Po_Posting_Request>Posting_Header"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posting_LineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Posting_LineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:CW:AccountsPayable", ">Po_Posting_Request>Posting_LineItems"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GL_ACCOUNT_data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GL_ACCOUNT_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:CW:AccountsPayable", ">Po_Posting_Request>GL_ACCOUNT_data"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MATERIAL_POSTING");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MATERIAL_POSTING"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:CW:AccountsPayable", ">Po_Posting_Request>MATERIAL_POSTING"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
