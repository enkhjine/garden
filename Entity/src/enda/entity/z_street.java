package enda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "z_street")
public class z_street {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "StreetID")
	private String streetID;
	
	@Column(name = "AimagID")
	private String aimagID;
	
	@Column(name = "SymID")
	private String symID;
	
	@Column(name = "HorooID")
	private String horooID;
	
	@Column(name = "StreetName")
	private String streetName;
	
	@Column(name = "ShorID")
	private String shorID;

	public String getStreetID() {
		return streetID;
	}

	public void setStreetID(String streetID) {
		this.streetID = streetID;
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

	public String getHorooID() {
		return horooID;
	}

	public void setHorooID(String horooID) {
		this.horooID = horooID;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
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
