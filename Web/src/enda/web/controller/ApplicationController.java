package enda.web.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.ProjectStage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import enda.businesslogic.interfaces.IUserLogicLocal;
import enda.entity.NewUsers;

@ApplicationScoped
@ManagedBean(name="applicationController")
public class ApplicationController implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String cssPath = "/resource/css/source/";
	private String jsPath = "/resource/js/source/";
	private String path = "/resource/js/source/";
	private boolean listCash;
	
	@EJB(beanName = "UserLogic")
	IUserLogicLocal userLogic;
	
	public ApplicationController(){
		
	}
	
	@PostConstruct
	public void postConstruct(){
		
		FacesContext fc = FacesContext.getCurrentInstance();
		HttpServletRequest request = (HttpServletRequest)fc.getExternalContext().getRequest();
		if(fc.isProjectStage(ProjectStage.Production)){
			setCssPath(request.getContextPath() + "/");
			setJsPath(request.getContextPath() + "/");
			setPath(request.getContextPath() + "/");
		}else {
			setCssPath(request.getContextPath() + "/");
			setJsPath(request.getContextPath() + "/");
			setPath(request.getContextPath() + "/");
		}
		
		try {
			//System.out.println(mn.mta.pos.exam.BridgePosAPI.test());
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public String url(String url){
		return url;
	}

	public String getCssPath() {
		return cssPath;
	}

	public void setCssPath(String cssPath) {
		this.cssPath = cssPath;
	}

	public String getJsPath() {
		return jsPath;
	}

	public void setJsPath(String jsPath) {
		this.jsPath = jsPath;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public boolean isListCash() {
		if(listCash){
			listCash = false;
			return true;
		}
		return listCash;
	}

	public void setListCash(boolean listCash) {
		this.listCash = listCash;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
