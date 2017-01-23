package enda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "z_middistrict")
public class z_middistrict {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "MiddistID")
	private String middistID;
	
	@Column(name = "AimagID")
	private String aimagID;
	
	@Column(name = "SymID")
	private String symID;
	
	@Column(name = "MiddistName")
	private String middistName;
	
	@Column(name = "ShorID")
	private String shorID;

	public String getMiddistID() {
		return middistID;
	}

	public void setMiddistID(String middistID) {
		this.middistID = middistID;
	}

	public String getAimagID() {
		return aimagID;
	}

	public void setAimagID(String aimagID) {
		this.aimagID = aimagID;
	}

	public String getSymID() {
		return symID;
	}

	public void setSymID(String symID) {
		this.symID = symID;
	}

	public String getMiddistName() {
		return middistName;
	}

	public void setMiddistName(String middistName) {
		this.middistName = middistName;
	}

	public String getShorID() {
		return shorID;
	}

	public void setShorID(String shorID) {
		this.shorID = shorID;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
