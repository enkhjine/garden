package enda.web.filter;

import java.io.IOException;

import javax.faces.application.ConfigurableNavigationHandler;
import javax.faces.context.FacesContext;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import enda.web.controller.UserSessionController;

public class AuthenticationFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
//		HttpServletRequest request = (HttpServletRequest) arg0;
//
//		arg2.doFilter(arg0, arg1);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

	public void setUrl(String url) {
		FacesContext fc = FacesContext.getCurrentInstance();
		ConfigurableNavigationHandler nav = (ConfigurableNavigationHandler) fc
				.getApplication().getNavigationHandler();
		nav.performNavigation(url);
	}

}
