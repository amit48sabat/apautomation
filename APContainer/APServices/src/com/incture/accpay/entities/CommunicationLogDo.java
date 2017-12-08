package com.incture.accpay.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="AP_COMMENTS")
public class CommunicationLogDo implements BaseDo,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 315547007043398221L;
	@Id
	@Column(name="ID", length=40)
	private String id;
	
	@Column(name="COMMENT", length=1000)
	private String comment;
	
	@Column(name="STEP", length=50)
	private String step;
	
	@Column(name="CREATED_BY")
	private String commentedBy;
	
	@Column(name="CREATED_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCommented;
	
	@Column(name="UPDATED_BY")
	private String updatedBy;
	
	@Column(name="UPDATED_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateUpdated;
	
	
	@Column(name="REQUEST_ID", length=40)
	private String requestId;
	
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getStep() {
		return step;
	}
	public void setStep(String step) {
		this.step = step;
	}
	public String getCommentedBy() {
		return commentedBy;
	}
	public void setCommentedBy(String commentedBy) {
		this.commentedBy = commentedBy;
	}
	public Date getDateCommented() {
		return dateCommented;
	}
	public void setDateCommented(Date dateCommented) {
		this.dateCommented = dateCommented;
	}
	
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getDateUpdated() {
		return dateUpdated;
	}
	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}
	@Override
	public Object getPrimaryKey() {
		return id;
	}
	
}
