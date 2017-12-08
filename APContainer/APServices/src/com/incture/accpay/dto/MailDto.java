package com.incture.accpay.dto;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement 
@XmlAccessorType(XmlAccessType.FIELD)
public class MailDto {
	@XmlElement
	String subject;
	@XmlElement
	String from;
	@XmlElement
	Date mailReceieved ;
	@XmlElement
	List<AttachmentDto> attachments;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public Date getMailReceieved() {
		return mailReceieved;
	}
	public void setMailReceieved(Date mailReceieved) {
		this.mailReceieved = mailReceieved;
	}
	public List<AttachmentDto> getAttachments() {
		return attachments;
	}
	public void setAttachments(List<AttachmentDto> attachments) {
		this.attachments = attachments;
	}
	

}
