/**
 * Po_Posting_RequestMATERIAL_POSTING.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package AccountsPayable.CW;

public class Po_Posting_RequestMATERIAL_POSTING  implements java.io.Serializable {
    private java.lang.String INVOICE_DOC_ITEM;

    private java.lang.String MATERIAL;

    private java.lang.String VAL_AREA;

    private java.lang.String DB_CR_IND;

    private java.lang.String VALUATION_TYPE;

    private java.math.BigDecimal ITEM_AMOUNT;

    private java.lang.String TAX_CODE;

    private java.lang.String TAXJURCODE;

    private java.lang.String BASE_UOM;

    private java.lang.String BASE_UOM_ISO;

    private java.lang.String MATERIAL_EXTERNAL;

    private java.lang.String MATERIAL_GUID;

    private java.lang.String MATERIAL_VERSION;

    private java.math.BigDecimal QUANTITY;

    public Po_Posting_RequestMATERIAL_POSTING() {
    }

    public Po_Posting_RequestMATERIAL_POSTING(
           java.lang.String INVOICE_DOC_ITEM,
           java.lang.String MATERIAL,
           java.lang.String VAL_AREA,
           java.lang.String DB_CR_IND,
           java.lang.String VALUATION_TYPE,
           java.math.BigDecimal ITEM_AMOUNT,
           java.lang.String TAX_CODE,
           java.lang.String TAXJURCODE,
           java.lang.String BASE_UOM,
           java.lang.String BASE_UOM_ISO,
           java.lang.String MATERIAL_EXTERNAL,
           java.lang.String MATERIAL_GUID,
           java.lang.String MATERIAL_VERSION,
           java.math.BigDecimal QUANTITY) {
           this.INVOICE_DOC_ITEM = INVOICE_DOC_ITEM;
           this.MATERIAL = MATERIAL;
           this.VAL_AREA = VAL_AREA;
           this.DB_CR_IND = DB_CR_IND;
           this.VALUATION_TYPE = VALUATION_TYPE;
           this.ITEM_AMOUNT = ITEM_AMOUNT;
           this.TAX_CODE = TAX_CODE;
           this.TAXJURCODE = TAXJURCODE;
           this.BASE_UOM = BASE_UOM;
           this.BASE_UOM_ISO = BASE_UOM_ISO;
           this.MATERIAL_EXTERNAL = MATERIAL_EXTERNAL;
           this.MATERIAL_GUID = MATERIAL_GUID;
           this.MATERIAL_VERSION = MATERIAL_VERSION;
           this.QUANTITY = QUANTITY;
    }


    /**
     * Gets the INVOICE_DOC_ITEM value for this Po_Posting_RequestMATERIAL_POSTING.
     * 
     * @return INVOICE_DOC_ITEM
     */
    public java.lang.String getINVOICE_DOC_ITEM() {
        return INVOICE_DOC_ITEM;
    }


    /**
     * Sets the INVOICE_DOC_ITEM value for this Po_Posting_RequestMATERIAL_POSTING.
     * 
     * @param INVOICE_DOC_ITEM
     */
    public void setINVOICE_DOC_ITEM(java.lang.String INVOICE_DOC_ITEM) {
        this.INVOICE_DOC_ITEM = INVOICE_DOC_ITEM;
    }


    /**
     * Gets the MATERIAL value for this Po_Posting_RequestMATERIAL_POSTING.
     * 
     * @return MATERIAL
     */
    public java.lang.String getMATERIAL() {
        return MATERIAL;
    }


    /**
     * Sets the MATERIAL value for this Po_Posting_RequestMATERIAL_POSTING.
     * 
     * @param MATERIAL
     */
    public void setMATERIAL(java.lang.String MATERIAL) {
        this.MATERIAL = MATERIAL;
    }


    /**
     * Gets the VAL_AREA value for this Po_Posting_RequestMATERIAL_POSTING.
     * 
     * @return VAL_AREA
     */
    public java.lang.String getVAL_AREA() {
        return VAL_AREA;
    }


    /**
     * Sets the VAL_AREA value for this Po_Posting_RequestMATERIAL_POSTING.
     * 
     * @param VAL_AREA
     */
    public void setVAL_AREA(java.lang.String VAL_AREA) {
        this.VAL_AREA = VAL_AREA;
    }


    /**
     * Gets the DB_CR_IND value for this Po_Posting_RequestMATERIAL_POSTING.
     * 
     * @return DB_CR_IND
     */
    public java.lang.String getDB_CR_IND() {
        return DB_CR_IND;
    }


    /**
     * Sets the DB_CR_IND value for this Po_Posting_RequestMATERIAL_POSTING.
     * 
     * @param DB_CR_IND
     */
    public void setDB_CR_IND(java.lang.String DB_CR_IND) {
        this.DB_CR_IND = DB_CR_IND;
    }


    /**
     * Gets the VALUATION_TYPE value for this Po_Posting_RequestMATERIAL_POSTING.
     * 
     * @return VALUATION_TYPE
     */
    public java.lang.String getVALUATION_TYPE() {
        return VALUATION_TYPE;
    }


    /**
     * Sets the VALUATION_TYPE value for this Po_Posting_RequestMATERIAL_POSTING.
     * 
     * @param VALUATION_TYPE
     */
    public void setVALUATION_TYPE(java.lang.String VALUATION_TYPE) {
        this.VALUATION_TYPE = VALUATION_TYPE;
    }


    /**
     * Gets the ITEM_AMOUNT value for this Po_Posting_RequestMATERIAL_POSTING.
     * 
     * @return ITEM_AMOUNT
     */
    public java.math.BigDecimal getITEM_AMOUNT() {
        return ITEM_AMOUNT;
    }


    /**
     * Sets the ITEM_AMOUNT value for this Po_Posting_RequestMATERIAL_POSTING.
     * 
     * @param ITEM_AMOUNT
     */
    public void setITEM_AMOUNT(java.math.BigDecimal ITEM_AMOUNT) {
        this.ITEM_AMOUNT = ITEM_AMOUNT;
    }


    /**
     * Gets the TAX_CODE value for this Po_Posting_RequestMATERIAL_POSTING.
     * 
     * @return TAX_CODE
     */
    public java.lang.String getTAX_CODE() {
        return TAX_CODE;
    }


    /**
     * Sets the TAX_CODE value for this Po_Posting_RequestMATERIAL_POSTING.
     * 
     * @param TAX_CODE
     */
    public void setTAX_CODE(java.lang.String TAX_CODE) {
        this.TAX_CODE = TAX_CODE;
    }


    /**
     * Gets the TAXJURCODE value for this Po_Posting_RequestMATERIAL_POSTING.
     * 
     * @return TAXJURCODE
     */
    public java.lang.String getTAXJURCODE() {
        return TAXJURCODE;
    }


    /**
     * Sets the TAXJURCODE value for this Po_Posting_RequestMATERIAL_POSTING.
     * 
     * @param TAXJURCODE
     */
    public void setTAXJURCODE(java.lang.String TAXJURCODE) {
        this.TAXJURCODE = TAXJURCODE;
    }


    /**
     * Gets the BASE_UOM value for this Po_Posting_RequestMATERIAL_POSTING.
     * 
     * @return BASE_UOM
     */
    public java.lang.String getBASE_UOM() {
        return BASE_UOM;
    }


    /**
     * Sets the BASE_UOM value for this Po_Posting_RequestMATERIAL_POSTING.
     * 
     * @param BASE_UOM
     */
    public void setBASE_UOM(java.lang.String BASE_UOM) {
        this.BASE_UOM = BASE_UOM;
    }


    /**
     * Gets the BASE_UOM_ISO value for this Po_Posting_RequestMATERIAL_POSTING.
     * 
     * @return BASE_UOM_ISO
     */
    public java.lang.String getBASE_UOM_ISO() {
        return BASE_UOM_ISO;
    }


    /**
     * Sets the BASE_UOM_ISO value for this Po_Posting_RequestMATERIAL_POSTING.
     * 
     * @param BASE_UOM_ISO
     */
    public void setBASE_UOM_ISO(java.lang.String BASE_UOM_ISO) {
        this.BASE_UOM_ISO = BASE_UOM_ISO;
    }


    /**
     * Gets the MATERIAL_EXTERNAL value for this Po_Posting_RequestMATERIAL_POSTING.
     * 
     * @return MATERIAL_EXTERNAL
     */
    public java.lang.String getMATERIAL_EXTERNAL() {
        return MATERIAL_EXTERNAL;
    }


    /**
     * Sets the MATERIAL_EXTERNAL value for this Po_Posting_RequestMATERIAL_POSTING.
     * 
     * @param MATERIAL_EXTERNAL
     */
    public void setMATERIAL_EXTERNAL(java.lang.String MATERIAL_EXTERNAL) {
        this.MATERIAL_EXTERNAL = MATERIAL_EXTERNAL;
    }


    /**
     * Gets the MATERIAL_GUID value for this Po_Posting_RequestMATERIAL_POSTING.
     * 
     * @return MATERIAL_GUID
     */
    public java.lang.String getMATERIAL_GUID() {
        return MATERIAL_GUID;
    }


    /**
     * Sets the MATERIAL_GUID value for this Po_Posting_RequestMATERIAL_POSTING.
     * 
     * @param MATERIAL_GUID
     */
    public void setMATERIAL_GUID(java.lang.String MATERIAL_GUID) {
        this.MATERIAL_GUID = MATERIAL_GUID;
    }


    /**
     * Gets the MATERIAL_VERSION value for this Po_Posting_RequestMATERIAL_POSTING.
     * 
     * @return MATERIAL_VERSION
     */
    public java.lang.String getMATERIAL_VERSION() {
        return MATERIAL_VERSION;
    }


    /**
     * Sets the MATERIAL_VERSION value for this Po_Posting_RequestMATERIAL_POSTING.
     * 
     * @param MATERIAL_VERSION
     */
    public void setMATERIAL_VERSION(java.lang.String MATERIAL_VERSION) {
        this.MATERIAL_VERSION = MATERIAL_VERSION;
    }


    /**
     * Gets the QUANTITY value for this Po_Posting_RequestMATERIAL_POSTING.
     * 
     * @return QUANTITY
     */
    public java.math.BigDecimal getQUANTITY() {
        return QUANTITY;
    }


    /**
     * Sets the QUANTITY value for this Po_Posting_RequestMATERIAL_POSTING.
     * 
     * @param QUANTITY
     */
    public void setQUANTITY(java.math.BigDecimal QUANTITY) {
        this.QUANTITY = QUANTITY;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Po_Posting_RequestMATERIAL_POSTING)) return false;
        Po_Posting_RequestMATERIAL_POSTING other = (Po_Posting_RequestMATERIAL_POSTING) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.INVOICE_DOC_ITEM==null && other.getINVOICE_DOC_ITEM()==null) || 
             (this.INVOICE_DOC_ITEM!=null &&
              this.INVOICE_DOC_ITEM.equals(other.getINVOICE_DOC_ITEM()))) &&
            ((this.MATERIAL==null && other.getMATERIAL()==null) || 
             (this.MATERIAL!=null &&
              this.MATERIAL.equals(other.getMATERIAL()))) &&
            ((this.VAL_AREA==null && other.getVAL_AREA()==null) || 
             (this.VAL_AREA!=null &&
              this.VAL_AREA.equals(other.getVAL_AREA()))) &&
            ((this.DB_CR_IND==null && other.getDB_CR_IND()==null) || 
             (this.DB_CR_IND!=null &&
              this.DB_CR_IND.equals(other.getDB_CR_IND()))) &&
            ((this.VALUATION_TYPE==null && other.getVALUATION_TYPE()==null) || 
             (this.VALUATION_TYPE!=null &&
              this.VALUATION_TYPE.equals(other.getVALUATION_TYPE()))) &&
            ((this.ITEM_AMOUNT==null && other.getITEM_AMOUNT()==null) || 
             (this.ITEM_AMOUNT!=null &&
              this.ITEM_AMOUNT.equals(other.getITEM_AMOUNT()))) &&
            ((this.TAX_CODE==null && other.getTAX_CODE()==null) || 
             (this.TAX_CODE!=null &&
              this.TAX_CODE.equals(other.getTAX_CODE()))) &&
            ((this.TAXJURCODE==null && other.getTAXJURCODE()==null) || 
             (this.TAXJURCODE!=null &&
              this.TAXJURCODE.equals(other.getTAXJURCODE()))) &&
            ((this.BASE_UOM==null && other.getBASE_UOM()==null) || 
             (this.BASE_UOM!=null &&
              this.BASE_UOM.equals(other.getBASE_UOM()))) &&
            ((this.BASE_UOM_ISO==null && other.getBASE_UOM_ISO()==null) || 
             (this.BASE_UOM_ISO!=null &&
              this.BASE_UOM_ISO.equals(other.getBASE_UOM_ISO()))) &&
            ((this.MATERIAL_EXTERNAL==null && other.getMATERIAL_EXTERNAL()==null) || 
             (this.MATERIAL_EXTERNAL!=null &&
              this.MATERIAL_EXTERNAL.equals(other.getMATERIAL_EXTERNAL()))) &&
            ((this.MATERIAL_GUID==null && other.getMATERIAL_GUID()==null) || 
             (this.MATERIAL_GUID!=null &&
              this.MATERIAL_GUID.equals(other.getMATERIAL_GUID()))) &&
            ((this.MATERIAL_VERSION==null && other.getMATERIAL_VERSION()==null) || 
             (this.MATERIAL_VERSION!=null &&
              this.MATERIAL_VERSION.equals(other.getMATERIAL_VERSION()))) &&
            ((this.QUANTITY==null && other.getQUANTITY()==null) || 
             (this.QUANTITY!=null &&
              this.QUANTITY.equals(other.getQUANTITY())));
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
        if (getINVOICE_DOC_ITEM() != null) {
            _hashCode += getINVOICE_DOC_ITEM().hashCode();
        }
        if (getMATERIAL() != null) {
            _hashCode += getMATERIAL().hashCode();
        }
        if (getVAL_AREA() != null) {
            _hashCode += getVAL_AREA().hashCode();
        }
        if (getDB_CR_IND() != null) {
            _hashCode += getDB_CR_IND().hashCode();
        }
        if (getVALUATION_TYPE() != null) {
            _hashCode += getVALUATION_TYPE().hashCode();
        }
        if (getITEM_AMOUNT() != null) {
            _hashCode += getITEM_AMOUNT().hashCode();
        }
        if (getTAX_CODE() != null) {
            _hashCode += getTAX_CODE().hashCode();
        }
        if (getTAXJURCODE() != null) {
            _hashCode += getTAXJURCODE().hashCode();
        }
        if (getBASE_UOM() != null) {
            _hashCode += getBASE_UOM().hashCode();
        }
        if (getBASE_UOM_ISO() != null) {
            _hashCode += getBASE_UOM_ISO().hashCode();
        }
        if (getMATERIAL_EXTERNAL() != null) {
            _hashCode += getMATERIAL_EXTERNAL().hashCode();
        }
        if (getMATERIAL_GUID() != null) {
            _hashCode += getMATERIAL_GUID().hashCode();
        }
        if (getMATERIAL_VERSION() != null) {
            _hashCode += getMATERIAL_VERSION().hashCode();
        }
        if (getQUANTITY() != null) {
            _hashCode += getQUANTITY().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Po_Posting_RequestMATERIAL_POSTING.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:CW:AccountsPayable", ">Po_Posting_Request>MATERIAL_POSTING"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INVOICE_DOC_ITEM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "INVOICE_DOC_ITEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MATERIAL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MATERIAL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VAL_AREA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VAL_AREA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DB_CR_IND");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DB_CR_IND"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VALUATION_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VALUATION_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ITEM_AMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ITEM_AMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAX_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TAX_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAXJURCODE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TAXJURCODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BASE_UOM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BASE_UOM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BASE_UOM_ISO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BASE_UOM_ISO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MATERIAL_EXTERNAL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MATERIAL_EXTERNAL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MATERIAL_GUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MATERIAL_GUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MATERIAL_VERSION");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MATERIAL_VERSION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QUANTITY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QUANTITY"));
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
