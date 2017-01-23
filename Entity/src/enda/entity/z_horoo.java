package enda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "z_horoo")
public class z_horoo {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "HorooID")
	private String horooID;
	
	@Column(name = "AimagID")
	private String aimagID;
	
	@Column(name = "SymID")
	private String symID;
	
	@Column(name = "HorooName")
	private String horooName;
	
	@Column(name = "ShorID")
	private String shorID;

	public String getHorooID() {
		return horooID;
	}

	public void setHorooID(String horooID) {
		this.horooID = horooID;
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

	public String getHorooName() {
		return horooName;
	}

	public void setHorooName(String horooName) {
		this.horooName = horooName;
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
