package enda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "z_ctype")
public class z_ctype {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "CtypeID")
	private String ctypeID;
	
	@Column(name = "CtypeName")
	private String ctypeName;
	
	@Column(name = "CtypeSName")
	private String ctypeSName;
	
	@Column(name = "CtypeSSName")
	private String ctypeSSName;
	
	@Column(name = "Flag")
	private String flag;

	public String getCtypeID() {
		return ctypeID;
	}

	public void setCtypeID(String ctypeID) {
		this.ctypeID = ctypeID;
	}

	public String getCtypeName() {
		return ctypeName;
	}

	public void setCtypeName(String ctypeName) {
		this.ctypeName = ctypeName;
	}

	public String getCtypeSName() {
		return ctypeSName;
	}

	public void setCtypeSName(String ctypeSName) {
		this.ctypeSName = ctypeSName;
	}

	public String getCtypeSSName() {
		return ctypeSSName;
	}

	public void setCtypeSSName(String ctypeSSName) {
		this.ctypeSSName = ctypeSSName;
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
