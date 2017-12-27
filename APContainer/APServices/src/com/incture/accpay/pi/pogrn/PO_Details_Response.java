package com.incture.accpay.pi.pogrn;
/**
 * PO_Details_Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

public class PO_Details_Response  implements java.io.Serializable {
    private PO_Details_ResponsePOACCOUNT_ASSIGNItem[] POACCOUNT_ASSIGN;

    private PO_Details_ResponsePOHeader POHeader;

    private PO_Details_ResponsePOItemITEM[] POItem;

    private PO_Details_ResponseGR_TotalsITEM[] GR_Totals;

    private PO_Details_ResponseGR_ITEMITEM[] GR_ITEM;

    private java.lang.String hasGRFlag;

    private java.lang.String hasHeaderCharges;

    private java.lang.String hasDiffrentDeliveryVendor;

    private java.lang.String deliveryVendorID;

    private PO_Details_ResponseCONVERSION_TABLEItem[] CONVERSION_TABLE;

    public PO_Details_Response() {
    }

    public PO_Details_Response(
           PO_Details_ResponsePOACCOUNT_ASSIGNItem[] POACCOUNT_ASSIGN,
           PO_Details_ResponsePOHeader POHeader,
           PO_Details_ResponsePOItemITEM[] POItem,
           PO_Details_ResponseGR_TotalsITEM[] GR_Totals,
           PO_Details_ResponseGR_ITEMITEM[] GR_ITEM,
           java.lang.String hasGRFlag,
           java.lang.String hasHeaderCharges,
           java.lang.String hasDiffrentDeliveryVendor,
           java.lang.String deliveryVendorID,
           PO_Details_ResponseCONVERSION_TABLEItem[] CONVERSION_TABLE) {
           this.POACCOUNT_ASSIGN = POACCOUNT_ASSIGN;
           this.POHeader = POHeader;
           this.POItem = POItem;
           this.GR_Totals = GR_Totals;
           this.GR_ITEM = GR_ITEM;
           this.hasGRFlag = hasGRFlag;
           this.hasHeaderCharges = hasHeaderCharges;
           this.hasDiffrentDeliveryVendor = hasDiffrentDeliveryVendor;
           this.deliveryVendorID = deliveryVendorID;
           this.CONVERSION_TABLE = CONVERSION_TABLE;
    }


    /**
     * Gets the POACCOUNT_ASSIGN value for this PO_Details_Response.
     * 
     * @return POACCOUNT_ASSIGN
     */
    public PO_Details_ResponsePOACCOUNT_ASSIGNItem[] getPOACCOUNT_ASSIGN() {
        return POACCOUNT_ASSIGN;
    }


    /**
     * Sets the POACCOUNT_ASSIGN value for this PO_Details_Response.
     * 
     * @param POACCOUNT_ASSIGN
     */
    public void setPOACCOUNT_ASSIGN(PO_Details_ResponsePOACCOUNT_ASSIGNItem[] POACCOUNT_ASSIGN) {
        this.POACCOUNT_ASSIGN = POACCOUNT_ASSIGN;
    }


    /**
     * Gets the POHeader value for this PO_Details_Response.
     * 
     * @return POHeader
     */
    public PO_Details_ResponsePOHeader getPOHeader() {
        return POHeader;
    }


    /**
     * Sets the POHeader value for this PO_Details_Response.
     * 
     * @param POHeader
     */
    public void setPOHeader(PO_Details_ResponsePOHeader POHeader) {
        this.POHeader = POHeader;
    }


    /**
     * Gets the POItem value for this PO_Details_Response.
     * 
     * @return POItem
     */
    public PO_Details_ResponsePOItemITEM[] getPOItem() {
        return POItem;
    }


    /**
     * Sets the POItem value for this PO_Details_Response.
     * 
     * @param POItem
     */
    public void setPOItem(PO_Details_ResponsePOItemITEM[] POItem) {
        this.POItem = POItem;
    }


    /**
     * Gets the GR_Totals value for this PO_Details_Response.
     * 
     * @return GR_Totals
     */
    public PO_Details_ResponseGR_TotalsITEM[] getGR_Totals() {
        return GR_Totals;
    }


    /**
     * Sets the GR_Totals value for this PO_Details_Response.
     * 
     * @param GR_Totals
     */
    public void setGR_Totals(PO_Details_ResponseGR_TotalsITEM[] GR_Totals) {
        this.GR_Totals = GR_Totals;
    }


    /**
     * Gets the GR_ITEM value for this PO_Details_Response.
     * 
     * @return GR_ITEM
     */
    public PO_Details_ResponseGR_ITEMITEM[] getGR_ITEM() {
        return GR_ITEM;
    }


    /**
     * Sets the GR_ITEM value for this PO_Details_Response.
     * 
     * @param GR_ITEM
     */
    public void setGR_ITEM(PO_Details_ResponseGR_ITEMITEM[] GR_ITEM) {
        this.GR_ITEM = GR_ITEM;
    }


    /**
     * Gets the hasGRFlag value for this PO_Details_Response.
     * 
     * @return hasGRFlag
     */
    public java.lang.String getHasGRFlag() {
        return hasGRFlag;
    }


    /**
     * Sets the hasGRFlag value for this PO_Details_Response.
     * 
     * @param hasGRFlag
     */
    public void setHasGRFlag(java.lang.String hasGRFlag) {
        this.hasGRFlag = hasGRFlag;
    }


    /**
     * Gets the hasHeaderCharges value for this PO_Details_Response.
     * 
     * @return hasHeaderCharges
     */
    public java.lang.String getHasHeaderCharges() {
        return hasHeaderCharges;
    }


    /**
     * Sets the hasHeaderCharges value for this PO_Details_Response.
     * 
     * @param hasHeaderCharges
     */
    public void setHasHeaderCharges(java.lang.String hasHeaderCharges) {
        this.hasHeaderCharges = hasHeaderCharges;
    }


    /**
     * Gets the hasDiffrentDeliveryVendor value for this PO_Details_Response.
     * 
     * @return hasDiffrentDeliveryVendor
     */
    public java.lang.String getHasDiffrentDeliveryVendor() {
        return hasDiffrentDeliveryVendor;
    }


    /**
     * Sets the hasDiffrentDeliveryVendor value for this PO_Details_Response.
     * 
     * @param hasDiffrentDeliveryVendor
     */
    public void setHasDiffrentDeliveryVendor(java.lang.String hasDiffrentDeliveryVendor) {
        this.hasDiffrentDeliveryVendor = hasDiffrentDeliveryVendor;
    }


    /**
     * Gets the deliveryVendorID value for this PO_Details_Response.
     * 
     * @return deliveryVendorID
     */
    public java.lang.String getDeliveryVendorID() {
        return deliveryVendorID;
    }


    /**
     * Sets the deliveryVendorID value for this PO_Details_Response.
     * 
     * @param deliveryVendorID
     */
    public void setDeliveryVendorID(java.lang.String deliveryVendorID) {
        this.deliveryVendorID = deliveryVendorID;
    }


    /**
     * Gets the CONVERSION_TABLE value for this PO_Details_Response.
     * 
     * @return CONVERSION_TABLE
     */
    public PO_Details_ResponseCONVERSION_TABLEItem[] getCONVERSION_TABLE() {
        return CONVERSION_TABLE;
    }


    /**
     * Sets the CONVERSION_TABLE value for this PO_Details_Response.
     * 
     * @param CONVERSION_TABLE
     */
    public void setCONVERSION_TABLE(PO_Details_ResponseCONVERSION_TABLEItem[] CONVERSION_TABLE) {
        this.CONVERSION_TABLE = CONVERSION_TABLE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PO_Details_Response)) return false;
        PO_Details_Response other = (PO_Details_Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.POACCOUNT_ASSIGN==null && other.getPOACCOUNT_ASSIGN()==null) || 
             (this.POACCOUNT_ASSIGN!=null &&
              java.util.Arrays.equals(this.POACCOUNT_ASSIGN, other.getPOACCOUNT_ASSIGN()))) &&
            ((this.POHeader==null && other.getPOHeader()==null) || 
             (this.POHeader!=null &&
              this.POHeader.equals(other.getPOHeader()))) &&
            ((this.POItem==null && other.getPOItem()==null) || 
             (this.POItem!=null &&
              java.util.Arrays.equals(this.POItem, other.getPOItem()))) &&
            ((this.GR_Totals==null && other.getGR_Totals()==null) || 
             (this.GR_Totals!=null &&
              java.util.Arrays.equals(this.GR_Totals, other.getGR_Totals()))) &&
            ((this.GR_ITEM==null && other.getGR_ITEM()==null) || 
             (this.GR_ITEM!=null &&
              java.util.Arrays.equals(this.GR_ITEM, other.getGR_ITEM()))) &&
            ((this.hasGRFlag==null && other.getHasGRFlag()==null) || 
             (this.hasGRFlag!=null &&
              this.hasGRFlag.equals(other.getHasGRFlag()))) &&
            ((this.hasHeaderCharges==null && other.getHasHeaderCharges()==null) || 
             (this.hasHeaderCharges!=null &&
              this.hasHeaderCharges.equals(other.getHasHeaderCharges()))) &&
            ((this.hasDiffrentDeliveryVendor==null && other.getHasDiffrentDeliveryVendor()==null) || 
             (this.hasDiffrentDeliveryVendor!=null &&
              this.hasDiffrentDeliveryVendor.equals(other.getHasDiffrentDeliveryVendor()))) &&
            ((this.deliveryVendorID==null && other.getDeliveryVendorID()==null) || 
             (this.deliveryVendorID!=null &&
              this.deliveryVendorID.equals(other.getDeliveryVendorID()))) &&
            ((this.CONVERSION_TABLE==null && other.getCONVERSION_TABLE()==null) || 
             (this.CONVERSION_TABLE!=null &&
              java.util.Arrays.equals(this.CONVERSION_TABLE, other.getCONVERSION_TABLE())));
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
        if (getPOACCOUNT_ASSIGN() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPOACCOUNT_ASSIGN());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPOACCOUNT_ASSIGN(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPOHeader() != null) {
            _hashCode += getPOHeader().hashCode();
        }
        if (getPOItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPOItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPOItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGR_Totals() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGR_Totals());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGR_Totals(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGR_ITEM() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGR_ITEM());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGR_ITEM(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHasGRFlag() != null) {
            _hashCode += getHasGRFlag().hashCode();
        }
        if (getHasHeaderCharges() != null) {
            _hashCode += getHasHeaderCharges().hashCode();
        }
        if (getHasDiffrentDeliveryVendor() != null) {
            _hashCode += getHasDiffrentDeliveryVendor().hashCode();
        }
        if (getDeliveryVendorID() != null) {
            _hashCode += getDeliveryVendorID().hashCode();
        }
        if (getCONVERSION_TABLE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCONVERSION_TABLE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCONVERSION_TABLE(), i);
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
        new org.apache.axis.description.TypeDesc(PO_Details_Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://incture.com/AccountPayable", "PO_Details_Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POACCOUNT_ASSIGN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "POACCOUNT_ASSIGN"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://incture.com/AccountPayable", ">>PO_Details_Response>POACCOUNT_ASSIGN>item"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "POHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://incture.com/AccountPayable", ">PO_Details_Response>POHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "POItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://incture.com/AccountPayable", ">>PO_Details_Response>POItem>ITEM"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "ITEM"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GR_Totals");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GR_Totals"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://incture.com/AccountPayable", ">>PO_Details_Response>GR_Totals>ITEM"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "ITEM"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GR_ITEM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GR_ITEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://incture.com/AccountPayable", ">>PO_Details_Response>GR_ITEM>ITEM"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "ITEM"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasGRFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HasGRFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasHeaderCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HasHeaderCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasDiffrentDeliveryVendor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HasDiffrentDeliveryVendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryVendorID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DeliveryVendorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONVERSION_TABLE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONVERSION_TABLE"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://incture.com/AccountPayable", ">>PO_Details_Response>CONVERSION_TABLE>item"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
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
