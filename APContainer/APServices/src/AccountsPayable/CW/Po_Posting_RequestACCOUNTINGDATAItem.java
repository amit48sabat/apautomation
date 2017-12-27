/**
 * Po_Posting_RequestACCOUNTINGDATAItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package AccountsPayable.CW;

public class Po_Posting_RequestACCOUNTINGDATAItem  implements java.io.Serializable {
    private java.lang.String INVOICE_DOC_ITEM;

    private java.lang.String XUNPL;

    private java.lang.String SERIAL_NO;

    private java.lang.String TAX_CODE;

    private java.lang.String TAXJURCODE;

    private java.math.BigDecimal ITEM_AMOUNT;

    private java.math.BigDecimal QUANTITY;

    private java.lang.String PO_UNIT;

    private java.lang.String PO_UNIT_ISO;

    private java.lang.Double PO_PR_QNT;

    private java.lang.String PO_PR_UOM;

    private java.lang.String PO_PR_UOM_ISO;

    private java.lang.String GL_ACCOUNT;

    private java.lang.String COSTCENTER;

    private java.lang.String SD_DOC;

    private java.lang.String SDOC_ITEM;

    private java.lang.String ASSET_NO;

    private java.lang.String SUB_NUMBER;

    private java.lang.String ORDERID;

    private java.util.Date REF_DATE;

    private java.lang.String CMMT_ITEM;

    private java.lang.String FUNDS_CTR;

    private java.lang.String FUNC_AREA;

    private java.lang.String FUND;

    private java.lang.String BUS_AREA;

    private java.lang.String RL_EST_KEY;

    private java.lang.String CO_AREA;

    private java.lang.String COSTOBJECT;

    private java.lang.String NETWORK;

    private java.lang.String ACTIVITY;

    private java.lang.String PROFIT_SEGM_NO;

    private java.lang.String PROFIT_CTR;

    private java.lang.String WBS_ELEM;

    private java.lang.String GRANT_NBR;

    private java.lang.String CMMT_ITEM_LONG;

    private java.lang.String FUNC_AREA_LONG;

    private java.lang.String BUDGET_PERIOD;

    private java.util.Date DEL_CREATE_DATE;

    public Po_Posting_RequestACCOUNTINGDATAItem() {
    }

    public Po_Posting_RequestACCOUNTINGDATAItem(
           java.lang.String INVOICE_DOC_ITEM,
           java.lang.String XUNPL,
           java.lang.String SERIAL_NO,
           java.lang.String TAX_CODE,
           java.lang.String TAXJURCODE,
           java.math.BigDecimal ITEM_AMOUNT,
           java.math.BigDecimal QUANTITY,
           java.lang.String PO_UNIT,
           java.lang.String PO_UNIT_ISO,
           java.lang.Double PO_PR_QNT,
           java.lang.String PO_PR_UOM,
           java.lang.String PO_PR_UOM_ISO,
           java.lang.String GL_ACCOUNT,
           java.lang.String COSTCENTER,
           java.lang.String SD_DOC,
           java.lang.String SDOC_ITEM,
           java.lang.String ASSET_NO,
           java.lang.String SUB_NUMBER,
           java.lang.String ORDERID,
           java.util.Date REF_DATE,
           java.lang.String CMMT_ITEM,
           java.lang.String FUNDS_CTR,
           java.lang.String FUNC_AREA,
           java.lang.String FUND,
           java.lang.String BUS_AREA,
           java.lang.String RL_EST_KEY,
           java.lang.String CO_AREA,
           java.lang.String COSTOBJECT,
           java.lang.String NETWORK,
           java.lang.String ACTIVITY,
           java.lang.String PROFIT_SEGM_NO,
           java.lang.String PROFIT_CTR,
           java.lang.String WBS_ELEM,
           java.lang.String GRANT_NBR,
           java.lang.String CMMT_ITEM_LONG,
           java.lang.String FUNC_AREA_LONG,
           java.lang.String BUDGET_PERIOD,
           java.util.Date DEL_CREATE_DATE) {
           this.INVOICE_DOC_ITEM = INVOICE_DOC_ITEM;
           this.XUNPL = XUNPL;
           this.SERIAL_NO = SERIAL_NO;
           this.TAX_CODE = TAX_CODE;
           this.TAXJURCODE = TAXJURCODE;
           this.ITEM_AMOUNT = ITEM_AMOUNT;
           this.QUANTITY = QUANTITY;
           this.PO_UNIT = PO_UNIT;
           this.PO_UNIT_ISO = PO_UNIT_ISO;
           this.PO_PR_QNT = PO_PR_QNT;
           this.PO_PR_UOM = PO_PR_UOM;
           this.PO_PR_UOM_ISO = PO_PR_UOM_ISO;
           this.GL_ACCOUNT = GL_ACCOUNT;
           this.COSTCENTER = COSTCENTER;
           this.SD_DOC = SD_DOC;
           this.SDOC_ITEM = SDOC_ITEM;
           this.ASSET_NO = ASSET_NO;
           this.SUB_NUMBER = SUB_NUMBER;
           this.ORDERID = ORDERID;
           this.REF_DATE = REF_DATE;
           this.CMMT_ITEM = CMMT_ITEM;
           this.FUNDS_CTR = FUNDS_CTR;
           this.FUNC_AREA = FUNC_AREA;
           this.FUND = FUND;
           this.BUS_AREA = BUS_AREA;
           this.RL_EST_KEY = RL_EST_KEY;
           this.CO_AREA = CO_AREA;
           this.COSTOBJECT = COSTOBJECT;
           this.NETWORK = NETWORK;
           this.ACTIVITY = ACTIVITY;
           this.PROFIT_SEGM_NO = PROFIT_SEGM_NO;
           this.PROFIT_CTR = PROFIT_CTR;
           this.WBS_ELEM = WBS_ELEM;
           this.GRANT_NBR = GRANT_NBR;
           this.CMMT_ITEM_LONG = CMMT_ITEM_LONG;
           this.FUNC_AREA_LONG = FUNC_AREA_LONG;
           this.BUDGET_PERIOD = BUDGET_PERIOD;
           this.DEL_CREATE_DATE = DEL_CREATE_DATE;
    }


    /**
     * Gets the INVOICE_DOC_ITEM value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return INVOICE_DOC_ITEM
     */
    public java.lang.String getINVOICE_DOC_ITEM() {
        return INVOICE_DOC_ITEM;
    }


    /**
     * Sets the INVOICE_DOC_ITEM value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param INVOICE_DOC_ITEM
     */
    public void setINVOICE_DOC_ITEM(java.lang.String INVOICE_DOC_ITEM) {
        this.INVOICE_DOC_ITEM = INVOICE_DOC_ITEM;
    }


    /**
     * Gets the XUNPL value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return XUNPL
     */
    public java.lang.String getXUNPL() {
        return XUNPL;
    }


    /**
     * Sets the XUNPL value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param XUNPL
     */
    public void setXUNPL(java.lang.String XUNPL) {
        this.XUNPL = XUNPL;
    }


    /**
     * Gets the SERIAL_NO value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return SERIAL_NO
     */
    public java.lang.String getSERIAL_NO() {
        return SERIAL_NO;
    }


    /**
     * Sets the SERIAL_NO value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param SERIAL_NO
     */
    public void setSERIAL_NO(java.lang.String SERIAL_NO) {
        this.SERIAL_NO = SERIAL_NO;
    }


    /**
     * Gets the TAX_CODE value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return TAX_CODE
     */
    public java.lang.String getTAX_CODE() {
        return TAX_CODE;
    }


    /**
     * Sets the TAX_CODE value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param TAX_CODE
     */
    public void setTAX_CODE(java.lang.String TAX_CODE) {
        this.TAX_CODE = TAX_CODE;
    }


    /**
     * Gets the TAXJURCODE value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return TAXJURCODE
     */
    public java.lang.String getTAXJURCODE() {
        return TAXJURCODE;
    }


    /**
     * Sets the TAXJURCODE value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param TAXJURCODE
     */
    public void setTAXJURCODE(java.lang.String TAXJURCODE) {
        this.TAXJURCODE = TAXJURCODE;
    }


    /**
     * Gets the ITEM_AMOUNT value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return ITEM_AMOUNT
     */
    public java.math.BigDecimal getITEM_AMOUNT() {
        return ITEM_AMOUNT;
    }


    /**
     * Sets the ITEM_AMOUNT value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param ITEM_AMOUNT
     */
    public void setITEM_AMOUNT(java.math.BigDecimal ITEM_AMOUNT) {
        this.ITEM_AMOUNT = ITEM_AMOUNT;
    }


    /**
     * Gets the QUANTITY value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return QUANTITY
     */
    public java.math.BigDecimal getQUANTITY() {
        return QUANTITY;
    }


    /**
     * Sets the QUANTITY value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param QUANTITY
     */
    public void setQUANTITY(java.math.BigDecimal QUANTITY) {
        this.QUANTITY = QUANTITY;
    }


    /**
     * Gets the PO_UNIT value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return PO_UNIT
     */
    public java.lang.String getPO_UNIT() {
        return PO_UNIT;
    }


    /**
     * Sets the PO_UNIT value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param PO_UNIT
     */
    public void setPO_UNIT(java.lang.String PO_UNIT) {
        this.PO_UNIT = PO_UNIT;
    }


    /**
     * Gets the PO_UNIT_ISO value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return PO_UNIT_ISO
     */
    public java.lang.String getPO_UNIT_ISO() {
        return PO_UNIT_ISO;
    }


    /**
     * Sets the PO_UNIT_ISO value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param PO_UNIT_ISO
     */
    public void setPO_UNIT_ISO(java.lang.String PO_UNIT_ISO) {
        this.PO_UNIT_ISO = PO_UNIT_ISO;
    }


    /**
     * Gets the PO_PR_QNT value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return PO_PR_QNT
     */
    public java.lang.Double getPO_PR_QNT() {
        return PO_PR_QNT;
    }


    /**
     * Sets the PO_PR_QNT value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param PO_PR_QNT
     */
    public void setPO_PR_QNT(java.lang.Double PO_PR_QNT) {
        this.PO_PR_QNT = PO_PR_QNT;
    }


    /**
     * Gets the PO_PR_UOM value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return PO_PR_UOM
     */
    public java.lang.String getPO_PR_UOM() {
        return PO_PR_UOM;
    }


    /**
     * Sets the PO_PR_UOM value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param PO_PR_UOM
     */
    public void setPO_PR_UOM(java.lang.String PO_PR_UOM) {
        this.PO_PR_UOM = PO_PR_UOM;
    }


    /**
     * Gets the PO_PR_UOM_ISO value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return PO_PR_UOM_ISO
     */
    public java.lang.String getPO_PR_UOM_ISO() {
        return PO_PR_UOM_ISO;
    }


    /**
     * Sets the PO_PR_UOM_ISO value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param PO_PR_UOM_ISO
     */
    public void setPO_PR_UOM_ISO(java.lang.String PO_PR_UOM_ISO) {
        this.PO_PR_UOM_ISO = PO_PR_UOM_ISO;
    }


    /**
     * Gets the GL_ACCOUNT value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return GL_ACCOUNT
     */
    public java.lang.String getGL_ACCOUNT() {
        return GL_ACCOUNT;
    }


    /**
     * Sets the GL_ACCOUNT value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param GL_ACCOUNT
     */
    public void setGL_ACCOUNT(java.lang.String GL_ACCOUNT) {
        this.GL_ACCOUNT = GL_ACCOUNT;
    }


    /**
     * Gets the COSTCENTER value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return COSTCENTER
     */
    public java.lang.String getCOSTCENTER() {
        return COSTCENTER;
    }


    /**
     * Sets the COSTCENTER value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param COSTCENTER
     */
    public void setCOSTCENTER(java.lang.String COSTCENTER) {
        this.COSTCENTER = COSTCENTER;
    }


    /**
     * Gets the SD_DOC value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return SD_DOC
     */
    public java.lang.String getSD_DOC() {
        return SD_DOC;
    }


    /**
     * Sets the SD_DOC value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param SD_DOC
     */
    public void setSD_DOC(java.lang.String SD_DOC) {
        this.SD_DOC = SD_DOC;
    }


    /**
     * Gets the SDOC_ITEM value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return SDOC_ITEM
     */
    public java.lang.String getSDOC_ITEM() {
        return SDOC_ITEM;
    }


    /**
     * Sets the SDOC_ITEM value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param SDOC_ITEM
     */
    public void setSDOC_ITEM(java.lang.String SDOC_ITEM) {
        this.SDOC_ITEM = SDOC_ITEM;
    }


    /**
     * Gets the ASSET_NO value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return ASSET_NO
     */
    public java.lang.String getASSET_NO() {
        return ASSET_NO;
    }


    /**
     * Sets the ASSET_NO value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param ASSET_NO
     */
    public void setASSET_NO(java.lang.String ASSET_NO) {
        this.ASSET_NO = ASSET_NO;
    }


    /**
     * Gets the SUB_NUMBER value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return SUB_NUMBER
     */
    public java.lang.String getSUB_NUMBER() {
        return SUB_NUMBER;
    }


    /**
     * Sets the SUB_NUMBER value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param SUB_NUMBER
     */
    public void setSUB_NUMBER(java.lang.String SUB_NUMBER) {
        this.SUB_NUMBER = SUB_NUMBER;
    }


    /**
     * Gets the ORDERID value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return ORDERID
     */
    public java.lang.String getORDERID() {
        return ORDERID;
    }


    /**
     * Sets the ORDERID value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param ORDERID
     */
    public void setORDERID(java.lang.String ORDERID) {
        this.ORDERID = ORDERID;
    }


    /**
     * Gets the REF_DATE value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return REF_DATE
     */
    public java.util.Date getREF_DATE() {
        return REF_DATE;
    }


    /**
     * Sets the REF_DATE value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param REF_DATE
     */
    public void setREF_DATE(java.util.Date REF_DATE) {
        this.REF_DATE = REF_DATE;
    }


    /**
     * Gets the CMMT_ITEM value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return CMMT_ITEM
     */
    public java.lang.String getCMMT_ITEM() {
        return CMMT_ITEM;
    }


    /**
     * Sets the CMMT_ITEM value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param CMMT_ITEM
     */
    public void setCMMT_ITEM(java.lang.String CMMT_ITEM) {
        this.CMMT_ITEM = CMMT_ITEM;
    }


    /**
     * Gets the FUNDS_CTR value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return FUNDS_CTR
     */
    public java.lang.String getFUNDS_CTR() {
        return FUNDS_CTR;
    }


    /**
     * Sets the FUNDS_CTR value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param FUNDS_CTR
     */
    public void setFUNDS_CTR(java.lang.String FUNDS_CTR) {
        this.FUNDS_CTR = FUNDS_CTR;
    }


    /**
     * Gets the FUNC_AREA value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return FUNC_AREA
     */
    public java.lang.String getFUNC_AREA() {
        return FUNC_AREA;
    }


    /**
     * Sets the FUNC_AREA value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param FUNC_AREA
     */
    public void setFUNC_AREA(java.lang.String FUNC_AREA) {
        this.FUNC_AREA = FUNC_AREA;
    }


    /**
     * Gets the FUND value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return FUND
     */
    public java.lang.String getFUND() {
        return FUND;
    }


    /**
     * Sets the FUND value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param FUND
     */
    public void setFUND(java.lang.String FUND) {
        this.FUND = FUND;
    }


    /**
     * Gets the BUS_AREA value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return BUS_AREA
     */
    public java.lang.String getBUS_AREA() {
        return BUS_AREA;
    }


    /**
     * Sets the BUS_AREA value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param BUS_AREA
     */
    public void setBUS_AREA(java.lang.String BUS_AREA) {
        this.BUS_AREA = BUS_AREA;
    }


    /**
     * Gets the RL_EST_KEY value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return RL_EST_KEY
     */
    public java.lang.String getRL_EST_KEY() {
        return RL_EST_KEY;
    }


    /**
     * Sets the RL_EST_KEY value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param RL_EST_KEY
     */
    public void setRL_EST_KEY(java.lang.String RL_EST_KEY) {
        this.RL_EST_KEY = RL_EST_KEY;
    }


    /**
     * Gets the CO_AREA value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return CO_AREA
     */
    public java.lang.String getCO_AREA() {
        return CO_AREA;
    }


    /**
     * Sets the CO_AREA value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param CO_AREA
     */
    public void setCO_AREA(java.lang.String CO_AREA) {
        this.CO_AREA = CO_AREA;
    }


    /**
     * Gets the COSTOBJECT value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return COSTOBJECT
     */
    public java.lang.String getCOSTOBJECT() {
        return COSTOBJECT;
    }


    /**
     * Sets the COSTOBJECT value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param COSTOBJECT
     */
    public void setCOSTOBJECT(java.lang.String COSTOBJECT) {
        this.COSTOBJECT = COSTOBJECT;
    }


    /**
     * Gets the NETWORK value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return NETWORK
     */
    public java.lang.String getNETWORK() {
        return NETWORK;
    }


    /**
     * Sets the NETWORK value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param NETWORK
     */
    public void setNETWORK(java.lang.String NETWORK) {
        this.NETWORK = NETWORK;
    }


    /**
     * Gets the ACTIVITY value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return ACTIVITY
     */
    public java.lang.String getACTIVITY() {
        return ACTIVITY;
    }


    /**
     * Sets the ACTIVITY value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param ACTIVITY
     */
    public void setACTIVITY(java.lang.String ACTIVITY) {
        this.ACTIVITY = ACTIVITY;
    }


    /**
     * Gets the PROFIT_SEGM_NO value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return PROFIT_SEGM_NO
     */
    public java.lang.String getPROFIT_SEGM_NO() {
        return PROFIT_SEGM_NO;
    }


    /**
     * Sets the PROFIT_SEGM_NO value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param PROFIT_SEGM_NO
     */
    public void setPROFIT_SEGM_NO(java.lang.String PROFIT_SEGM_NO) {
        this.PROFIT_SEGM_NO = PROFIT_SEGM_NO;
    }


    /**
     * Gets the PROFIT_CTR value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return PROFIT_CTR
     */
    public java.lang.String getPROFIT_CTR() {
        return PROFIT_CTR;
    }


    /**
     * Sets the PROFIT_CTR value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param PROFIT_CTR
     */
    public void setPROFIT_CTR(java.lang.String PROFIT_CTR) {
        this.PROFIT_CTR = PROFIT_CTR;
    }


    /**
     * Gets the WBS_ELEM value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return WBS_ELEM
     */
    public java.lang.String getWBS_ELEM() {
        return WBS_ELEM;
    }


    /**
     * Sets the WBS_ELEM value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param WBS_ELEM
     */
    public void setWBS_ELEM(java.lang.String WBS_ELEM) {
        this.WBS_ELEM = WBS_ELEM;
    }


    /**
     * Gets the GRANT_NBR value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return GRANT_NBR
     */
    public java.lang.String getGRANT_NBR() {
        return GRANT_NBR;
    }


    /**
     * Sets the GRANT_NBR value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param GRANT_NBR
     */
    public void setGRANT_NBR(java.lang.String GRANT_NBR) {
        this.GRANT_NBR = GRANT_NBR;
    }


    /**
     * Gets the CMMT_ITEM_LONG value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return CMMT_ITEM_LONG
     */
    public java.lang.String getCMMT_ITEM_LONG() {
        return CMMT_ITEM_LONG;
    }


    /**
     * Sets the CMMT_ITEM_LONG value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param CMMT_ITEM_LONG
     */
    public void setCMMT_ITEM_LONG(java.lang.String CMMT_ITEM_LONG) {
        this.CMMT_ITEM_LONG = CMMT_ITEM_LONG;
    }


    /**
     * Gets the FUNC_AREA_LONG value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return FUNC_AREA_LONG
     */
    public java.lang.String getFUNC_AREA_LONG() {
        return FUNC_AREA_LONG;
    }


    /**
     * Sets the FUNC_AREA_LONG value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param FUNC_AREA_LONG
     */
    public void setFUNC_AREA_LONG(java.lang.String FUNC_AREA_LONG) {
        this.FUNC_AREA_LONG = FUNC_AREA_LONG;
    }


    /**
     * Gets the BUDGET_PERIOD value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return BUDGET_PERIOD
     */
    public java.lang.String getBUDGET_PERIOD() {
        return BUDGET_PERIOD;
    }


    /**
     * Sets the BUDGET_PERIOD value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param BUDGET_PERIOD
     */
    public void setBUDGET_PERIOD(java.lang.String BUDGET_PERIOD) {
        this.BUDGET_PERIOD = BUDGET_PERIOD;
    }


    /**
     * Gets the DEL_CREATE_DATE value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @return DEL_CREATE_DATE
     */
    public java.util.Date getDEL_CREATE_DATE() {
        return DEL_CREATE_DATE;
    }


    /**
     * Sets the DEL_CREATE_DATE value for this Po_Posting_RequestACCOUNTINGDATAItem.
     * 
     * @param DEL_CREATE_DATE
     */
    public void setDEL_CREATE_DATE(java.util.Date DEL_CREATE_DATE) {
        this.DEL_CREATE_DATE = DEL_CREATE_DATE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Po_Posting_RequestACCOUNTINGDATAItem)) return false;
        Po_Posting_RequestACCOUNTINGDATAItem other = (Po_Posting_RequestACCOUNTINGDATAItem) obj;
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
            ((this.XUNPL==null && other.getXUNPL()==null) || 
             (this.XUNPL!=null &&
              this.XUNPL.equals(other.getXUNPL()))) &&
            ((this.SERIAL_NO==null && other.getSERIAL_NO()==null) || 
             (this.SERIAL_NO!=null &&
              this.SERIAL_NO.equals(other.getSERIAL_NO()))) &&
            ((this.TAX_CODE==null && other.getTAX_CODE()==null) || 
             (this.TAX_CODE!=null &&
              this.TAX_CODE.equals(other.getTAX_CODE()))) &&
            ((this.TAXJURCODE==null && other.getTAXJURCODE()==null) || 
             (this.TAXJURCODE!=null &&
              this.TAXJURCODE.equals(other.getTAXJURCODE()))) &&
            ((this.ITEM_AMOUNT==null && other.getITEM_AMOUNT()==null) || 
             (this.ITEM_AMOUNT!=null &&
              this.ITEM_AMOUNT.equals(other.getITEM_AMOUNT()))) &&
            ((this.QUANTITY==null && other.getQUANTITY()==null) || 
             (this.QUANTITY!=null &&
              this.QUANTITY.equals(other.getQUANTITY()))) &&
            ((this.PO_UNIT==null && other.getPO_UNIT()==null) || 
             (this.PO_UNIT!=null &&
              this.PO_UNIT.equals(other.getPO_UNIT()))) &&
            ((this.PO_UNIT_ISO==null && other.getPO_UNIT_ISO()==null) || 
             (this.PO_UNIT_ISO!=null &&
              this.PO_UNIT_ISO.equals(other.getPO_UNIT_ISO()))) &&
            ((this.PO_PR_QNT==null && other.getPO_PR_QNT()==null) || 
             (this.PO_PR_QNT!=null &&
              this.PO_PR_QNT.equals(other.getPO_PR_QNT()))) &&
            ((this.PO_PR_UOM==null && other.getPO_PR_UOM()==null) || 
             (this.PO_PR_UOM!=null &&
              this.PO_PR_UOM.equals(other.getPO_PR_UOM()))) &&
            ((this.PO_PR_UOM_ISO==null && other.getPO_PR_UOM_ISO()==null) || 
             (this.PO_PR_UOM_ISO!=null &&
              this.PO_PR_UOM_ISO.equals(other.getPO_PR_UOM_ISO()))) &&
            ((this.GL_ACCOUNT==null && other.getGL_ACCOUNT()==null) || 
             (this.GL_ACCOUNT!=null &&
              this.GL_ACCOUNT.equals(other.getGL_ACCOUNT()))) &&
            ((this.COSTCENTER==null && other.getCOSTCENTER()==null) || 
             (this.COSTCENTER!=null &&
              this.COSTCENTER.equals(other.getCOSTCENTER()))) &&
            ((this.SD_DOC==null && other.getSD_DOC()==null) || 
             (this.SD_DOC!=null &&
              this.SD_DOC.equals(other.getSD_DOC()))) &&
            ((this.SDOC_ITEM==null && other.getSDOC_ITEM()==null) || 
             (this.SDOC_ITEM!=null &&
              this.SDOC_ITEM.equals(other.getSDOC_ITEM()))) &&
            ((this.ASSET_NO==null && other.getASSET_NO()==null) || 
             (this.ASSET_NO!=null &&
              this.ASSET_NO.equals(other.getASSET_NO()))) &&
            ((this.SUB_NUMBER==null && other.getSUB_NUMBER()==null) || 
             (this.SUB_NUMBER!=null &&
              this.SUB_NUMBER.equals(other.getSUB_NUMBER()))) &&
            ((this.ORDERID==null && other.getORDERID()==null) || 
             (this.ORDERID!=null &&
              this.ORDERID.equals(other.getORDERID()))) &&
            ((this.REF_DATE==null && other.getREF_DATE()==null) || 
             (this.REF_DATE!=null &&
              this.REF_DATE.equals(other.getREF_DATE()))) &&
            ((this.CMMT_ITEM==null && other.getCMMT_ITEM()==null) || 
             (this.CMMT_ITEM!=null &&
              this.CMMT_ITEM.equals(other.getCMMT_ITEM()))) &&
            ((this.FUNDS_CTR==null && other.getFUNDS_CTR()==null) || 
             (this.FUNDS_CTR!=null &&
              this.FUNDS_CTR.equals(other.getFUNDS_CTR()))) &&
            ((this.FUNC_AREA==null && other.getFUNC_AREA()==null) || 
             (this.FUNC_AREA!=null &&
              this.FUNC_AREA.equals(other.getFUNC_AREA()))) &&
            ((this.FUND==null && other.getFUND()==null) || 
             (this.FUND!=null &&
              this.FUND.equals(other.getFUND()))) &&
            ((this.BUS_AREA==null && other.getBUS_AREA()==null) || 
             (this.BUS_AREA!=null &&
              this.BUS_AREA.equals(other.getBUS_AREA()))) &&
            ((this.RL_EST_KEY==null && other.getRL_EST_KEY()==null) || 
             (this.RL_EST_KEY!=null &&
              this.RL_EST_KEY.equals(other.getRL_EST_KEY()))) &&
            ((this.CO_AREA==null && other.getCO_AREA()==null) || 
             (this.CO_AREA!=null &&
              this.CO_AREA.equals(other.getCO_AREA()))) &&
            ((this.COSTOBJECT==null && other.getCOSTOBJECT()==null) || 
             (this.COSTOBJECT!=null &&
              this.COSTOBJECT.equals(other.getCOSTOBJECT()))) &&
            ((this.NETWORK==null && other.getNETWORK()==null) || 
             (this.NETWORK!=null &&
              this.NETWORK.equals(other.getNETWORK()))) &&
            ((this.ACTIVITY==null && other.getACTIVITY()==null) || 
             (this.ACTIVITY!=null &&
              this.ACTIVITY.equals(other.getACTIVITY()))) &&
            ((this.PROFIT_SEGM_NO==null && other.getPROFIT_SEGM_NO()==null) || 
             (this.PROFIT_SEGM_NO!=null &&
              this.PROFIT_SEGM_NO.equals(other.getPROFIT_SEGM_NO()))) &&
            ((this.PROFIT_CTR==null && other.getPROFIT_CTR()==null) || 
             (this.PROFIT_CTR!=null &&
              this.PROFIT_CTR.equals(other.getPROFIT_CTR()))) &&
            ((this.WBS_ELEM==null && other.getWBS_ELEM()==null) || 
             (this.WBS_ELEM!=null &&
              this.WBS_ELEM.equals(other.getWBS_ELEM()))) &&
            ((this.GRANT_NBR==null && other.getGRANT_NBR()==null) || 
             (this.GRANT_NBR!=null &&
              this.GRANT_NBR.equals(other.getGRANT_NBR()))) &&
            ((this.CMMT_ITEM_LONG==null && other.getCMMT_ITEM_LONG()==null) || 
             (this.CMMT_ITEM_LONG!=null &&
              this.CMMT_ITEM_LONG.equals(other.getCMMT_ITEM_LONG()))) &&
            ((this.FUNC_AREA_LONG==null && other.getFUNC_AREA_LONG()==null) || 
             (this.FUNC_AREA_LONG!=null &&
              this.FUNC_AREA_LONG.equals(other.getFUNC_AREA_LONG()))) &&
            ((this.BUDGET_PERIOD==null && other.getBUDGET_PERIOD()==null) || 
             (this.BUDGET_PERIOD!=null &&
              this.BUDGET_PERIOD.equals(other.getBUDGET_PERIOD()))) &&
            ((this.DEL_CREATE_DATE==null && other.getDEL_CREATE_DATE()==null) || 
             (this.DEL_CREATE_DATE!=null &&
              this.DEL_CREATE_DATE.equals(other.getDEL_CREATE_DATE())));
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
        if (getXUNPL() != null) {
            _hashCode += getXUNPL().hashCode();
        }
        if (getSERIAL_NO() != null) {
            _hashCode += getSERIAL_NO().hashCode();
        }
        if (getTAX_CODE() != null) {
            _hashCode += getTAX_CODE().hashCode();
        }
        if (getTAXJURCODE() != null) {
            _hashCode += getTAXJURCODE().hashCode();
        }
        if (getITEM_AMOUNT() != null) {
            _hashCode += getITEM_AMOUNT().hashCode();
        }
        if (getQUANTITY() != null) {
            _hashCode += getQUANTITY().hashCode();
        }
        if (getPO_UNIT() != null) {
            _hashCode += getPO_UNIT().hashCode();
        }
        if (getPO_UNIT_ISO() != null) {
            _hashCode += getPO_UNIT_ISO().hashCode();
        }
        if (getPO_PR_QNT() != null) {
            _hashCode += getPO_PR_QNT().hashCode();
        }
        if (getPO_PR_UOM() != null) {
            _hashCode += getPO_PR_UOM().hashCode();
        }
        if (getPO_PR_UOM_ISO() != null) {
            _hashCode += getPO_PR_UOM_ISO().hashCode();
        }
        if (getGL_ACCOUNT() != null) {
            _hashCode += getGL_ACCOUNT().hashCode();
        }
        if (getCOSTCENTER() != null) {
            _hashCode += getCOSTCENTER().hashCode();
        }
        if (getSD_DOC() != null) {
            _hashCode += getSD_DOC().hashCode();
        }
        if (getSDOC_ITEM() != null) {
            _hashCode += getSDOC_ITEM().hashCode();
        }
        if (getASSET_NO() != null) {
            _hashCode += getASSET_NO().hashCode();
        }
        if (getSUB_NUMBER() != null) {
            _hashCode += getSUB_NUMBER().hashCode();
        }
        if (getORDERID() != null) {
            _hashCode += getORDERID().hashCode();
        }
        if (getREF_DATE() != null) {
            _hashCode += getREF_DATE().hashCode();
        }
        if (getCMMT_ITEM() != null) {
            _hashCode += getCMMT_ITEM().hashCode();
        }
        if (getFUNDS_CTR() != null) {
            _hashCode += getFUNDS_CTR().hashCode();
        }
        if (getFUNC_AREA() != null) {
            _hashCode += getFUNC_AREA().hashCode();
        }
        if (getFUND() != null) {
            _hashCode += getFUND().hashCode();
        }
        if (getBUS_AREA() != null) {
            _hashCode += getBUS_AREA().hashCode();
        }
        if (getRL_EST_KEY() != null) {
            _hashCode += getRL_EST_KEY().hashCode();
        }
        if (getCO_AREA() != null) {
            _hashCode += getCO_AREA().hashCode();
        }
        if (getCOSTOBJECT() != null) {
            _hashCode += getCOSTOBJECT().hashCode();
        }
        if (getNETWORK() != null) {
            _hashCode += getNETWORK().hashCode();
        }
        if (getACTIVITY() != null) {
            _hashCode += getACTIVITY().hashCode();
        }
        if (getPROFIT_SEGM_NO() != null) {
            _hashCode += getPROFIT_SEGM_NO().hashCode();
        }
        if (getPROFIT_CTR() != null) {
            _hashCode += getPROFIT_CTR().hashCode();
        }
        if (getWBS_ELEM() != null) {
            _hashCode += getWBS_ELEM().hashCode();
        }
        if (getGRANT_NBR() != null) {
            _hashCode += getGRANT_NBR().hashCode();
        }
        if (getCMMT_ITEM_LONG() != null) {
            _hashCode += getCMMT_ITEM_LONG().hashCode();
        }
        if (getFUNC_AREA_LONG() != null) {
            _hashCode += getFUNC_AREA_LONG().hashCode();
        }
        if (getBUDGET_PERIOD() != null) {
            _hashCode += getBUDGET_PERIOD().hashCode();
        }
        if (getDEL_CREATE_DATE() != null) {
            _hashCode += getDEL_CREATE_DATE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Po_Posting_RequestACCOUNTINGDATAItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:CW:AccountsPayable", ">>Po_Posting_Request>ACCOUNTINGDATA>item"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INVOICE_DOC_ITEM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "INVOICE_DOC_ITEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XUNPL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "XUNPL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SERIAL_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SERIAL_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("ITEM_AMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ITEM_AMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PO_UNIT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PO_UNIT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PO_UNIT_ISO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PO_UNIT_ISO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PO_PR_QNT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PO_PR_QNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PO_PR_UOM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PO_PR_UOM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PO_PR_UOM_ISO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PO_PR_UOM_ISO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GL_ACCOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GL_ACCOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COSTCENTER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COSTCENTER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SD_DOC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SD_DOC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SDOC_ITEM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SDOC_ITEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ASSET_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ASSET_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SUB_NUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SUB_NUMBER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ORDERID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ORDERID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REF_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "REF_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CMMT_ITEM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CMMT_ITEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FUNDS_CTR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FUNDS_CTR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FUNC_AREA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FUNC_AREA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FUND");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FUND"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BUS_AREA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BUS_AREA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RL_EST_KEY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RL_EST_KEY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CO_AREA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CO_AREA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COSTOBJECT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COSTOBJECT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NETWORK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NETWORK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTIVITY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ACTIVITY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PROFIT_SEGM_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PROFIT_SEGM_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PROFIT_CTR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PROFIT_CTR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WBS_ELEM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WBS_ELEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GRANT_NBR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GRANT_NBR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CMMT_ITEM_LONG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CMMT_ITEM_LONG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FUNC_AREA_LONG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FUNC_AREA_LONG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BUDGET_PERIOD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BUDGET_PERIOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEL_CREATE_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DEL_CREATE_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
