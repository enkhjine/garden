package enda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "z_sym")
public class z_sym {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "SymID")
	private String symID;
	
	@Column(name = "AimagID")
	private String aimagID;
	
	@Column(name = "SymName")
	private String symName;
	
	@Column(name = "ShorID")
	private String shorID;

	public String getSymID() {
		return symID;
	}

	public void setSymID(String symID) {
		this.symID = symID;
	}

	public String getAimagID() {
		return aimagID;
	}

	public void setAimagID(String aimagID) {
		this.aimagID = aimagID;
	}

	public String getSymName() {
		return symName;
	}

	public void setSymName(String symName) {
		this.symName = symName;
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
