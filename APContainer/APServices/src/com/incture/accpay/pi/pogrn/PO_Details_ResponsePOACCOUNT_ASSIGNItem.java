package com.incture.accpay.pi.pogrn;
/**
 * PO_Details_ResponsePOACCOUNT_ASSIGNItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

public class PO_Details_ResponsePOACCOUNT_ASSIGNItem  implements java.io.Serializable {
    private java.lang.String PO_ITEM;

    private java.lang.String SERIAL_NO;

    private java.lang.String DELETE_IND;

    private java.util.Date CREAT_DATE;

    private java.math.BigDecimal QUANTITY;

    private java.math.BigDecimal DISTR_PERC;

    private java.math.BigDecimal NET_VALUE;

    private java.lang.String GL_ACCOUNT;

    private java.lang.String BUS_AREA;

    private java.lang.String COSTCENTER;

    private java.lang.String SD_DOC;

    private java.lang.String ITM_NUMBER;

    private java.lang.String SCHED_LINE;

    private java.lang.String ASSET_NO;

    private java.lang.String SUB_NUMBER;

    private java.lang.String ORDERID;

    private java.lang.String GR_RCPT;

    private java.lang.String UNLOAD_PT;

    private java.lang.String CO_AREA;

    private java.lang.String COSTOBJECT;

    private java.lang.String PROFIT_CTR;

    private java.lang.String WBS_ELEMENT;

    private java.lang.String NETWORK;

    private java.lang.String RL_EST_KEY;

    private java.lang.String PART_ACCT;

    private java.lang.String CMMT_ITEM;

    private java.lang.String REC_IND;

    private java.lang.String FUNDS_CTR;

    private java.lang.String FUND;

    private java.lang.String FUNC_AREA;

    private java.util.Date REF_DATE;

    private java.lang.String TAX_CODE;

    private java.lang.String TAXJURCODE;

    private java.math.BigDecimal NOND_ITAX;

    private java.lang.String ACTTYPE;

    private java.lang.String CO_BUSPROC;

    private java.lang.String RES_DOC;

    private java.lang.String RES_ITEM;

    private java.lang.String ACTIVITY;

    private java.lang.String GRANT_NBR;

    private java.lang.String CMMT_ITEM_LONG;

    private java.lang.String FUNC_AREA_LONG;

    private java.lang.String BUDGET_PERIOD;

    private java.lang.String FINAL_IND;

    private java.lang.String FINAL_REASON;

    public PO_Details_ResponsePOACCOUNT_ASSIGNItem() {
    }

    public PO_Details_ResponsePOACCOUNT_ASSIGNItem(
           java.lang.String PO_ITEM,
           java.lang.String SERIAL_NO,
           java.lang.String DELETE_IND,
           java.util.Date CREAT_DATE,
           java.math.BigDecimal QUANTITY,
           java.math.BigDecimal DISTR_PERC,
           java.math.BigDecimal NET_VALUE,
           java.lang.String GL_ACCOUNT,
           java.lang.String BUS_AREA,
           java.lang.String COSTCENTER,
           java.lang.String SD_DOC,
           java.lang.String ITM_NUMBER,
           java.lang.String SCHED_LINE,
           java.lang.String ASSET_NO,
           java.lang.String SUB_NUMBER,
           java.lang.String ORDERID,
           java.lang.String GR_RCPT,
           java.lang.String UNLOAD_PT,
           java.lang.String CO_AREA,
           java.lang.String COSTOBJECT,
           java.lang.String PROFIT_CTR,
           java.lang.String WBS_ELEMENT,
           java.lang.String NETWORK,
           java.lang.String RL_EST_KEY,
           java.lang.String PART_ACCT,
           java.lang.String CMMT_ITEM,
           java.lang.String REC_IND,
           java.lang.String FUNDS_CTR,
           java.lang.String FUND,
           java.lang.String FUNC_AREA,
           java.util.Date REF_DATE,
           java.lang.String TAX_CODE,
           java.lang.String TAXJURCODE,
           java.math.BigDecimal NOND_ITAX,
           java.lang.String ACTTYPE,
           java.lang.String CO_BUSPROC,
           java.lang.String RES_DOC,
           java.lang.String RES_ITEM,
           java.lang.String ACTIVITY,
           java.lang.String GRANT_NBR,
           java.lang.String CMMT_ITEM_LONG,
           java.lang.String FUNC_AREA_LONG,
           java.lang.String BUDGET_PERIOD,
           java.lang.String FINAL_IND,
           java.lang.String FINAL_REASON) {
           this.PO_ITEM = PO_ITEM;
           this.SERIAL_NO = SERIAL_NO;
           this.DELETE_IND = DELETE_IND;
           this.CREAT_DATE = CREAT_DATE;
           this.QUANTITY = QUANTITY;
           this.DISTR_PERC = DISTR_PERC;
           this.NET_VALUE = NET_VALUE;
           this.GL_ACCOUNT = GL_ACCOUNT;
           this.BUS_AREA = BUS_AREA;
           this.COSTCENTER = COSTCENTER;
           this.SD_DOC = SD_DOC;
           this.ITM_NUMBER = ITM_NUMBER;
           this.SCHED_LINE = SCHED_LINE;
           this.ASSET_NO = ASSET_NO;
           this.SUB_NUMBER = SUB_NUMBER;
           this.ORDERID = ORDERID;
           this.GR_RCPT = GR_RCPT;
           this.UNLOAD_PT = UNLOAD_PT;
           this.CO_AREA = CO_AREA;
           this.COSTOBJECT = COSTOBJECT;
           this.PROFIT_CTR = PROFIT_CTR;
           this.WBS_ELEMENT = WBS_ELEMENT;
           this.NETWORK = NETWORK;
           this.RL_EST_KEY = RL_EST_KEY;
           this.PART_ACCT = PART_ACCT;
           this.CMMT_ITEM = CMMT_ITEM;
           this.REC_IND = REC_IND;
           this.FUNDS_CTR = FUNDS_CTR;
           this.FUND = FUND;
           this.FUNC_AREA = FUNC_AREA;
           this.REF_DATE = REF_DATE;
           this.TAX_CODE = TAX_CODE;
           this.TAXJURCODE = TAXJURCODE;
           this.NOND_ITAX = NOND_ITAX;
           this.ACTTYPE = ACTTYPE;
           this.CO_BUSPROC = CO_BUSPROC;
           this.RES_DOC = RES_DOC;
           this.RES_ITEM = RES_ITEM;
           this.ACTIVITY = ACTIVITY;
           this.GRANT_NBR = GRANT_NBR;
           this.CMMT_ITEM_LONG = CMMT_ITEM_LONG;
           this.FUNC_AREA_LONG = FUNC_AREA_LONG;
           this.BUDGET_PERIOD = BUDGET_PERIOD;
           this.FINAL_IND = FINAL_IND;
           this.FINAL_REASON = FINAL_REASON;
    }


    /**
     * Gets the PO_ITEM value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return PO_ITEM
     */
    public java.lang.String getPO_ITEM() {
        return PO_ITEM;
    }


    /**
     * Sets the PO_ITEM value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param PO_ITEM
     */
    public void setPO_ITEM(java.lang.String PO_ITEM) {
        this.PO_ITEM = PO_ITEM;
    }


    /**
     * Gets the SERIAL_NO value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return SERIAL_NO
     */
    public java.lang.String getSERIAL_NO() {
        return SERIAL_NO;
    }


    /**
     * Sets the SERIAL_NO value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param SERIAL_NO
     */
    public void setSERIAL_NO(java.lang.String SERIAL_NO) {
        this.SERIAL_NO = SERIAL_NO;
    }


    /**
     * Gets the DELETE_IND value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return DELETE_IND
     */
    public java.lang.String getDELETE_IND() {
        return DELETE_IND;
    }


    /**
     * Sets the DELETE_IND value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param DELETE_IND
     */
    public void setDELETE_IND(java.lang.String DELETE_IND) {
        this.DELETE_IND = DELETE_IND;
    }


    /**
     * Gets the CREAT_DATE value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return CREAT_DATE
     */
    public java.util.Date getCREAT_DATE() {
        return CREAT_DATE;
    }


    /**
     * Sets the CREAT_DATE value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param CREAT_DATE
     */
    public void setCREAT_DATE(java.util.Date CREAT_DATE) {
        this.CREAT_DATE = CREAT_DATE;
    }


    /**
     * Gets the QUANTITY value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return QUANTITY
     */
    public java.math.BigDecimal getQUANTITY() {
        return QUANTITY;
    }


    /**
     * Sets the QUANTITY value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param QUANTITY
     */
    public void setQUANTITY(java.math.BigDecimal QUANTITY) {
        this.QUANTITY = QUANTITY;
    }


    /**
     * Gets the DISTR_PERC value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return DISTR_PERC
     */
    public java.math.BigDecimal getDISTR_PERC() {
        return DISTR_PERC;
    }


    /**
     * Sets the DISTR_PERC value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param DISTR_PERC
     */
    public void setDISTR_PERC(java.math.BigDecimal DISTR_PERC) {
        this.DISTR_PERC = DISTR_PERC;
    }


    /**
     * Gets the NET_VALUE value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return NET_VALUE
     */
    public java.math.BigDecimal getNET_VALUE() {
        return NET_VALUE;
    }


    /**
     * Sets the NET_VALUE value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param NET_VALUE
     */
    public void setNET_VALUE(java.math.BigDecimal NET_VALUE) {
        this.NET_VALUE = NET_VALUE;
    }


    /**
     * Gets the GL_ACCOUNT value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return GL_ACCOUNT
     */
    public java.lang.String getGL_ACCOUNT() {
        return GL_ACCOUNT;
    }


    /**
     * Sets the GL_ACCOUNT value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param GL_ACCOUNT
     */
    public void setGL_ACCOUNT(java.lang.String GL_ACCOUNT) {
        this.GL_ACCOUNT = GL_ACCOUNT;
    }


    /**
     * Gets the BUS_AREA value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return BUS_AREA
     */
    public java.lang.String getBUS_AREA() {
        return BUS_AREA;
    }


    /**
     * Sets the BUS_AREA value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param BUS_AREA
     */
    public void setBUS_AREA(java.lang.String BUS_AREA) {
        this.BUS_AREA = BUS_AREA;
    }


    /**
     * Gets the COSTCENTER value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return COSTCENTER
     */
    public java.lang.String getCOSTCENTER() {
        return COSTCENTER;
    }


    /**
     * Sets the COSTCENTER value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param COSTCENTER
     */
    public void setCOSTCENTER(java.lang.String COSTCENTER) {
        this.COSTCENTER = COSTCENTER;
    }


    /**
     * Gets the SD_DOC value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return SD_DOC
     */
    public java.lang.String getSD_DOC() {
        return SD_DOC;
    }


    /**
     * Sets the SD_DOC value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param SD_DOC
     */
    public void setSD_DOC(java.lang.String SD_DOC) {
        this.SD_DOC = SD_DOC;
    }


    /**
     * Gets the ITM_NUMBER value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return ITM_NUMBER
     */
    public java.lang.String getITM_NUMBER() {
        return ITM_NUMBER;
    }


    /**
     * Sets the ITM_NUMBER value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param ITM_NUMBER
     */
    public void setITM_NUMBER(java.lang.String ITM_NUMBER) {
        this.ITM_NUMBER = ITM_NUMBER;
    }


    /**
     * Gets the SCHED_LINE value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return SCHED_LINE
     */
    public java.lang.String getSCHED_LINE() {
        return SCHED_LINE;
    }


    /**
     * Sets the SCHED_LINE value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param SCHED_LINE
     */
    public void setSCHED_LINE(java.lang.String SCHED_LINE) {
        this.SCHED_LINE = SCHED_LINE;
    }


    /**
     * Gets the ASSET_NO value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return ASSET_NO
     */
    public java.lang.String getASSET_NO() {
        return ASSET_NO;
    }


    /**
     * Sets the ASSET_NO value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param ASSET_NO
     */
    public void setASSET_NO(java.lang.String ASSET_NO) {
        this.ASSET_NO = ASSET_NO;
    }


    /**
     * Gets the SUB_NUMBER value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return SUB_NUMBER
     */
    public java.lang.String getSUB_NUMBER() {
        return SUB_NUMBER;
    }


    /**
     * Sets the SUB_NUMBER value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param SUB_NUMBER
     */
    public void setSUB_NUMBER(java.lang.String SUB_NUMBER) {
        this.SUB_NUMBER = SUB_NUMBER;
    }


    /**
     * Gets the ORDERID value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return ORDERID
     */
    public java.lang.String getORDERID() {
        return ORDERID;
    }


    /**
     * Sets the ORDERID value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param ORDERID
     */
    public void setORDERID(java.lang.String ORDERID) {
        this.ORDERID = ORDERID;
    }


    /**
     * Gets the GR_RCPT value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return GR_RCPT
     */
    public java.lang.String getGR_RCPT() {
        return GR_RCPT;
    }


    /**
     * Sets the GR_RCPT value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param GR_RCPT
     */
    public void setGR_RCPT(java.lang.String GR_RCPT) {
        this.GR_RCPT = GR_RCPT;
    }


    /**
     * Gets the UNLOAD_PT value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return UNLOAD_PT
     */
    public java.lang.String getUNLOAD_PT() {
        return UNLOAD_PT;
    }


    /**
     * Sets the UNLOAD_PT value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param UNLOAD_PT
     */
    public void setUNLOAD_PT(java.lang.String UNLOAD_PT) {
        this.UNLOAD_PT = UNLOAD_PT;
    }


    /**
     * Gets the CO_AREA value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return CO_AREA
     */
    public java.lang.String getCO_AREA() {
        return CO_AREA;
    }


    /**
     * Sets the CO_AREA value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param CO_AREA
     */
    public void setCO_AREA(java.lang.String CO_AREA) {
        this.CO_AREA = CO_AREA;
    }


    /**
     * Gets the COSTOBJECT value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return COSTOBJECT
     */
    public java.lang.String getCOSTOBJECT() {
        return COSTOBJECT;
    }


    /**
     * Sets the COSTOBJECT value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param COSTOBJECT
     */
    public void setCOSTOBJECT(java.lang.String COSTOBJECT) {
        this.COSTOBJECT = COSTOBJECT;
    }


    /**
     * Gets the PROFIT_CTR value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return PROFIT_CTR
     */
    public java.lang.String getPROFIT_CTR() {
        return PROFIT_CTR;
    }


    /**
     * Sets the PROFIT_CTR value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param PROFIT_CTR
     */
    public void setPROFIT_CTR(java.lang.String PROFIT_CTR) {
        this.PROFIT_CTR = PROFIT_CTR;
    }


    /**
     * Gets the WBS_ELEMENT value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return WBS_ELEMENT
     */
    public java.lang.String getWBS_ELEMENT() {
        return WBS_ELEMENT;
    }


    /**
     * Sets the WBS_ELEMENT value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param WBS_ELEMENT
     */
    public void setWBS_ELEMENT(java.lang.String WBS_ELEMENT) {
        this.WBS_ELEMENT = WBS_ELEMENT;
    }


    /**
     * Gets the NETWORK value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return NETWORK
     */
    public java.lang.String getNETWORK() {
        return NETWORK;
    }


    /**
     * Sets the NETWORK value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param NETWORK
     */
    public void setNETWORK(java.lang.String NETWORK) {
        this.NETWORK = NETWORK;
    }


    /**
     * Gets the RL_EST_KEY value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return RL_EST_KEY
     */
    public java.lang.String getRL_EST_KEY() {
        return RL_EST_KEY;
    }


    /**
     * Sets the RL_EST_KEY value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param RL_EST_KEY
     */
    public void setRL_EST_KEY(java.lang.String RL_EST_KEY) {
        this.RL_EST_KEY = RL_EST_KEY;
    }


    /**
     * Gets the PART_ACCT value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return PART_ACCT
     */
    public java.lang.String getPART_ACCT() {
        return PART_ACCT;
    }


    /**
     * Sets the PART_ACCT value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param PART_ACCT
     */
    public void setPART_ACCT(java.lang.String PART_ACCT) {
        this.PART_ACCT = PART_ACCT;
    }


    /**
     * Gets the CMMT_ITEM value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return CMMT_ITEM
     */
    public java.lang.String getCMMT_ITEM() {
        return CMMT_ITEM;
    }


    /**
     * Sets the CMMT_ITEM value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param CMMT_ITEM
     */
    public void setCMMT_ITEM(java.lang.String CMMT_ITEM) {
        this.CMMT_ITEM = CMMT_ITEM;
    }


    /**
     * Gets the REC_IND value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return REC_IND
     */
    public java.lang.String getREC_IND() {
        return REC_IND;
    }


    /**
     * Sets the REC_IND value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param REC_IND
     */
    public void setREC_IND(java.lang.String REC_IND) {
        this.REC_IND = REC_IND;
    }


    /**
     * Gets the FUNDS_CTR value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return FUNDS_CTR
     */
    public java.lang.String getFUNDS_CTR() {
        return FUNDS_CTR;
    }


    /**
     * Sets the FUNDS_CTR value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param FUNDS_CTR
     */
    public void setFUNDS_CTR(java.lang.String FUNDS_CTR) {
        this.FUNDS_CTR = FUNDS_CTR;
    }


    /**
     * Gets the FUND value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return FUND
     */
    public java.lang.String getFUND() {
        return FUND;
    }


    /**
     * Sets the FUND value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param FUND
     */
    public void setFUND(java.lang.String FUND) {
        this.FUND = FUND;
    }


    /**
     * Gets the FUNC_AREA value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return FUNC_AREA
     */
    public java.lang.String getFUNC_AREA() {
        return FUNC_AREA;
    }


    /**
     * Sets the FUNC_AREA value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param FUNC_AREA
     */
    public void setFUNC_AREA(java.lang.String FUNC_AREA) {
        this.FUNC_AREA = FUNC_AREA;
    }


    /**
     * Gets the REF_DATE value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return REF_DATE
     */
    public java.util.Date getREF_DATE() {
        return REF_DATE;
    }


    /**
     * Sets the REF_DATE value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param REF_DATE
     */
    public void setREF_DATE(java.util.Date REF_DATE) {
        this.REF_DATE = REF_DATE;
    }


    /**
     * Gets the TAX_CODE value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return TAX_CODE
     */
    public java.lang.String getTAX_CODE() {
        return TAX_CODE;
    }


    /**
     * Sets the TAX_CODE value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param TAX_CODE
     */
    public void setTAX_CODE(java.lang.String TAX_CODE) {
        this.TAX_CODE = TAX_CODE;
    }


    /**
     * Gets the TAXJURCODE value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return TAXJURCODE
     */
    public java.lang.String getTAXJURCODE() {
        return TAXJURCODE;
    }


    /**
     * Sets the TAXJURCODE value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param TAXJURCODE
     */
    public void setTAXJURCODE(java.lang.String TAXJURCODE) {
        this.TAXJURCODE = TAXJURCODE;
    }


    /**
     * Gets the NOND_ITAX value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return NOND_ITAX
     */
    public java.math.BigDecimal getNOND_ITAX() {
        return NOND_ITAX;
    }


    /**
     * Sets the NOND_ITAX value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param NOND_ITAX
     */
    public void setNOND_ITAX(java.math.BigDecimal NOND_ITAX) {
        this.NOND_ITAX = NOND_ITAX;
    }


    /**
     * Gets the ACTTYPE value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return ACTTYPE
     */
    public java.lang.String getACTTYPE() {
        return ACTTYPE;
    }


    /**
     * Sets the ACTTYPE value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param ACTTYPE
     */
    public void setACTTYPE(java.lang.String ACTTYPE) {
        this.ACTTYPE = ACTTYPE;
    }


    /**
     * Gets the CO_BUSPROC value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return CO_BUSPROC
     */
    public java.lang.String getCO_BUSPROC() {
        return CO_BUSPROC;
    }


    /**
     * Sets the CO_BUSPROC value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param CO_BUSPROC
     */
    public void setCO_BUSPROC(java.lang.String CO_BUSPROC) {
        this.CO_BUSPROC = CO_BUSPROC;
    }


    /**
     * Gets the RES_DOC value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return RES_DOC
     */
    public java.lang.String getRES_DOC() {
        return RES_DOC;
    }


    /**
     * Sets the RES_DOC value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param RES_DOC
     */
    public void setRES_DOC(java.lang.String RES_DOC) {
        this.RES_DOC = RES_DOC;
    }


    /**
     * Gets the RES_ITEM value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return RES_ITEM
     */
    public java.lang.String getRES_ITEM() {
        return RES_ITEM;
    }


    /**
     * Sets the RES_ITEM value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param RES_ITEM
     */
    public void setRES_ITEM(java.lang.String RES_ITEM) {
        this.RES_ITEM = RES_ITEM;
    }


    /**
     * Gets the ACTIVITY value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return ACTIVITY
     */
    public java.lang.String getACTIVITY() {
        return ACTIVITY;
    }


    /**
     * Sets the ACTIVITY value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param ACTIVITY
     */
    public void setACTIVITY(java.lang.String ACTIVITY) {
        this.ACTIVITY = ACTIVITY;
    }


    /**
     * Gets the GRANT_NBR value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return GRANT_NBR
     */
    public java.lang.String getGRANT_NBR() {
        return GRANT_NBR;
    }


    /**
     * Sets the GRANT_NBR value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param GRANT_NBR
     */
    public void setGRANT_NBR(java.lang.String GRANT_NBR) {
        this.GRANT_NBR = GRANT_NBR;
    }


    /**
     * Gets the CMMT_ITEM_LONG value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return CMMT_ITEM_LONG
     */
    public java.lang.String getCMMT_ITEM_LONG() {
        return CMMT_ITEM_LONG;
    }


    /**
     * Sets the CMMT_ITEM_LONG value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param CMMT_ITEM_LONG
     */
    public void setCMMT_ITEM_LONG(java.lang.String CMMT_ITEM_LONG) {
        this.CMMT_ITEM_LONG = CMMT_ITEM_LONG;
    }


    /**
     * Gets the FUNC_AREA_LONG value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return FUNC_AREA_LONG
     */
    public java.lang.String getFUNC_AREA_LONG() {
        return FUNC_AREA_LONG;
    }


    /**
     * Sets the FUNC_AREA_LONG value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param FUNC_AREA_LONG
     */
    public void setFUNC_AREA_LONG(java.lang.String FUNC_AREA_LONG) {
        this.FUNC_AREA_LONG = FUNC_AREA_LONG;
    }


    /**
     * Gets the BUDGET_PERIOD value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return BUDGET_PERIOD
     */
    public java.lang.String getBUDGET_PERIOD() {
        return BUDGET_PERIOD;
    }


    /**
     * Sets the BUDGET_PERIOD value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param BUDGET_PERIOD
     */
    public void setBUDGET_PERIOD(java.lang.String BUDGET_PERIOD) {
        this.BUDGET_PERIOD = BUDGET_PERIOD;
    }


    /**
     * Gets the FINAL_IND value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return FINAL_IND
     */
    public java.lang.String getFINAL_IND() {
        return FINAL_IND;
    }


    /**
     * Sets the FINAL_IND value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param FINAL_IND
     */
    public void setFINAL_IND(java.lang.String FINAL_IND) {
        this.FINAL_IND = FINAL_IND;
    }


    /**
     * Gets the FINAL_REASON value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @return FINAL_REASON
     */
    public java.lang.String getFINAL_REASON() {
        return FINAL_REASON;
    }


    /**
     * Sets the FINAL_REASON value for this PO_Details_ResponsePOACCOUNT_ASSIGNItem.
     * 
     * @param FINAL_REASON
     */
    public void setFINAL_REASON(java.lang.String FINAL_REASON) {
        this.FINAL_REASON = FINAL_REASON;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PO_Details_ResponsePOACCOUNT_ASSIGNItem)) return false;
        PO_Details_ResponsePOACCOUNT_ASSIGNItem other = (PO_Details_ResponsePOACCOUNT_ASSIGNItem) obj;
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
            ((this.SERIAL_NO==null && other.getSERIAL_NO()==null) || 
             (this.SERIAL_NO!=null &&
              this.SERIAL_NO.equals(other.getSERIAL_NO()))) &&
            ((this.DELETE_IND==null && other.getDELETE_IND()==null) || 
             (this.DELETE_IND!=null &&
              this.DELETE_IND.equals(other.getDELETE_IND()))) &&
            ((this.CREAT_DATE==null && other.getCREAT_DATE()==null) || 
             (this.CREAT_DATE!=null &&
              this.CREAT_DATE.equals(other.getCREAT_DATE()))) &&
            ((this.QUANTITY==null && other.getQUANTITY()==null) || 
             (this.QUANTITY!=null &&
              this.QUANTITY.equals(other.getQUANTITY()))) &&
            ((this.DISTR_PERC==null && other.getDISTR_PERC()==null) || 
             (this.DISTR_PERC!=null &&
              this.DISTR_PERC.equals(other.getDISTR_PERC()))) &&
            ((this.NET_VALUE==null && other.getNET_VALUE()==null) || 
             (this.NET_VALUE!=null &&
              this.NET_VALUE.equals(other.getNET_VALUE()))) &&
            ((this.GL_ACCOUNT==null && other.getGL_ACCOUNT()==null) || 
             (this.GL_ACCOUNT!=null &&
              this.GL_ACCOUNT.equals(other.getGL_ACCOUNT()))) &&
            ((this.BUS_AREA==null && other.getBUS_AREA()==null) || 
             (this.BUS_AREA!=null &&
              this.BUS_AREA.equals(other.getBUS_AREA()))) &&
            ((this.COSTCENTER==null && other.getCOSTCENTER()==null) || 
             (this.COSTCENTER!=null &&
              this.COSTCENTER.equals(other.getCOSTCENTER()))) &&
            ((this.SD_DOC==null && other.getSD_DOC()==null) || 
             (this.SD_DOC!=null &&
              this.SD_DOC.equals(other.getSD_DOC()))) &&
            ((this.ITM_NUMBER==null && other.getITM_NUMBER()==null) || 
             (this.ITM_NUMBER!=null &&
              this.ITM_NUMBER.equals(other.getITM_NUMBER()))) &&
            ((this.SCHED_LINE==null && other.getSCHED_LINE()==null) || 
             (this.SCHED_LINE!=null &&
              this.SCHED_LINE.equals(other.getSCHED_LINE()))) &&
            ((this.ASSET_NO==null && other.getASSET_NO()==null) || 
             (this.ASSET_NO!=null &&
              this.ASSET_NO.equals(other.getASSET_NO()))) &&
            ((this.SUB_NUMBER==null && other.getSUB_NUMBER()==null) || 
             (this.SUB_NUMBER!=null &&
              this.SUB_NUMBER.equals(other.getSUB_NUMBER()))) &&
            ((this.ORDERID==null && other.getORDERID()==null) || 
             (this.ORDERID!=null &&
              this.ORDERID.equals(other.getORDERID()))) &&
            ((this.GR_RCPT==null && other.getGR_RCPT()==null) || 
             (this.GR_RCPT!=null &&
              this.GR_RCPT.equals(other.getGR_RCPT()))) &&
            ((this.UNLOAD_PT==null && other.getUNLOAD_PT()==null) || 
             (this.UNLOAD_PT!=null &&
              this.UNLOAD_PT.equals(other.getUNLOAD_PT()))) &&
            ((this.CO_AREA==null && other.getCO_AREA()==null) || 
             (this.CO_AREA!=null &&
              this.CO_AREA.equals(other.getCO_AREA()))) &&
            ((this.COSTOBJECT==null && other.getCOSTOBJECT()==null) || 
             (this.COSTOBJECT!=null &&
              this.COSTOBJECT.equals(other.getCOSTOBJECT()))) &&
            ((this.PROFIT_CTR==null && other.getPROFIT_CTR()==null) || 
             (this.PROFIT_CTR!=null &&
              this.PROFIT_CTR.equals(other.getPROFIT_CTR()))) &&
            ((this.WBS_ELEMENT==null && other.getWBS_ELEMENT()==null) || 
             (this.WBS_ELEMENT!=null &&
              this.WBS_ELEMENT.equals(other.getWBS_ELEMENT()))) &&
            ((this.NETWORK==null && other.getNETWORK()==null) || 
             (this.NETWORK!=null &&
              this.NETWORK.equals(other.getNETWORK()))) &&
            ((this.RL_EST_KEY==null && other.getRL_EST_KEY()==null) || 
             (this.RL_EST_KEY!=null &&
              this.RL_EST_KEY.equals(other.getRL_EST_KEY()))) &&
            ((this.PART_ACCT==null && other.getPART_ACCT()==null) || 
             (this.PART_ACCT!=null &&
              this.PART_ACCT.equals(other.getPART_ACCT()))) &&
            ((this.CMMT_ITEM==null && other.getCMMT_ITEM()==null) || 
             (this.CMMT_ITEM!=null &&
              this.CMMT_ITEM.equals(other.getCMMT_ITEM()))) &&
            ((this.REC_IND==null && other.getREC_IND()==null) || 
             (this.REC_IND!=null &&
              this.REC_IND.equals(other.getREC_IND()))) &&
            ((this.FUNDS_CTR==null && other.getFUNDS_CTR()==null) || 
             (this.FUNDS_CTR!=null &&
              this.FUNDS_CTR.equals(other.getFUNDS_CTR()))) &&
            ((this.FUND==null && other.getFUND()==null) || 
             (this.FUND!=null &&
              this.FUND.equals(other.getFUND()))) &&
            ((this.FUNC_AREA==null && other.getFUNC_AREA()==null) || 
             (this.FUNC_AREA!=null &&
              this.FUNC_AREA.equals(other.getFUNC_AREA()))) &&
            ((this.REF_DATE==null && other.getREF_DATE()==null) || 
             (this.REF_DATE!=null &&
              this.REF_DATE.equals(other.getREF_DATE()))) &&
            ((this.TAX_CODE==null && other.getTAX_CODE()==null) || 
             (this.TAX_CODE!=null &&
              this.TAX_CODE.equals(other.getTAX_CODE()))) &&
            ((this.TAXJURCODE==null && other.getTAXJURCODE()==null) || 
             (this.TAXJURCODE!=null &&
              this.TAXJURCODE.equals(other.getTAXJURCODE()))) &&
            ((this.NOND_ITAX==null && other.getNOND_ITAX()==null) || 
             (this.NOND_ITAX!=null &&
              this.NOND_ITAX.equals(other.getNOND_ITAX()))) &&
            ((this.ACTTYPE==null && other.getACTTYPE()==null) || 
             (this.ACTTYPE!=null &&
              this.ACTTYPE.equals(other.getACTTYPE()))) &&
            ((this.CO_BUSPROC==null && other.getCO_BUSPROC()==null) || 
             (this.CO_BUSPROC!=null &&
              this.CO_BUSPROC.equals(other.getCO_BUSPROC()))) &&
            ((this.RES_DOC==null && other.getRES_DOC()==null) || 
             (this.RES_DOC!=null &&
              this.RES_DOC.equals(other.getRES_DOC()))) &&
            ((this.RES_ITEM==null && other.getRES_ITEM()==null) || 
             (this.RES_ITEM!=null &&
              this.RES_ITEM.equals(other.getRES_ITEM()))) &&
            ((this.ACTIVITY==null && other.getACTIVITY()==null) || 
             (this.ACTIVITY!=null &&
              this.ACTIVITY.equals(other.getACTIVITY()))) &&
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
            ((this.FINAL_IND==null && other.getFINAL_IND()==null) || 
             (this.FINAL_IND!=null &&
              this.FINAL_IND.equals(other.getFINAL_IND()))) &&
            ((this.FINAL_REASON==null && other.getFINAL_REASON()==null) || 
             (this.FINAL_REASON!=null &&
              this.FINAL_REASON.equals(other.getFINAL_REASON())));
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
        if (getSERIAL_NO() != null) {
            _hashCode += getSERIAL_NO().hashCode();
        }
        if (getDELETE_IND() != null) {
            _hashCode += getDELETE_IND().hashCode();
        }
        if (getCREAT_DATE() != null) {
            _hashCode += getCREAT_DATE().hashCode();
        }
        if (getQUANTITY() != null) {
            _hashCode += getQUANTITY().hashCode();
        }
        if (getDISTR_PERC() != null) {
            _hashCode += getDISTR_PERC().hashCode();
        }
        if (getNET_VALUE() != null) {
            _hashCode += getNET_VALUE().hashCode();
        }
        if (getGL_ACCOUNT() != null) {
            _hashCode += getGL_ACCOUNT().hashCode();
        }
        if (getBUS_AREA() != null) {
            _hashCode += getBUS_AREA().hashCode();
        }
        if (getCOSTCENTER() != null) {
            _hashCode += getCOSTCENTER().hashCode();
        }
        if (getSD_DOC() != null) {
            _hashCode += getSD_DOC().hashCode();
        }
        if (getITM_NUMBER() != null) {
            _hashCode += getITM_NUMBER().hashCode();
        }
        if (getSCHED_LINE() != null) {
            _hashCode += getSCHED_LINE().hashCode();
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
        if (getGR_RCPT() != null) {
            _hashCode += getGR_RCPT().hashCode();
        }
        if (getUNLOAD_PT() != null) {
            _hashCode += getUNLOAD_PT().hashCode();
        }
        if (getCO_AREA() != null) {
            _hashCode += getCO_AREA().hashCode();
        }
        if (getCOSTOBJECT() != null) {
            _hashCode += getCOSTOBJECT().hashCode();
        }
        if (getPROFIT_CTR() != null) {
            _hashCode += getPROFIT_CTR().hashCode();
        }
        if (getWBS_ELEMENT() != null) {
            _hashCode += getWBS_ELEMENT().hashCode();
        }
        if (getNETWORK() != null) {
            _hashCode += getNETWORK().hashCode();
        }
        if (getRL_EST_KEY() != null) {
            _hashCode += getRL_EST_KEY().hashCode();
        }
        if (getPART_ACCT() != null) {
            _hashCode += getPART_ACCT().hashCode();
        }
        if (getCMMT_ITEM() != null) {
            _hashCode += getCMMT_ITEM().hashCode();
        }
        if (getREC_IND() != null) {
            _hashCode += getREC_IND().hashCode();
        }
        if (getFUNDS_CTR() != null) {
            _hashCode += getFUNDS_CTR().hashCode();
        }
        if (getFUND() != null) {
            _hashCode += getFUND().hashCode();
        }
        if (getFUNC_AREA() != null) {
            _hashCode += getFUNC_AREA().hashCode();
        }
        if (getREF_DATE() != null) {
            _hashCode += getREF_DATE().hashCode();
        }
        if (getTAX_CODE() != null) {
            _hashCode += getTAX_CODE().hashCode();
        }
        if (getTAXJURCODE() != null) {
            _hashCode += getTAXJURCODE().hashCode();
        }
        if (getNOND_ITAX() != null) {
            _hashCode += getNOND_ITAX().hashCode();
        }
        if (getACTTYPE() != null) {
            _hashCode += getACTTYPE().hashCode();
        }
        if (getCO_BUSPROC() != null) {
            _hashCode += getCO_BUSPROC().hashCode();
        }
        if (getRES_DOC() != null) {
            _hashCode += getRES_DOC().hashCode();
        }
        if (getRES_ITEM() != null) {
            _hashCode += getRES_ITEM().hashCode();
        }
        if (getACTIVITY() != null) {
            _hashCode += getACTIVITY().hashCode();
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
        if (getFINAL_IND() != null) {
            _hashCode += getFINAL_IND().hashCode();
        }
        if (getFINAL_REASON() != null) {
            _hashCode += getFINAL_REASON().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PO_Details_ResponsePOACCOUNT_ASSIGNItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://incture.com/AccountPayable", ">>PO_Details_Response>POACCOUNT_ASSIGN>item"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PO_ITEM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PO_ITEM"));
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
        elemField.setFieldName("DELETE_IND");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DELETE_IND"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CREAT_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CREAT_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("DISTR_PERC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DISTR_PERC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NET_VALUE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NET_VALUE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("BUS_AREA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BUS_AREA"));
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
        elemField.setFieldName("ITM_NUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ITM_NUMBER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCHED_LINE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SCHED_LINE"));
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
        elemField.setFieldName("GR_RCPT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GR_RCPT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UNLOAD_PT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UNLOAD_PT"));
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
        elemField.setFieldName("PROFIT_CTR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PROFIT_CTR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WBS_ELEMENT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WBS_ELEMENT"));
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
        elemField.setFieldName("RL_EST_KEY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RL_EST_KEY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PART_ACCT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PART_ACCT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("REC_IND");
        elemField.setXmlName(new javax.xml.namespace.QName("", "REC_IND"));
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
        elemField.setFieldName("FUND");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FUND"));
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
        elemField.setFieldName("REF_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "REF_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("NOND_ITAX");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NOND_ITAX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ACTTYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CO_BUSPROC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CO_BUSPROC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RES_DOC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RES_DOC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RES_ITEM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RES_ITEM"));
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
        elemField.setFieldName("FINAL_IND");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FINAL_IND"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FINAL_REASON");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FINAL_REASON"));
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
