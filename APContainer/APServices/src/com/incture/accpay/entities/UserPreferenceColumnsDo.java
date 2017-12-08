package com.incture.accpay.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: UserPreferenceColumnsDo
 *
 */
@Entity
@Table(name = "AP_USERPREFCOL")
public class UserPreferenceColumnsDo implements BaseDo,Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USERID")
	private String userId;
	
	@Lob
	@Column(name="PREF_COLUMNS")
	private String columns;
	
	public UserPreferenceColumnsDo() {
		super();
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getColumns() {
		return columns;
	}

	public void setColumns(String columns) {
		this.columns = columns;
	}

	@Override
	public Object getPrimaryKey() {
		// TODO Auto-generated method stub
		return userId;
	}

}
