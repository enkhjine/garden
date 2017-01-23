package garden.web.controller;

import garden.businessentity.LoggedUser;
import garden.businessentity.Message;
import garden.businessentity.Tool;
import garden.businesslogic.interfaces.IUserLogicLocal;
import garden.entity.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;

@SessionScoped
@ManagedBean(name = "userController")
public class UserSessionController implements Serializable {
	
	public static final String AUTH_KEY = "none";
	public static final String urlList = "";
	
	@EJB(beanName = "UserLogic")
	IUserLogicLocal userLogic;
	
	//Propertys begin
	private LoggedUser loggedInfo;
	private Message message;
	private List<Menu> menus;
	private String showMessage;
	private String errorMessage;
	private String warningMessage;
	private List<Menu> listMenu;
	private String title;
	private String davaadorj;
	private String checkStr;
	private String checkLogin;
	//Propertys end
	
	private Integer currentYear;
	private Integer currentMonth;
	private Integer currentDay;
	private BigDecimal currentEmployeePkId;
	
	@ManagedProperty(value="#{applicationController}")
	private ApplicationController applicationController;
	
	@PostConstruct
	public void postConstruct(){
		initData();
	}
	
	//InitData
	public void initData(){
		try{

			List<Menu> list = userLogic.getMenus();
			String str = "Garden/";
			for (Menu menu : list) {
				str = str + "::" + menu.getUrl();
			}

			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put(urlList, str);
		}catch(Exception ex){
			showErrorMessage(ex.getMessage());
			ex.printStackTrace();
		}
		loggedInfo = new LoggedUser();
	}
	
	public void daa(){
		System.out.println("Daa");
		try{
			
		}catch(Exception ex){
			
		}
	}
	
	public void showMessage(int index){
		if(getMessage().getMessage(index).getType().equals(Tool.msgSuccess)) setShowMessage(getMessage().getMessage(index).getName());
		if(getMessage().getMessage(index).getType().equals(Tool.msgWarning)) setWarningMessage(getMessage().getMessage(index).getName());
		if(getMessage().getMessage(index).getType().equals(Tool.msgError)) setErrorMessage(getMessage().getMessage(index).getName());
		RequestContext context = RequestContext.getCurrentInstance();
		context.execute("showMessage();");
	}
	
	private void showExpireDateMessage(String message){
		setShowMessage(message);
		RequestContext context = RequestContext.getCurrentInstance();
		context.execute("showMessage();");
	}
	
	public void showErrorMessage(String message){
		setWarningMessage(message);
		RequestContext context = RequestContext.getCurrentInstance();
		context.execute("showMessage();");
	}
	
	public void showSuccessMessage(String message){
		setShowMessage(message);
		RequestContext context = RequestContext.getCurrentInstance();
		context.execute("showMessage();");
	}
	
	public void showWarningMessage(String message){
		setWarningMessage(message);
		RequestContext context = RequestContext.getCurrentInstance();
		context.execute("showMessage();");
	}
	

	
	public String login(){
		String ret = "";
		try{
			LoggedUser user = userLogic.login(loggedInfo);
//			Date currentDate = new Date();
//			Date expireDate = getLicenseDate();
//			if(currentDate.before(expireDate)){
//				int day = Tool.daysBetween(currentDate, expireDate);
//				if(day < 11){
//					showExpireDateMessage("�?мжилттай н�?вт�?рл�?�?. Си�?темийн хугацаа дуу�?ахад " 
//						+ day + " хоног үлд�?�?н байна.");
//				}
//			} else {
//				throw new Exception("Out of date");
//			}
					
			loggedInfo = user;
			showMessage(0);
			
			List<Menu> list = userLogic.getMenusFilter(loggedInfo);
			String str = "Garden/";
			for (Menu menu : list) {
				str = str + "::" + menu.getUrl();
			}

			
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put(urlList, str);
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put(AUTH_KEY, "login");
			menus = userLogic.getMenus(loggedInfo);
			listMenu = userLogic.getListMenus(loggedInfo);
			
			if(menus.size() >= 1){
				ret = menus.get(0).getId();
				title = menus.get(0).getName();
			}else {
				ret = "user_list";		
			}	
			setCheckLogin("Success");
			
		}catch(Exception ex){
			if("NONE".equals(ex.getMessage())){
				showMessage(1);
			} else if ("Out of date".equals(ex.getMessage())){
				showMessage(68);
			} else {
				showErrorMessage(ex.getMessage());
			}
		}		
		
		return ret;
	}
	public String logout(){
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		System.out.println("LOGOUT");
		return "login";
	}
	
	//CheckLogin NULL
	public void CheckLogin(){
		setCheckLogin(null);
	}
	
	public String getUrl(String url){
		for (Menu item : listMenu) {
			if(item.getId().equals(url)) return url;
		}
		if(getMenus().size() > 0) getMenus().get(0).getId();
		return url;
	}

	public LoggedUser getLoggedInfo() {
		return loggedInfo;
	}

	public void setLoggedInfo(LoggedUser loggedInfo) {
		this.loggedInfo = loggedInfo;
	}
	
	public ApplicationController getApplicationController() {
		return applicationController;
	}
	
	public void setApplicationController(
			ApplicationController applicationController) {
		this.applicationController = applicationController;
	}

	public Message getMessage() {
		if(message == null) message = new Message();
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	public String getShowMessage() {
		String ret = showMessage;
		showMessage = "";
		return ret;
	}

	public void setShowMessage(String showMessage) {
		this.showMessage = showMessage;
	}

	public String getErrorMessage() {
		String ret = errorMessage;
		errorMessage = "";
		return ret;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getWarningMessage() {
		String ret = warningMessage;
		warningMessage = "";
		return ret;
	}

	public void setWarningMessage(String warningMessage) {
		this.warningMessage = warningMessage;
	}

	public List<Menu> getListMenu() {
		return listMenu;
	}

	public void setListMenu(List<Menu> listMenu) {
		this.listMenu = listMenu;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getCurrentYear() {
		return currentYear;
	}

	public void setCurrentYear(Integer currentYear) {
		this.currentYear = currentYear;
	}

	public Integer getCurrentMonth() {
		return currentMonth;
	}

	public void setCurrentMonth(Integer currentMonth) {
		this.currentMonth = currentMonth;
	}

	public Integer getCurrentDay() {
		return currentDay;
	}

	public void setCurrentDay(Integer currentDay) {
		this.currentDay = currentDay;
	}

	public BigDecimal getCurrentEmployeePkId() {
		return currentEmployeePkId;
	}

	public void setCurrentEmployeePkId(BigDecimal currentEmployeePkId) {
		this.currentEmployeePkId = currentEmployeePkId;
	}
	
	public String getDavaadorj() {
		return davaadorj;
	}
	
	public void setDavaadorj(String davaadorj) {
		this.davaadorj = davaadorj;
	}

	public String getCheckStr() {
		return checkStr;
	}

	public void setCheckStr(String checkStr) {
		this.checkStr = checkStr;
	}

	public String getCheckLogin() {
		return checkLogin;
	}

	public void setCheckLogin(String checkLogin) {
		this.checkLogin = checkLogin;
	}

	
}
