package com.incture.accpay.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SM_SEQ_NUMBERS database table.
 * 
 */
@Entity
@Table(name = "AP_SEQUENCE_NUMBER")
@NamedQuery(name = "SmSeqNumber.getAll", query = "SELECT p FROM SmSeqNumber p")
public class SmSeqNumber implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "REFERENCE_CODE",nullable= true)
	private String _referenceCode_;

	@Column(name = "RUNNING_NUMBER", nullable = false)
	private int _runningNumber_;

	public SmSeqNumber() {
	}

	public SmSeqNumber(String referenceCode, int runningNumber) {
		super();
		this._referenceCode_ = referenceCode;
		this._runningNumber_ = runningNumber;
	}

	public String get_referenceCode_() {
		return this._referenceCode_;
	}

	public void set_referenceCode_(String _referenceCode_) {
		this._referenceCode_ = _referenceCode_;
	}

	public int get_runningNumber_() {
		return this._runningNumber_;
	}

	public void set_runningNumber_(int _runningNumber_) {
		this._runningNumber_ = _runningNumber_;
	}

}