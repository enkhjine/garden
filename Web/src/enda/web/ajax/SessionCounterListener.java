package enda.web.ajax;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


public class SessionCounterListener implements HttpSessionListener {

	private static int totalActiveSessions;
	
	public static int getTotalActiveSession(){
		return totalActiveSessions;
	}
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		totalActiveSessions++;
//		HttpSession session = se.getSession();
//		System.out.println((new Date()) + " (session) Created:");
//		System.out.println("ID=" + session.getId() + " MaxInactiveInterval=" + session.getMaxInactiveInterval());
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		totalActiveSessions--;
//		HttpSession session = se.getSession();
//		//String sss = FacesContext.getCurrentInstance().getApplication().evaluateExpressionGet(FacesContext.getCurrentInstance(), "#{userController.logout()}", String.class);
//		LoggedUser loggedUser = FacesContext.getCurrentInstance().getApplication().evaluateExpressionGet(FacesContext.getCurrentInstance(), "#{userController.loggedInfo}", LoggedUser.class);
//		
//		System.out.println((new Date()) + " (session) Destroyed:ID=" + session.getId());
//		System.out.println("sessionDestroyed - deduct one session from counter");
	}
}
