/**
 * ThreeWay_Matching_RequestItems.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package AccountsPayable.CW;

public class ThreeWay_Matching_RequestItems  implements java.io.Serializable {
    private java.math.BigDecimal POITEM_CONV_NUM1;

    private java.math.BigDecimal POITEM_CONV_DEN1;

    private java.math.BigDecimal POITEM_QUANTITY;

    private java.lang.String posting_Date;

    private java.lang.String POHEADER_COMP_CODE;

    private java.math.BigDecimal INVOICE_QUANTITY;

    private java.lang.String POHISTORY_MAT_DOC;

    private java.math.BigDecimal NET_WORTH;

    private java.lang.String POITEM_ITEM_CAT;

    private java.math.BigDecimal POHISTORY_TOTALS_IV_QTY;

    private java.lang.String DR_CR_INDICATOR;

    private java.lang.String POHEADER_CURRENCY;

    private java.math.BigDecimal POHISTORY_TOTALS_DELIV_QTY;

    private java.lang.String GOODS_REC_INDICATOR;

    private java.math.BigDecimal POHISTORY_TOTALS_PO_PR_QNT;

    private java.math.BigDecimal POHISTORY_TOTALS_VAL_IV_FOR;

    private java.math.BigDecimal DOC_AMOUNT_CURRENCY;

    private java.lang.String PO_NUMBER;

    private java.lang.String PO_ITEM_ID;

    private java.math.BigDecimal POHISTORY_TOTALS_VAL_GR_FOR;

    public ThreeWay_Matching_RequestItems() {
    }

    public ThreeWay_Matching_RequestItems(
           java.math.BigDecimal POITEM_CONV_NUM1,
           java.math.BigDecimal POITEM_CONV_DEN1,
           java.math.BigDecimal POITEM_QUANTITY,
           java.lang.String posting_Date,
           java.lang.String POHEADER_COMP_CODE,
           java.math.BigDecimal INVOICE_QUANTITY,
           java.lang.String POHISTORY_MAT_DOC,
           java.math.BigDecimal NET_WORTH,
           java.lang.String POITEM_ITEM_CAT,
           java.math.BigDecimal POHISTORY_TOTALS_IV_QTY,
           java.lang.String DR_CR_INDICATOR,
           java.lang.String POHEADER_CURRENCY,
           java.math.BigDecimal POHISTORY_TOTALS_DELIV_QTY,
           java.lang.String GOODS_REC_INDICATOR,
           java.math.BigDecimal POHISTORY_TOTALS_PO_PR_QNT,
           java.math.BigDecimal POHISTORY_TOTALS_VAL_IV_FOR,
           java.math.BigDecimal DOC_AMOUNT_CURRENCY,
           java.lang.String PO_NUMBER,
           java.lang.String PO_ITEM_ID,
           java.math.BigDecimal POHISTORY_TOTALS_VAL_GR_FOR) {
           this.POITEM_CONV_NUM1 = POITEM_CONV_NUM1;
           this.POITEM_CONV_DEN1 = POITEM_CONV_DEN1;
           this.POITEM_QUANTITY = POITEM_QUANTITY;
           this.posting_Date = posting_Date;
           this.POHEADER_COMP_CODE = POHEADER_COMP_CODE;
           this.INVOICE_QUANTITY = INVOICE_QUANTITY;
           this.POHISTORY_MAT_DOC = POHISTORY_MAT_DOC;
           this.NET_WORTH = NET_WORTH;
           this.POITEM_ITEM_CAT = POITEM_ITEM_CAT;
           this.POHISTORY_TOTALS_IV_QTY = POHISTORY_TOTALS_IV_QTY;
           this.DR_CR_INDICATOR = DR_CR_INDICATOR;
           this.POHEADER_CURRENCY = POHEADER_CURRENCY;
           this.POHISTORY_TOTALS_DELIV_QTY = POHISTORY_TOTALS_DELIV_QTY;
           this.GOODS_REC_INDICATOR = GOODS_REC_INDICATOR;
           this.POHISTORY_TOTALS_PO_PR_QNT = POHISTORY_TOTALS_PO_PR_QNT;
           this.POHISTORY_TOTALS_VAL_IV_FOR = POHISTORY_TOTALS_VAL_IV_FOR;
           this.DOC_AMOUNT_CURRENCY = DOC_AMOUNT_CURRENCY;
           this.PO_NUMBER = PO_NUMBER;
           this.PO_ITEM_ID = PO_ITEM_ID;
           this.POHISTORY_TOTALS_VAL_GR_FOR = POHISTORY_TOTALS_VAL_GR_FOR;
    }


    /**
     * Gets the POITEM_CONV_NUM1 value for this ThreeWay_Matching_RequestItems.
     * 
     * @return POITEM_CONV_NUM1
     */
    public java.math.BigDecimal getPOITEM_CONV_NUM1() {
        return POITEM_CONV_NUM1;
    }


    /**
     * Sets the POITEM_CONV_NUM1 value for this ThreeWay_Matching_RequestItems.
     * 
     * @param POITEM_CONV_NUM1
     */
    public void setPOITEM_CONV_NUM1(java.math.BigDecimal POITEM_CONV_NUM1) {
        this.POITEM_CONV_NUM1 = POITEM_CONV_NUM1;
    }


    /**
     * Gets the POITEM_CONV_DEN1 value for this ThreeWay_Matching_RequestItems.
     * 
     * @return POITEM_CONV_DEN1
     */
    public java.math.BigDecimal getPOITEM_CONV_DEN1() {
        return POITEM_CONV_DEN1;
    }


    /**
     * Sets the POITEM_CONV_DEN1 value for this ThreeWay_Matching_RequestItems.
     * 
     * @param POITEM_CONV_DEN1
     */
    public void setPOITEM_CONV_DEN1(java.math.BigDecimal POITEM_CONV_DEN1) {
        this.POITEM_CONV_DEN1 = POITEM_CONV_DEN1;
    }


    /**
     * Gets the POITEM_QUANTITY value for this ThreeWay_Matching_RequestItems.
     * 
     * @return POITEM_QUANTITY
     */
    public java.math.BigDecimal getPOITEM_QUANTITY() {
        return POITEM_QUANTITY;
    }


    /**
     * Sets the POITEM_QUANTITY value for this ThreeWay_Matching_RequestItems.
     * 
     * @param POITEM_QUANTITY
     */
    public void setPOITEM_QUANTITY(java.math.BigDecimal POITEM_QUANTITY) {
        this.POITEM_QUANTITY = POITEM_QUANTITY;
    }


    /**
     * Gets the posting_Date value for this ThreeWay_Matching_RequestItems.
     * 
     * @return posting_Date
     */
    public java.lang.String getPosting_Date() {
        return posting_Date;
    }


    /**
     * Sets the posting_Date value for this ThreeWay_Matching_RequestItems.
     * 
     * @param posting_Date
     */
    public void setPosting_Date(java.lang.String posting_Date) {
        this.posting_Date = posting_Date;
    }


    /**
     * Gets the POHEADER_COMP_CODE value for this ThreeWay_Matching_RequestItems.
     * 
     * @return POHEADER_COMP_CODE
     */
    public java.lang.String getPOHEADER_COMP_CODE() {
        return POHEADER_COMP_CODE;
    }


    /**
     * Sets the POHEADER_COMP_CODE value for this ThreeWay_Matching_RequestItems.
     * 
     * @param POHEADER_COMP_CODE
     */
    public void setPOHEADER_COMP_CODE(java.lang.String POHEADER_COMP_CODE) {
        this.POHEADER_COMP_CODE = POHEADER_COMP_CODE;
    }


    /**
     * Gets the INVOICE_QUANTITY value for this ThreeWay_Matching_RequestItems.
     * 
     * @return INVOICE_QUANTITY
     */
    public java.math.BigDecimal getINVOICE_QUANTITY() {
        return INVOICE_QUANTITY;
    }


    /**
     * Sets the INVOICE_QUANTITY value for this ThreeWay_Matching_RequestItems.
     * 
     * @param INVOICE_QUANTITY
     */
    public void setINVOICE_QUANTITY(java.math.BigDecimal INVOICE_QUANTITY) {
        this.INVOICE_QUANTITY = INVOICE_QUANTITY;
    }


    /**
     * Gets the POHISTORY_MAT_DOC value for this ThreeWay_Matching_RequestItems.
     * 
     * @return POHISTORY_MAT_DOC
     */
    public java.lang.String getPOHISTORY_MAT_DOC() {
        return POHISTORY_MAT_DOC;
    }


    /**
     * Sets the POHISTORY_MAT_DOC value for this ThreeWay_Matching_RequestItems.
     * 
     * @param POHISTORY_MAT_DOC
     */
    public void setPOHISTORY_MAT_DOC(java.lang.String POHISTORY_MAT_DOC) {
        this.POHISTORY_MAT_DOC = POHISTORY_MAT_DOC;
    }


    /**
     * Gets the NET_WORTH value for this ThreeWay_Matching_RequestItems.
     * 
     * @return NET_WORTH
     */
    public java.math.BigDecimal getNET_WORTH() {
        return NET_WORTH;
    }


    /**
     * Sets the NET_WORTH value for this ThreeWay_Matching_RequestItems.
     * 
     * @param NET_WORTH
     */
    public void setNET_WORTH(java.math.BigDecimal NET_WORTH) {
        this.NET_WORTH = NET_WORTH;
    }


    /**
     * Gets the POITEM_ITEM_CAT value for this ThreeWay_Matching_RequestItems.
     * 
     * @return POITEM_ITEM_CAT
     */
    public java.lang.String getPOITEM_ITEM_CAT() {
        return POITEM_ITEM_CAT;
    }


    /**
     * Sets the POITEM_ITEM_CAT value for this ThreeWay_Matching_RequestItems.
     * 
     * @param POITEM_ITEM_CAT
     */
    public void setPOITEM_ITEM_CAT(java.lang.String POITEM_ITEM_CAT) {
        this.POITEM_ITEM_CAT = POITEM_ITEM_CAT;
    }


    /**
     * Gets the POHISTORY_TOTALS_IV_QTY value for this ThreeWay_Matching_RequestItems.
     * 
     * @return POHISTORY_TOTALS_IV_QTY
     */
    public java.math.BigDecimal getPOHISTORY_TOTALS_IV_QTY() {
        return POHISTORY_TOTALS_IV_QTY;
    }


    /**
     * Sets the POHISTORY_TOTALS_IV_QTY value for this ThreeWay_Matching_RequestItems.
     * 
     * @param POHISTORY_TOTALS_IV_QTY
     */
    public void setPOHISTORY_TOTALS_IV_QTY(java.math.BigDecimal POHISTORY_TOTALS_IV_QTY) {
        this.POHISTORY_TOTALS_IV_QTY = POHISTORY_TOTALS_IV_QTY;
    }


    /**
     * Gets the DR_CR_INDICATOR value for this ThreeWay_Matching_RequestItems.
     * 
     * @return DR_CR_INDICATOR
     */
    public java.lang.String getDR_CR_INDICATOR() {
        return DR_CR_INDICATOR;
    }


    /**
     * Sets the DR_CR_INDICATOR value for this ThreeWay_Matching_RequestItems.
     * 
     * @param DR_CR_INDICATOR
     */
    public void setDR_CR_INDICATOR(java.lang.String DR_CR_INDICATOR) {
        this.DR_CR_INDICATOR = DR_CR_INDICATOR;
    }


    /**
     * Gets the POHEADER_CURRENCY value for this ThreeWay_Matching_RequestItems.
     * 
     * @return POHEADER_CURRENCY
     */
    public java.lang.String getPOHEADER_CURRENCY() {
        return POHEADER_CURRENCY;
    }


    /**
     * Sets the POHEADER_CURRENCY value for this ThreeWay_Matching_RequestItems.
     * 
     * @param POHEADER_CURRENCY
     */
    public void setPOHEADER_CURRENCY(java.lang.String POHEADER_CURRENCY) {
        this.POHEADER_CURRENCY = POHEADER_CURRENCY;
    }


    /**
     * Gets the POHISTORY_TOTALS_DELIV_QTY value for this ThreeWay_Matching_RequestItems.
     * 
     * @return POHISTORY_TOTALS_DELIV_QTY
     */
    public java.math.BigDecimal getPOHISTORY_TOTALS_DELIV_QTY() {
        return POHISTORY_TOTALS_DELIV_QTY;
    }


    /**
     * Sets the POHISTORY_TOTALS_DELIV_QTY value for this ThreeWay_Matching_RequestItems.
     * 
     * @param POHISTORY_TOTALS_DELIV_QTY
     */
    public void setPOHISTORY_TOTALS_DELIV_QTY(java.math.BigDecimal POHISTORY_TOTALS_DELIV_QTY) {
        this.POHISTORY_TOTALS_DELIV_QTY = POHISTORY_TOTALS_DELIV_QTY;
    }


    /**
     * Gets the GOODS_REC_INDICATOR value for this ThreeWay_Matching_RequestItems.
     * 
     * @return GOODS_REC_INDICATOR
     */
    public java.lang.String getGOODS_REC_INDICATOR() {
        return GOODS_REC_INDICATOR;
    }


    /**
     * Sets the GOODS_REC_INDICATOR value for this ThreeWay_Matching_RequestItems.
     * 
     * @param GOODS_REC_INDICATOR
     */
    public void setGOODS_REC_INDICATOR(java.lang.String GOODS_REC_INDICATOR) {
        this.GOODS_REC_INDICATOR = GOODS_REC_INDICATOR;
    }


    /**
     * Gets the POHISTORY_TOTALS_PO_PR_QNT value for this ThreeWay_Matching_RequestItems.
     * 
     * @return POHISTORY_TOTALS_PO_PR_QNT
     */
    public java.math.BigDecimal getPOHISTORY_TOTALS_PO_PR_QNT() {
        return POHISTORY_TOTALS_PO_PR_QNT;
    }


    /**
     * Sets the POHISTORY_TOTALS_PO_PR_QNT value for this ThreeWay_Matching_RequestItems.
     * 
     * @param POHISTORY_TOTALS_PO_PR_QNT
     */
    public void setPOHISTORY_TOTALS_PO_PR_QNT(java.math.BigDecimal POHISTORY_TOTALS_PO_PR_QNT) {
        this.POHISTORY_TOTALS_PO_PR_QNT = POHISTORY_TOTALS_PO_PR_QNT;
    }


    /**
     * Gets the POHISTORY_TOTALS_VAL_IV_FOR value for this ThreeWay_Matching_RequestItems.
     * 
     * @return POHISTORY_TOTALS_VAL_IV_FOR
     */
    public java.math.BigDecimal getPOHISTORY_TOTALS_VAL_IV_FOR() {
        return POHISTORY_TOTALS_VAL_IV_FOR;
    }


    /**
     * Sets the POHISTORY_TOTALS_VAL_IV_FOR value for this ThreeWay_Matching_RequestItems.
     * 
     * @param POHISTORY_TOTALS_VAL_IV_FOR
     */
    public void setPOHISTORY_TOTALS_VAL_IV_FOR(java.math.BigDecimal POHISTORY_TOTALS_VAL_IV_FOR) {
        this.POHISTORY_TOTALS_VAL_IV_FOR = POHISTORY_TOTALS_VAL_IV_FOR;
    }


    /**
     * Gets the DOC_AMOUNT_CURRENCY value for this ThreeWay_Matching_RequestItems.
     * 
     * @return DOC_AMOUNT_CURRENCY
     */
    public java.math.BigDecimal getDOC_AMOUNT_CURRENCY() {
        return DOC_AMOUNT_CURRENCY;
    }


    /**
     * Sets the DOC_AMOUNT_CURRENCY value for this ThreeWay_Matching_RequestItems.
     * 
     * @param DOC_AMOUNT_CURRENCY
     */
    public void setDOC_AMOUNT_CURRENCY(java.math.BigDecimal DOC_AMOUNT_CURRENCY) {
        this.DOC_AMOUNT_CURRENCY = DOC_AMOUNT_CURRENCY;
    }


    /**
     * Gets the PO_NUMBER value for this ThreeWay_Matching_RequestItems.
     * 
     * @return PO_NUMBER
     */
    public java.lang.String getPO_NUMBER() {
        return PO_NUMBER;
    }


    /**
     * Sets the PO_NUMBER value for this ThreeWay_Matching_RequestItems.
     * 
     * @param PO_NUMBER
     */
    public void setPO_NUMBER(java.lang.String PO_NUMBER) {
        this.PO_NUMBER = PO_NUMBER;
    }


    /**
     * Gets the PO_ITEM_ID value for this ThreeWay_Matching_RequestItems.
     * 
     * @return PO_ITEM_ID
     */
    public java.lang.String getPO_ITEM_ID() {
        return PO_ITEM_ID;
    }


    /**
     * Sets the PO_ITEM_ID value for this ThreeWay_Matching_RequestItems.
     * 
     * @param PO_ITEM_ID
     */
    public void setPO_ITEM_ID(java.lang.String PO_ITEM_ID) {
        this.PO_ITEM_ID = PO_ITEM_ID;
    }


    /**
     * Gets the POHISTORY_TOTALS_VAL_GR_FOR value for this ThreeWay_Matching_RequestItems.
     * 
     * @return POHISTORY_TOTALS_VAL_GR_FOR
     */
    public java.math.BigDecimal getPOHISTORY_TOTALS_VAL_GR_FOR() {
        return POHISTORY_TOTALS_VAL_GR_FOR;
    }


    /**
     * Sets the POHISTORY_TOTALS_VAL_GR_FOR value for this ThreeWay_Matching_RequestItems.
     * 
     * @param POHISTORY_TOTALS_VAL_GR_FOR
     */
    public void setPOHISTORY_TOTALS_VAL_GR_FOR(java.math.BigDecimal POHISTORY_TOTALS_VAL_GR_FOR) {
        this.POHISTORY_TOTALS_VAL_GR_FOR = POHISTORY_TOTALS_VAL_GR_FOR;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ThreeWay_Matching_RequestItems)) return false;
        ThreeWay_Matching_RequestItems other = (ThreeWay_Matching_RequestItems) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.POITEM_CONV_NUM1==null && other.getPOITEM_CONV_NUM1()==null) || 
             (this.POITEM_CONV_NUM1!=null &&
              this.POITEM_CONV_NUM1.equals(other.getPOITEM_CONV_NUM1()))) &&
            ((this.POITEM_CONV_DEN1==null && other.getPOITEM_CONV_DEN1()==null) || 
             (this.POITEM_CONV_DEN1!=null &&
              this.POITEM_CONV_DEN1.equals(other.getPOITEM_CONV_DEN1()))) &&
            ((this.POITEM_QUANTITY==null && other.getPOITEM_QUANTITY()==null) || 
             (this.POITEM_QUANTITY!=null &&
              this.POITEM_QUANTITY.equals(other.getPOITEM_QUANTITY()))) &&
            ((this.posting_Date==null && other.getPosting_Date()==null) || 
             (this.posting_Date!=null &&
              this.posting_Date.equals(other.getPosting_Date()))) &&
            ((this.POHEADER_COMP_CODE==null && other.getPOHEADER_COMP_CODE()==null) || 
             (this.POHEADER_COMP_CODE!=null &&
              this.POHEADER_COMP_CODE.equals(other.getPOHEADER_COMP_CODE()))) &&
            ((this.INVOICE_QUANTITY==null && other.getINVOICE_QUANTITY()==null) || 
             (this.INVOICE_QUANTITY!=null &&
              this.INVOICE_QUANTITY.equals(other.getINVOICE_QUANTITY()))) &&
            ((this.POHISTORY_MAT_DOC==null && other.getPOHISTORY_MAT_DOC()==null) || 
             (this.POHISTORY_MAT_DOC!=null &&
              this.POHISTORY_MAT_DOC.equals(other.getPOHISTORY_MAT_DOC()))) &&
            ((this.NET_WORTH==null && other.getNET_WORTH()==null) || 
             (this.NET_WORTH!=null &&
              this.NET_WORTH.equals(other.getNET_WORTH()))) &&
            ((this.POITEM_ITEM_CAT==null && other.getPOITEM_ITEM_CAT()==null) || 
             (this.POITEM_ITEM_CAT!=null &&
              this.POITEM_ITEM_CAT.equals(other.getPOITEM_ITEM_CAT()))) &&
            ((this.POHISTORY_TOTALS_IV_QTY==null && other.getPOHISTORY_TOTALS_IV_QTY()==null) || 
             (this.POHISTORY_TOTALS_IV_QTY!=null &&
              this.POHISTORY_TOTALS_IV_QTY.equals(other.getPOHISTORY_TOTALS_IV_QTY()))) &&
            ((this.DR_CR_INDICATOR==null && other.getDR_CR_INDICATOR()==null) || 
             (this.DR_CR_INDICATOR!=null &&
              this.DR_CR_INDICATOR.equals(other.getDR_CR_INDICATOR()))) &&
            ((this.POHEADER_CURRENCY==null && other.getPOHEADER_CURRENCY()==null) || 
             (this.POHEADER_CURRENCY!=null &&
              this.POHEADER_CURRENCY.equals(other.getPOHEADER_CURRENCY()))) &&
            ((this.POHISTORY_TOTALS_DELIV_QTY==null && other.getPOHISTORY_TOTALS_DELIV_QTY()==null) || 
             (this.POHISTORY_TOTALS_DELIV_QTY!=null &&
              this.POHISTORY_TOTALS_DELIV_QTY.equals(other.getPOHISTORY_TOTALS_DELIV_QTY()))) &&
            ((this.GOODS_REC_INDICATOR==null && other.getGOODS_REC_INDICATOR()==null) || 
             (this.GOODS_REC_INDICATOR!=null &&
              this.GOODS_REC_INDICATOR.equals(other.getGOODS_REC_INDICATOR()))) &&
            ((this.POHISTORY_TOTALS_PO_PR_QNT==null && other.getPOHISTORY_TOTALS_PO_PR_QNT()==null) || 
             (this.POHISTORY_TOTALS_PO_PR_QNT!=null &&
              this.POHISTORY_TOTALS_PO_PR_QNT.equals(other.getPOHISTORY_TOTALS_PO_PR_QNT()))) &&
            ((this.POHISTORY_TOTALS_VAL_IV_FOR==null && other.getPOHISTORY_TOTALS_VAL_IV_FOR()==null) || 
             (this.POHISTORY_TOTALS_VAL_IV_FOR!=null &&
              this.POHISTORY_TOTALS_VAL_IV_FOR.equals(other.getPOHISTORY_TOTALS_VAL_IV_FOR()))) &&
            ((this.DOC_AMOUNT_CURRENCY==null && other.getDOC_AMOUNT_CURRENCY()==null) || 
             (this.DOC_AMOUNT_CURRENCY!=null &&
              this.DOC_AMOUNT_CURRENCY.equals(other.getDOC_AMOUNT_CURRENCY()))) &&
            ((this.PO_NUMBER==null && other.getPO_NUMBER()==null) || 
             (this.PO_NUMBER!=null &&
              this.PO_NUMBER.equals(other.getPO_NUMBER()))) &&
            ((this.PO_ITEM_ID==null && other.getPO_ITEM_ID()==null) || 
             (this.PO_ITEM_ID!=null &&
              this.PO_ITEM_ID.equals(other.getPO_ITEM_ID()))) &&
            ((this.POHISTORY_TOTALS_VAL_GR_FOR==null && other.getPOHISTORY_TOTALS_VAL_GR_FOR()==null) || 
             (this.POHISTORY_TOTALS_VAL_GR_FOR!=null &&
              this.POHISTORY_TOTALS_VAL_GR_FOR.equals(other.getPOHISTORY_TOTALS_VAL_GR_FOR())));
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
        if (getPOITEM_CONV_NUM1() != null) {
            _hashCode += getPOITEM_CONV_NUM1().hashCode();
        }
        if (getPOITEM_CONV_DEN1() != null) {
            _hashCode += getPOITEM_CONV_DEN1().hashCode();
        }
        if (getPOITEM_QUANTITY() != null) {
            _hashCode += getPOITEM_QUANTITY().hashCode();
        }
        if (getPosting_Date() != null) {
            _hashCode += getPosting_Date().hashCode();
        }
        if (getPOHEADER_COMP_CODE() != null) {
            _hashCode += getPOHEADER_COMP_CODE().hashCode();
        }
        if (getINVOICE_QUANTITY() != null) {
            _hashCode += getINVOICE_QUANTITY().hashCode();
        }
        if (getPOHISTORY_MAT_DOC() != null) {
            _hashCode += getPOHISTORY_MAT_DOC().hashCode();
        }
        if (getNET_WORTH() != null) {
            _hashCode += getNET_WORTH().hashCode();
        }
        if (getPOITEM_ITEM_CAT() != null) {
            _hashCode += getPOITEM_ITEM_CAT().hashCode();
        }
        if (getPOHISTORY_TOTALS_IV_QTY() != null) {
            _hashCode += getPOHISTORY_TOTALS_IV_QTY().hashCode();
        }
        if (getDR_CR_INDICATOR() != null) {
            _hashCode += getDR_CR_INDICATOR().hashCode();
        }
        if (getPOHEADER_CURRENCY() != null) {
            _hashCode += getPOHEADER_CURRENCY().hashCode();
        }
        if (getPOHISTORY_TOTALS_DELIV_QTY() != null) {
            _hashCode += getPOHISTORY_TOTALS_DELIV_QTY().hashCode();
        }
        if (getGOODS_REC_INDICATOR() != null) {
            _hashCode += getGOODS_REC_INDICATOR().hashCode();
        }
        if (getPOHISTORY_TOTALS_PO_PR_QNT() != null) {
            _hashCode += getPOHISTORY_TOTALS_PO_PR_QNT().hashCode();
        }
        if (getPOHISTORY_TOTALS_VAL_IV_FOR() != null) {
            _hashCode += getPOHISTORY_TOTALS_VAL_IV_FOR().hashCode();
        }
        if (getDOC_AMOUNT_CURRENCY() != null) {
            _hashCode += getDOC_AMOUNT_CURRENCY().hashCode();
        }
        if (getPO_NUMBER() != null) {
            _hashCode += getPO_NUMBER().hashCode();
        }
        if (getPO_ITEM_ID() != null) {
            _hashCode += getPO_ITEM_ID().hashCode();
        }
        if (getPOHISTORY_TOTALS_VAL_GR_FOR() != null) {
            _hashCode += getPOHISTORY_TOTALS_VAL_GR_FOR().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThreeWay_Matching_RequestItems.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:CW:AccountsPayable", ">ThreeWay_Matching_Request>Items"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POITEM_CONV_NUM1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "POITEM_CONV_NUM1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POITEM_CONV_DEN1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "POITEM_CONV_DEN1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POITEM_QUANTITY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "POITEM_QUANTITY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posting_Date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Posting_Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POHEADER_COMP_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "POHEADER_COMP_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INVOICE_QUANTITY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "INVOICE_QUANTITY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POHISTORY_MAT_DOC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "POHISTORY_MAT_DOC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NET_WORTH");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NET_WORTH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POITEM_ITEM_CAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "POITEM_ITEM_CAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POHISTORY_TOTALS_IV_QTY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "POHISTORY_TOTALS_IV_QTY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DR_CR_INDICATOR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DR_CR_INDICATOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POHEADER_CURRENCY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "POHEADER_CURRENCY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POHISTORY_TOTALS_DELIV_QTY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "POHISTORY_TOTALS_DELIV_QTY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GOODS_REC_INDICATOR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GOODS_REC_INDICATOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POHISTORY_TOTALS_PO_PR_QNT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "POHISTORY_TOTALS_PO_PR_QNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POHISTORY_TOTALS_VAL_IV_FOR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "POHISTORY_TOTALS_VAL_IV_FOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOC_AMOUNT_CURRENCY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DOC_AMOUNT_CURRENCY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PO_NUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PO_NUMBER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PO_ITEM_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PO_ITEM_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POHISTORY_TOTALS_VAL_GR_FOR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "POHISTORY_TOTALS_VAL_GR_FOR"));
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
