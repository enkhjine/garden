package enda.web.controller;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import enda.businesslogic.interfaces.IUserLogicLocal;
import enda.entity.Users;

@RequestScoped
@ManagedBean(name = "tnoController")
public class TnoSessionController implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static final String AUTH_KEY = "";
	
	@EJB(beanName = "UserLogic")
	IUserLogicLocal userLogic;
	
	@ManagedProperty(value="#{applicationController}")
	private ApplicationController applicationController;
	
	//USER REGISTER
	private Users user;
	private String email;
	private String home = "index";
	private String changeanket ="/blank.xhtml";
	
	
	public TnoSessionController(){
		super();
		
	}
	
	@PostConstruct
	public void postConstruct(){
		
	}
	
	
	
	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getChangeanket() {
		return changeanket;
	}

	public void setChangeanket(String changeanket) {
		this.changeanket = changeanket;
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
	
	
	
}
