package enda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "z_focus")
public class z_focus {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "CfocusID")
	private String cfocusID;
	
	@Column(name = "CfocusName")
	private String cfocusName;
	
	@Column(name = "CtypeID")
	private String ctypeID;
	
	@Column(name = "Flag")
	private String flag;

	public String getCfocusID() {
		return cfocusID;
	}

	public void setCfocusID(String cfocusID) {
		this.cfocusID = cfocusID;
	}

	public String getCfocusName() {
		return cfocusName;
	}

	public void setCfocusName(String cfocusName) {
		this.cfocusName = cfocusName;
	}

	public String getCtypeID() {
		return ctypeID;
	}

	public void setCtypeID(String ctypeID) {
		this.ctypeID = ctypeID;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
