package enda.web.controller;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.model.UploadedFile;

import enda.businessentity.Tool;
import enda.businesslogic.interfaces.IUserLogicLocal;
import enda.entity.Anket;
import enda.entity.Users;
import enda.entity.z_aimag;
import enda.entity.z_ctype;
import enda.entity.z_focus;
import enda.entity.z_horoo;
import enda.entity.z_middistrict;
import enda.entity.z_street;
import enda.entity.z_sym;

@SessionScoped
@ManagedBean(name = "userController")
public class UserSessionController implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static final String AUTH_KEY = "";
	
	@EJB(beanName = "UserLogic")
	IUserLogicLocal userLogic;
	
	@ManagedProperty(value="#{applicationController}")
	private ApplicationController applicationController;
	
	//USER REGISTER
	private Users user;
	private String email;
	private Users loggedUser;
	
	//ANKET
	private Anket anket1;
	private Anket anket2;
	private Anket anket3;
	
	private UploadedFile file1;
	private UploadedFile file2;
	private UploadedFile file3;
	private UploadedFile file4;
	private UploadedFile file5;
	private UploadedFile file6;
	private UploadedFile file7;
	private UploadedFile file8;
	private UploadedFile file9;
	private UploadedFile file10;
	private UploadedFile file11;
	private UploadedFile file12;
	
	//LISTS
	private List<z_aimag> listAimag;
	private List<z_ctype> listType;
	private List<z_focus> listFocus;
	private List<z_horoo> listHoroo;
	private List<z_middistrict> listMiddistrict;
	private List<z_street> listStreet;
	private List<z_sym> listSym;
	private List<z_sym> listSym2;
	private List<z_sym> olistSym2;
	private List<z_sym> olistSym1;
	private List<z_horoo> listHoroo2;
	private List<z_horoo> olistHoroo2;
	private List<z_horoo> olistHoroo1;
	private List<z_middistrict> olistMiddistrict2;
	private List<z_middistrict> olistMiddistrict1;
	private List<z_middistrict> listMiddistrict2;
	private List<z_sym> listSym3;
	private List<z_horoo> listHoroo3;
	private List<z_middistrict> listMiddistrict3;
	private List<z_sym> listSym1;
	private List<z_horoo> listHoroo1;
	private List<z_middistrict> listMiddistrict1;
	
	
	public UserSessionController(){
		super();	
	}
	
	@PostConstruct
	public void postConstruct(){
		
	}
	
	public ApplicationController getApplicationController() {
		return applicationController;
	}
	
	public void setApplicationController(
			ApplicationController applicationController) {
		this.applicationController = applicationController;
	}
	
	public void saveUser() {
		try {
			userLogic.saveUser(user);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public String setUrl(String url) {
		return url;
	}
	
	public void saveAnket1() {
		try {
			getAnket1().setApptype("ӨМ-1");
			getAnket1().setUsertype("ИРГЭН");
			if(this.file1.getFileName().length() != 0 && this.file2.getFileName().length() !=0){
				userLogic.saveAnket2(getAnket1());
				FacesContext context = FacesContext.getCurrentInstance();
		        context.addMessage(null, new FacesMessage("Successfull",  "Амжилттай хадгаллаа: Таны өргөдлийг "+getAnket1().getUserid()+" дугаараар бүртгэлээ" ) );
				setAnket1(null);
			}
			else{
				FacesContext context = FacesContext.getCurrentInstance();
		        context.addMessage(null, new FacesMessage("Warning",  "Файл оруулна уу" ) );
				
			}
		}catch(Exception ex) {
			
		}
	}
	
	public void saveAnket2() {
		try {
			getAnket2().setApptype("ӨМ-2");
			getAnket2().setUsertype("ИРГЭН");
			
			if(this.file9.getFileName().length() != 0 && this.file8.getFileName().length() != 0&& this.file7.getFileName().length() != 0
					&& this.file6.getFileName().length() != 0&& this.file5.getFileName().length() != 0&& this.file4.getFileName() !=null
					&& this.file3.getFileName().length() != 0&& this.file2.getFileName() !=null
					){
				userLogic.saveAnket2(getAnket2());
				FacesContext context = FacesContext.getCurrentInstance();
		        context.addMessage(null, new FacesMessage("Successful",  "Амжилттай хадгаллаа: Таны өргөдлийг "+getAnket2().getUserid()+" дугаараар бүртгэлээ" ) );
		        
				setAnket2(null);	}
			else{
				FacesContext context = FacesContext.getCurrentInstance();
		        context.addMessage(null, new FacesMessage("Warning",  "Файл оруулна уу" ) );
				
			}
			
		}catch(Exception ex) {
			
		}
	}
	
	public String login() {
		try {
			setLoggedUser(userLogic.login(email));
			return "customer_home";
		}catch(Exception ex) {
			
		}
		return "";
	}
	
	public Users getUser() {
		if(user == null) {
			user = new Users();
			user.setPkId(BigDecimal.ZERO);
		}
		return user;
	}
	
	public void setUser(Users user) {
		this.user = user;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Users getLoggedUser() {
		return loggedUser;
	}

	public void setLoggedUser(Users loggedUser) {
		this.loggedUser = loggedUser;
	}
	
	public Anket getAnket1() {
		if(anket1 == null) {
			anket1 = new Anket();
			if(getListAimag().size() > 0) {
				anket1.setAimagid(getListAimag().get(0).getAimagID());
				anket1.setOaimagid(getListAimag().get(0).getAimagID());
			}
			if(getListSym1().size() > 0) {
				anket1.setOsymid(getListSym1().get(0).getSymID());
			}
			if(getOlistSym1().size() > 0) {
				anket1.setOsymid(getOlistSym1().get(0).getSymID());
			}
		}
		return anket1;
	}
	
	public void setAnket1(Anket anket1) {
		this.anket1 = anket1;
	}
	
	public Anket getAnket2() {
		if(anket2 == null) {
			anket2 = new Anket();
			if(getListAimag().size() > 0) {
				anket2.setAimagid(getListAimag().get(0).getAimagID());
				anket2.setOaimagid(getListAimag().get(0).getAimagID());
			}
			if(getListSym2().size() > 0) {
				anket2.setOsymid(getListSym2().get(0).getSymID());
			}
			if(getOlistSym2().size() > 0) {
				anket2.setOsymid(getOlistSym2().get(0).getSymID());
			}
		}
		return anket2;
	}
	
	public void setAnket2(Anket anket2) {
		this.anket2 = anket2;
	}
	
	public Anket getAnket3() {
		if(anket3 == null) {
			anket2 = new Anket();
		}
		return anket3;
	}
	
	public void setAnket3(Anket anket3) {
		this.anket3 = anket3;
	}

	public List<z_aimag> getListAimag() {
		try {
			if(listAimag == null) {
				listAimag = userLogic.getAll(z_aimag.class);
			}
		}catch(Exception ex) {
			
		}
		return listAimag;
	}

	public void setListAimag(List<z_aimag> listAimag) {
		this.listAimag = listAimag;
	}

	public List<z_ctype> getListType() {
		try {
			if(listType == null) {
				listType = userLogic.getAll(z_ctype.class);
			}
		}catch(Exception ex) {
			
		}
		return listType;
	}

	public void setListType(List<z_ctype> listType) {
		this.listType = listType;
	}

	public List<z_focus> getListFocus() {
		try {
			if(listFocus == null) {
				listFocus = userLogic.getAll(z_focus.class);
			}
		}catch(Exception ex) {
			
		}
		return listFocus;
	}

	public void setListFocus(List<z_focus> listFocus) {
		this.listFocus = listFocus;
	}
	
	public List<z_horoo> getListHoroo3() {
		try {
			listHoroo3 = userLogic.getListHoroo(getAnket3().getAimagid(), getAnket3().getSymid());
		}catch(Exception ex) {
			
		}
		return listHoroo3;
	}
	
	public void setListHoroo3(List<z_horoo> listHoroo3) {
		this.listHoroo3 = listHoroo3;
	}
	
	public List<z_horoo> getListHoroo1() {
		try {
			listHoroo1 = userLogic.getListHoroo(getAnket1().getAimagid(), getAnket1().getSymid());
		}catch(Exception ex) {
			
		}
		return listHoroo1;
	}
	
	public void setListHoroo1(List<z_horoo> listHoroo1) {
		this.listHoroo1 = listHoroo1;
	}
	
	public List<z_horoo> getOlistHoroo1() {
		try {
			olistHoroo1 = userLogic.getListHoroo(getAnket1().getOaimagid(), getAnket1().getOsymid());
		}catch(Exception ex) {
			
		}
		return olistHoroo1;
	}
	
	public void setOlistHoroo1(List<z_horoo> olistHoroo1) {
		this.olistHoroo1 = olistHoroo1;
	}
	
	public List<z_horoo> getOlistHoroo2() {
		try {
			olistHoroo2 = userLogic.getListHoroo(getAnket2().getOaimagid(), getAnket2().getOsymid());
		}catch(Exception ex) {
			
		}
		return olistHoroo2;
	}
	
	public void setOlistHoroo2(List<z_horoo> olistHoroo2) {
		this.olistHoroo2 = olistHoroo2;
	}
	
	public List<z_horoo> getListHoroo2() {
		try {
			listHoroo2 = userLogic.getListHoroo(getAnket2().getAimagid(), getAnket2().getSymid());
		}catch(Exception ex) {
			
		}
		return listHoroo2;
	}
	
	public void setListHoroo2(List<z_horoo> listHoroo2) {
		this.listHoroo2 = listHoroo2;
	}

	public List<z_horoo> getListHoroo() {
		try {
			if(listHoroo == null) {
				listHoroo = userLogic.getAll(z_horoo.class);
			}
		}catch(Exception ex) {
			
		}
		return listHoroo;
	}

	public void setListHoroo(List<z_horoo> listHoroo) {
		this.listHoroo = listHoroo;
	}
	
	public List<z_middistrict> getListMiddistrict3() {
		try {
			listMiddistrict3 = userLogic.getListMid(getAnket3().getAimagid(), getAnket3().getSymid());
		}catch(Exception ex) {
			
		}
		return listMiddistrict3;
	}
	
	public void setListMiddistrict3(List<z_middistrict> listMiddistrict3) {
		this.listMiddistrict3 = listMiddistrict3;
	}
	
	public List<z_middistrict> getListMiddistrict1() {
		try {
			listMiddistrict1 = userLogic.getListMid(getAnket1().getAimagid(), getAnket1().getSymid());
		}catch(Exception ex) {
			
		}
		return listMiddistrict1;
	}
	
	public void setListMiddistrict1(List<z_middistrict> listMiddistrict1) {
		this.listMiddistrict1 = listMiddistrict1;
	}
	
	public void setOlistMiddistrict1(List<z_middistrict> olistMiddistrict1) {
		this.olistMiddistrict1 = olistMiddistrict1;
	}
	
	public List<z_middistrict> getOlistMiddistrict1() {
		try {
			olistMiddistrict1 = userLogic.getListMid(getAnket1().getOaimagid(), getAnket1().getOsymid());
		}catch(Exception ex) {
			
		}
		return olistMiddistrict1;
	}
	
	public List<z_middistrict> getOlistMiddistrict2() {
		try {
			olistMiddistrict2 = userLogic.getListMid(getAnket2().getOaimagid(), getAnket2().getOsymid());
		}catch(Exception ex) {
			
		}
		return olistMiddistrict2;
	}
	
	public void setOlistMiddistrict2(List<z_middistrict> olistMiddistrict2) {
		this.olistMiddistrict2 = olistMiddistrict2;
	}
	
	public List<z_middistrict> getListMiddistrict2() {
		try {
			listMiddistrict2 = userLogic.getListMid(getAnket2().getAimagid(), getAnket2().getSymid());
		}catch(Exception ex) {
			
		}
		return listMiddistrict2;
	}
	
	public void setListMiddistrict2(List<z_middistrict> listMiddistrict2) {
		this.listMiddistrict2 = listMiddistrict2;
	}

	public List<z_middistrict> getListMiddistrict() {
		try {
			if(listMiddistrict == null) {
				listMiddistrict = userLogic.getAll(z_middistrict.class);
			}
		}catch(Exception ex) {
			
		}
		return listMiddistrict;
	}

	public void setListMiddistrict(List<z_middistrict> listMiddistrict) {
		this.listMiddistrict = listMiddistrict;
	}

	public List<z_street> getListStreet() {
		try {
			if(listStreet == null) {
				listStreet = userLogic.getAll(z_street.class);
			}
		}catch(Exception ex) {
			
		}
		return listStreet;
	}

	public void setListStreet(List<z_street> listStreet) {
		this.listStreet = listStreet;
	}
	
	public List<z_sym> getListSym3() {
		try {
			listSym3 = userLogic.getListSym(getAnket3().getAimagid());
		}catch(Exception ex) {
			
		}
		return listSym3;
	}
	
	public void setListSym3(List<z_sym> listSym3) {
		this.listSym3 = listSym3;
	}
	
	public List<z_sym> getListSym1() {
		try {
			listSym1 = userLogic.getListSym(getAnket1().getAimagid());
		}catch(Exception ex) {
			
		}
		return listSym1;
	}
	
	public void setListSym1(List<z_sym> listSym1) {
		this.listSym1 = listSym1;
	}
	
	public List<z_sym> getOlistSym1() {
		try {
			olistSym1 = userLogic.getListSym(getAnket1().getOaimagid());
		}catch(Exception ex) {
			
		}
		return olistSym1;
	}
	
	public void setOlistSym1(List<z_sym> olistSym1) {
		this.olistSym1 = olistSym1;
	}
	
	public List<z_sym> getOlistSym2() {
		try {
			olistSym2 = userLogic.getListSym(getAnket2().getOaimagid());
		}catch(Exception ex) {
			
		}
		return olistSym2;
	}
	
	public void setOlistSym2(List<z_sym> olistSym2) {
		this.olistSym2 = olistSym2;
	}
	
	public List<z_sym> getListSym2() {
		try {
			listSym2 = userLogic.getListSym(getAnket2().getAimagid());
		}catch(Exception ex) {
			
		}
		return listSym2;
	}
	
	public void setListSym2(List<z_sym> listSym2) {
		this.listSym2 = listSym2;
	}

	public List<z_sym> getListSym() {
		try {
			if(listSym == null) {
				listSym = userLogic.getAll(z_sym.class);
			}
		}catch(Exception ex) {
			
		}
		return listSym;
	}

	public void setListSym(List<z_sym> listSym) {
		this.listSym = listSym;
	}

	public UploadedFile getFile1() {
		return file1;
	}

	public void setFile1(UploadedFile file1) {
		this.file1 = file1;
		if(file1 != null) getAnket1().setImage1(file1.getContents());
	}

	public UploadedFile getFile2() {
		return file2;
	}

	public void setFile2(UploadedFile file2) {
		this.file2 = file2;
		if(file2 != null) getAnket1().setImage2(file2.getContents());
	}

	public UploadedFile getFile3() {
		return file3;
	}

	public void setFile3(UploadedFile file3) {
		this.file3 = file3;
		if(file3 != null) getAnket2().setImage3(file3.getContents());
	}

	public UploadedFile getFile4() {
		return file4;
	}

	public void setFile4(UploadedFile file4) {
		this.file4 = file4;
		if(file4 != null) getAnket2().setImage4(file4.getContents());
	}

	public UploadedFile getFile5() {
		return file5;
	}

	public void setFile5(UploadedFile file5) {
		this.file5 = file5;
		if(file5 != null) getAnket2().setImage5(file5.getContents());
	}

	public UploadedFile getFile6() {
		return file6;
	}

	public void setFile6(UploadedFile file6) {
		this.file6 = file6;
		if(file6 != null) getAnket2().setImage6(file6.getContents());
	}

	public UploadedFile getFile7() {
		return file7;
	}

	public void setFile7(UploadedFile file7) {
		this.file7 = file7;
		if(file7 != null) getAnket2().setImage7(file7.getContents());
	}

	public UploadedFile getFile8() {
		return file8;
	}

	public void setFile8(UploadedFile file8) {
		this.file8 = file8;
		if(file8 != null) getAnket2().setImage8(file8.getContents());
	}

	public UploadedFile getFile9() {
		return file9;
	}

	public void setFile9(UploadedFile file9) {
		this.file9 = file9;
		if(file9 != null) getAnket2().setImage9(file9.getContents());
	}

	public UploadedFile getFile10() {
		return file10;
	}

	public void setFile10(UploadedFile file10) {
		this.file10 = file10;
		if(file10 != null) getAnket2().setImage10(file10.getContents());
	}

	public UploadedFile getFile11() {
		return file11;
	}

	public void setFile11(UploadedFile file11) {
		this.file11 = file11;
	}

	public UploadedFile getFile12() {
		return file12;
	}

	public void setFile12(UploadedFile file12) {
		this.file12 = file12;
		
	}

	
	
}
