package enda.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "UserPFile")
public class UserPFile {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "UserID")
	private String UserID;
	
	@Column(name = "PTypeID")
	private int PTypeID;
	
	@Column(name = "Dugaar")
	private String Dugaar;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RegDate")
	private Date RegDate;
	
	@Column(name = "PFilePic")
	private byte[] PFilePic;

	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
		UserID = userID;
	}

	public int getPTypeID() {
		return PTypeID;
	}

	public void setPTypeID(int pTypeID) {
		PTypeID = pTypeID;
	}

	public String getDugaar() {
		return Dugaar;
	}

	public void setDugaar(String dugaar) {
		Dugaar = dugaar;
	}

	public Date getRegDate() {
		return RegDate;
	}

	public void setRegDate(Date regDate) {
		RegDate = regDate;
	}

	public byte[] getPFilePic() {
		return PFilePic;
	}

	public void setPFilePic(byte[] pFilePic) {
		PFilePic = pFilePic;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
