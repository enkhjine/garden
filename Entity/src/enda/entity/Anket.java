package enda.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "newusers")
public class Anket implements Serializable{
	
	private static final long serialVersionUID = 1L;

	
	
	@Id
	@Column(name = "UserID")
	private String userid;
	
	@Column(name = "UYear")
	private int uyear;
	
	@Column(name = "UCompID")
	private int ucompid;
	
	@Column(name = "URegID")
	private String uregid;
	
	@Column(name = "Usertype")
	private String usertype;
	
	@Column(name = "UserReg")
	private String userreg;
	
	@Column(name = "UserPass")
	private String userpass;
	
	@Column(name = "Userovog")
	private String userovog;
	
	@Column(name = "Username")
	private String username;
	
	@Column(name = "Address")
	private String address;
	
	@Column(name = "Phone")
	private String phone;
	
	@Column(name = "Phone1")
	private String phone1;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Bairshil")
	private String bairshil;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "huselt_ognoo")
	private Date huselt_ognoo;
	
	@Column(name = "ZorID")
	private int zorid;
	
	@Column(name = "Halaalt_Type")
	private String halaalt_type;
	
	@Column(name = "avah_shaltgaan")
	private String avah_shaltgaan;
	
	@Column(name = "sum_chadal")
	private BigDecimal sum_chadal;
	
	@Column(name = "huchdel")
	private String huchdel;
	
	@Column(name = "pcoef")
	private BigDecimal pcoef;
	
	@Column(name = "ctypeid")
	private String ctypeid;
	
	@Column(name = "cfocusid")
	private String cfocusid;
	
	@Column(name = "cfocusdesc")
	private String cfocusdesc;
	
	@Column(name = "user_season")
	private String user_season;
	
	@Column(name = "user_ptime")
	private String user_ptime;
	
	@Column(name = "user_gorim")
	private String user_gorim;
	
	@Column(name = "user_zereglel")
	private String user_zereglel;
	
	@Column(name = "user_hugatsaa")
	private String user_hugatsaa;
	
	@Column(name = "gazar_dugaar")
	private String gazar_dugaar;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "gazar_ognoo")
	private Date gazar_ognoo;
	
	@Column(name = "zovshoorol_dugaar")
	private String zovshoorol_dugaar;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "zovshoorol_ognoo")
	private Date zovshoorol_ognoo;
	
	@Column(name = "tootshoo")
	private String tootshoo;
	
	@Column(name = "tn_dugaar")
	private String tn_dugaar;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "olgoson_ognoo")
	private Date olgoson_ognoo;
	
	@Column(name = "tno_eseh")
	private String tno_eseh;
	
	@Column(name = "shaltgaan")
	private String shaltgaan;
	
	@Column(name = "ShID")
	private int shid;
	
	@Column(name = "EmpID")
	private int empid;

	@Column(name = "StatusID")
	private int statusid;
	
	@Column(name = "tp_id")
	private int tp_id;
	
	@Column(name = "angilal")
	private String angilal;
	
	@Column(name = "Opercode")
	private int opercode;
	
	@Column(name = "AimagID")
	private String aimagid;
	
	@Column(name = "SymID")
	private String symid;
	
	@Column(name = "HorooID")
	private String horooid;
	
	@Column(name = "MiddistID")
	private String middistid;
	
	@Column(name = "MiddistName")
	private String middistname;
	
	@Column(name = "StreetID")
	private String streetid;
	
	@Column(name = "StreetName")
	private String streetname;
	
	@Column(name = "Apart")
	private String apart;
	
	@Column(name = "Toot")
	private String toot;
	
	@Column(name = "OAimagID")
	private String oaimagid;
	
	@Column(name = "OSymID")
	private String osymid;
	
	@Column(name = "OHorooID")
	private String ohorooid;
	
	@Column(name = "OMiddistID")
	private String omiddistid;
	
	@Column(name = "OMiddistName")
	private String omiddistname;
	
	@Column(name = "OStreetID")
	private String ostreetid;
	
	@Column(name = "OStreetName")
	private String ostreetname;
	
	@Column(name = "OApart")
	private String oapart;
	
	@Column(name = "OToot")
	private String otoot;
	
	@Column(name = "TOvog")
	private String tovog;
	
	@Column(name = "TName")
	private String tname;
	
	@Column(name = "TPosName")
	private String tposname;
	
	@Column(name = "TRegister")
	private String tregister;
	
	@Column(name = "TPhone")
	private String tphone;
	
	@Column(name = "AppType")
	private String apptype;
	

	@Transient
	private byte[] image1;
	
	@Transient
	private byte[] image2;
	
	@Transient
	private byte[] image3;

	@Transient
	private byte[] image4;
	
	@Transient
	private byte[] image5;

	@Transient
	private byte[] image6;

	@Transient
	private byte[] image7;

	@Transient
	private byte[] image8;

	@Transient
	private byte[] image9;

	@Transient
	private byte[] image10;

	@Transient
	private byte[] image11;

	@Transient
	private byte[] image12;

	public Anket() {
		super();
	}

	

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public int getUyear() {
		return uyear;
	}

	public void setUyear(int uyear) {
		this.uyear = uyear;
	}

	public int getUcompid() {
		return ucompid;
	}

	public void setUcompid(int ucompid) {
		this.ucompid = ucompid;
	}

	public String getUregid() {
		return uregid;
	}

	public void setUregid(String uregid) {
		this.uregid = uregid;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getUserreg() {
		return userreg;
	}

	public void setUserreg(String userreg) {
		this.userreg = userreg;
	}

	public String getUserpass() {
		return userpass;
	}

	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}

	public String getUserovog() {
		return userovog;
	}

	public void setUserovog(String userovog) {
		this.userovog = userovog;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBairshil() {
		return bairshil;
	}

	public void setBairshil(String bairshil) {
		this.bairshil = bairshil;
	}

	public Date getHuselt_ognoo() {
		return huselt_ognoo;
	}

	public void setHuselt_ognoo(Date huselt_ognoo) {
		this.huselt_ognoo = huselt_ognoo;
	}

	public int getZorid() {
		return zorid;
	}

	public void setZorid(int zorid) {
		this.zorid = zorid;
	}

	public String getHalaalt_type() {
		return halaalt_type;
	}

	public void setHalaalt_type(String halaalt_type) {
		this.halaalt_type = halaalt_type;
	}

	public String getAvah_shaltgaan() {
		return avah_shaltgaan;
	}

	public void setAvah_shaltgaan(String avah_shaltgaan) {
		this.avah_shaltgaan = avah_shaltgaan;
	}

	public BigDecimal getSum_chadal() {
		return sum_chadal;
	}

	public void setSum_chadal(BigDecimal sum_chadal) {
		this.sum_chadal = sum_chadal;
	}

	public String getHuchdel() {
		return huchdel;
	}

	public void setHuchdel(String huchdel) {
		this.huchdel = huchdel;
	}

	public BigDecimal getPcoef() {
		return pcoef;
	}

	public void setPcoef(BigDecimal pcoef) {
		this.pcoef = pcoef;
	}

	public String getCtypeid() {
		return ctypeid;
	}

	public void setCtypeid(String ctypeid) {
		this.ctypeid = ctypeid;
	}

	public String getCfocusid() {
		return cfocusid;
	}

	public void setCfocusid(String cfocusid) {
		this.cfocusid = cfocusid;
	}

	public String getCfocusdesc() {
		return cfocusdesc;
	}

	public void setCfocusdesc(String cfocusdesc) {
		this.cfocusdesc = cfocusdesc;
	}

	public String getUser_season() {
		return user_season;
	}

	public void setUser_season(String user_season) {
		this.user_season = user_season;
	}

	public String getUser_ptime() {
		return user_ptime;
	}

	public void setUser_ptime(String user_ptime) {
		if(user_ptime != null && user_ptime.length() > 0) {
			this.user_ptime = user_ptime;
		}
	}

	public String getUser_gorim() {
		return user_gorim;
	}

	public void setUser_gorim(String user_gorim) {
		this.user_gorim = user_gorim;
	}

	public String getUser_zereglel() {
		return user_zereglel;
	}

	public void setUser_zereglel(String user_zereglel) {
		this.user_zereglel = user_zereglel;
	}

	public String getUser_hugatsaa() {
		return user_hugatsaa;
	}

	public void setUser_hugatsaa(String user_hugatsaa) {
		this.user_hugatsaa = user_hugatsaa;
	}

	public String getGazar_dugaar() {
		return gazar_dugaar;
	}

	public void setGazar_dugaar(String gazar_dugaar) {
		this.gazar_dugaar = gazar_dugaar;
	}

	public Date getGazar_ognoo() {
		return gazar_ognoo;
	}

	public void setGazar_ognoo(Date gazar_ognoo) {
		this.gazar_ognoo = gazar_ognoo;
	}

	public String getZovshoorol_dugaar() {
		return zovshoorol_dugaar;
	}

	public void setZovshoorol_dugaar(String zovshoorol_dugaar) {
		this.zovshoorol_dugaar = zovshoorol_dugaar;
	}

	public Date getZovshoorol_ognoo() {
		return zovshoorol_ognoo;
	}

	public void setZovshoorol_ognoo(Date zovshoorol_ognoo) {
		this.zovshoorol_ognoo = zovshoorol_ognoo;
	}

	public String getTootshoo() {
		return tootshoo;
	}

	public void setTootshoo(String tootshoo) {
		this.tootshoo = tootshoo;
	}

	public String getTn_dugaar() {
		return tn_dugaar;
	}

	public void setTn_dugaar(String tn_dugaar) {
		this.tn_dugaar = tn_dugaar;
	}

	public Date getOlgoson_ognoo() {
		return olgoson_ognoo;
	}

	public void setOlgoson_ognoo(Date olgoson_ognoo) {
		this.olgoson_ognoo = olgoson_ognoo;
	}

	public String getTno_eseh() {
		return tno_eseh;
	}

	public void setTno_eseh(String tno_eseh) {
		this.tno_eseh = tno_eseh;
	}

	public String getShaltgaan() {
		return shaltgaan;
	}

	public void setShaltgaan(String shaltgaan) {
		this.shaltgaan = shaltgaan;
	}

	public int getShid() {
		return shid;
	}

	public void setShid(int shid) {
		this.shid = shid;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getStatusid() {
		return statusid;
	}

	public void setStatusid(int statusid) {
		this.statusid = statusid;
	}

	public int getTp_id() {
		return tp_id;
	}

	public void setTp_id(int tp_id) {
		this.tp_id = tp_id;
	}

	public String getAngilal() {
		return angilal;
	}

	public void setAngilal(String angilal) {
		this.angilal = angilal;
	}

	public int getOpercode() {
		return opercode;
	}

	public void setOpercode(int opercode) {
		this.opercode = opercode;
	}

	public String getAimagid() {
		return aimagid;
	}

	public void setAimagid(String aimagid) {
		this.aimagid = aimagid;
	}

	public String getSymid() {
		return symid;
	}

	public void setSymid(String symid) {
		this.symid = symid;
	}

	public String getHorooid() {
		return horooid;
	}

	public void setHorooid(String horooid) {
		this.horooid = horooid;
	}

	public String getMiddistid() {
		return middistid;
	}

	public void setMiddistid(String middistid) {
		this.middistid = middistid;
	}

	public String getMiddistname() {
		return middistname;
	}

	public void setMiddistname(String middistname) {
		this.middistname = middistname;
	}

	public String getStreetid() {
		return streetid;
	}

	public void setStreetid(String streetid) {
		this.streetid = streetid;
	}

	public String getStreetname() {
		return streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	public String getApart() {
		return apart;
	}

	public void setApart(String apart) {
		this.apart = apart;
	}

	public String getToot() {
		return toot;
	}

	public void setToot(String toot) {
		this.toot = toot;
	}

	public String getOaimagid() {
		return oaimagid;
	}

	public void setOaimagid(String oaimagid) {
		this.oaimagid = oaimagid;
	}

	public String getOsymid() {
		return osymid;
	}

	public void setOsymid(String osymid) {
		this.osymid = osymid;
	}

	public String getOhorooid() {
		return ohorooid;
	}

	public void setOhorooid(String ohorooid) {
		this.ohorooid = ohorooid;
	}

	public String getOmiddistid() {
		return omiddistid;
	}

	public void setOmiddistid(String omiddistid) {
		this.omiddistid = omiddistid;
	}

	public String getOmiddistname() {
		return omiddistname;
	}

	public void setOmiddistname(String omiddistname) {
		this.omiddistname = omiddistname;
	}

	public String getOstreetid() {
		return ostreetid;
	}

	public void setOstreetid(String ostreetid) {
		this.ostreetid = ostreetid;
	}

	public String getOstreetname() {
		return ostreetname;
	}

	public void setOstreetname(String ostreetname) {
		this.ostreetname = ostreetname;
	}

	public String getOapart() {
		return oapart;
	}

	public void setOapart(String oapart) {
		this.oapart = oapart;
	}

	public String getOtoot() {
		return otoot;
	}

	public void setOtoot(String otoot) {
		this.otoot = otoot;
	}

	public String getTovog() {
		return tovog;
	}

	public void setTovog(String tovog) {
		this.tovog = tovog;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTposname() {
		return tposname;
	}

	public void setTposname(String tposname) {
		this.tposname = tposname;
	}

	public String getTregister() {
		return tregister;
	}

	public void setTregister(String tregister) {
		this.tregister = tregister;
	}

	public String getTphone() {
		return tphone;
	}

	public void setTphone(String tphone) {
		this.tphone = tphone;
	}

	public String getApptype() {
		return apptype;
	}

	public void setApptype(String apptype) {
		this.apptype = apptype;
	}

	public byte[] getImage1() {
		return image1;
	}

	public void setImage1(byte[] image1) {
		this.image1 = image1;
	}

	public byte[] getImage2() {
		return image2;
	}

	public void setImage2(byte[] image2) {
		this.image2 = image2;
	}

	public byte[] getImage3() {
		return image3;
	}

	public void setImage3(byte[] image3) {
		this.image3 = image3;
	}

	public byte[] getImage4() {
		return image4;
	}

	public void setImage4(byte[] image4) {
		this.image4 = image4;
	}

	public byte[] getImage5() {
		return image5;
	}

	public void setImage5(byte[] image5) {
		this.image5 = image5;
	}

	public byte[] getImage6() {
		return image6;
	}

	public void setImage6(byte[] image6) {
		this.image6 = image6;
	}

	public byte[] getImage7() {
		return image7;
	}

	public void setImage7(byte[] image7) {
		this.image7 = image7;
	}

	public byte[] getImage8() {
		return image8;
	}

	public void setImage8(byte[] image8) {
		this.image8 = image8;
	}

	public byte[] getImage9() {
		return image9;
	}

	public void setImage9(byte[] image9) {
		this.image9 = image9;
	}

	public byte[] getImage10() {
		return image10;
	}

	public void setImage10(byte[] image10) {
		this.image10 = image10;
	}

	public byte[] getImage11() {
		return image11;
	}

	public void setImage11(byte[] image11) {
		this.image11 = image11;
	}

	public byte[] getImage12() {
		return image12;
	}

	public void setImage12(byte[] image12) {
		this.image12 = image12;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
