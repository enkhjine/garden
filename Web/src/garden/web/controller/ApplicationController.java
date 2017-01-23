package garden.web.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.ProjectStage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ApplicationScoped
@ManagedBean(name = "applicationController")
public class ApplicationController implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String cssPath = "/resource/css/source/";
	private String jsPath = "/resource/js/source/";
	private String path = "/resource/js/source/";
	private String imagePath = "D:/MedITm/Rentgen/";
	private String inspectionImagePath = "D:/MedITm/";
	private boolean listCash;
	private List<String> diagnoseTypeList;

	private volatile int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public ApplicationController() {

	}

	public void test() {
		System.out.println("OUT : ");
	}
	
	public void test(String text) {
		System.out.println("OUT : " + text);
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("ApplicationController : initData");
		FacesContext fc = FacesContext.getCurrentInstance();
		HttpServletRequest request = (HttpServletRequest) fc.getExternalContext().getRequest();
		if (fc.isProjectStage(ProjectStage.Production)) {
			setCssPath(request.getContextPath() + "/resource/css/source/");
			setJsPath(request.getContextPath() + "/resource/js/source/");
			setPath(request.getContextPath() + "/resource/");
		} else {
			setCssPath(request.getContextPath() + "/resource/css/source/");
			setJsPath(request.getContextPath() + "/resource/js/source/");
			setPath(request.getContextPath() + "/resource/");
		}
		// sendData();
		System.out.println("ApplicationController : initData");
	}
	
	public String url(String url) {
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
		if (listCash) {
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

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public List<String> getDiagnoseTypeList() {
		if (diagnoseTypeList == null) {
			try {
				diagnoseTypeList = new ArrayList<String>();
				diagnoseTypeList.add("A");
				diagnoseTypeList.add("B");
				diagnoseTypeList.add("C");
				diagnoseTypeList.add("D");
				diagnoseTypeList.add("E");
				diagnoseTypeList.add("F");
				diagnoseTypeList.add("G");
				diagnoseTypeList.add("H");
				diagnoseTypeList.add("I");
				diagnoseTypeList.add("J");
				diagnoseTypeList.add("K");
				diagnoseTypeList.add("L");
				diagnoseTypeList.add("M");
				diagnoseTypeList.add("N");
				diagnoseTypeList.add("O");
				diagnoseTypeList.add("P");
				diagnoseTypeList.add("Q");
				diagnoseTypeList.add("R");
				diagnoseTypeList.add("S");
				diagnoseTypeList.add("T");
				diagnoseTypeList.add("U");
				diagnoseTypeList.add("V");
				diagnoseTypeList.add("W");
				diagnoseTypeList.add("X");
				diagnoseTypeList.add("Y");
				diagnoseTypeList.add("Z");
				// diagnoseTypeList = infoLogic.getDiagnoseTypeList();
			} catch (Exception ex) {

			}
		}
		return diagnoseTypeList;
	}

	public void setDiagnoseTypeList(List<String> diagnoseTypeList) {
		this.diagnoseTypeList = diagnoseTypeList;
	}

	public String getInspectionImagePath() {
		return inspectionImagePath;
	}

	public void setInspectionImagePath(String inspectionImagePath) {
		this.inspectionImagePath = inspectionImagePath;
	}
}