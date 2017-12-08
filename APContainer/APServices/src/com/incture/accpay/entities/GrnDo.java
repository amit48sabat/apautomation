package com.incture.accpay.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "AP_GRN")
public class GrnDo implements Serializable, BaseDo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", length = 40, nullable = false)
	private String id;
	
	@Column(name="REQUEST_ID",length=20)
	private String requestId;
	
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CREATED_DATE")
    private Date createdDate;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="UPDATED_DATE")
    private Date updatedDate;
    
    @Column(name="PO_NUMBER", length = 10)
    private String poNumber;
    
    @Column(name="CREATED_BY")
    private String createdBy;
 
    @Column(name="UPDATED_BY")
    private String updatedBy;
    
    public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}
	
	

	@OneToMany( mappedBy="grnDo", cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    private List<GrnItemDo> grnItemList;
 

	
	public List<GrnItemDo> getGrnItemList() {
		return grnItemList;
	}

	public void setGrnItemList(List<GrnItemDo> grnItemList) {
		this.grnItemList = grnItemList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public Object getPrimaryKey() {
		// TODO Auto-generated method stub
		return id;
	}

	public GrnDo() {
		super();
	}

}
