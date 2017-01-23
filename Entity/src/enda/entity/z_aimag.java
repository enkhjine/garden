package enda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "z_aimag")
public class z_aimag {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "AimagID")
	private String aimagID;
	
	@Column(name = "ShortID")
	private String shortID;
	
	@Column(name = "AimagName")
	private String aimagName;
	
	@Column(name = "CenterName")
	private String centerName;
	
	@Column(name = "ComID")
	private String comID;
	
	@Column(name = "ZIP")
	private String zip;

	public String getAimagID() {
		return aimagID;
	}

	public void setAimagID(String aimagID) {
		this.aimagID = aimagID;
	}

	public String getShortID() {
		return shortID;
	}

	public void setShortID(String shortID) {
		this.shortID = shortID;
	}

	public String getAimagName() {
		return aimagName;
	}

	public void setAimagName(String aimagName) {
		this.aimagName = aimagName;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public String getComID() {
		return comID;
	}

	public void setComID(String comID) {
		this.comID = comID;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
