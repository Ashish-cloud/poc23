package com.rackspace.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.racksapace.dto.LoginDto;
import com.racksapce.service.LoginService;



public class LoginServlet implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		LoginService ls = new LoginService();
		List<LoginDto> dto = ls.IsValidUser(username, password);
		if(!dto.isEmpty()) {
			RequestDispatcher rdp = req.getRequestDispatcher("/WEB-INF/JSP/home.jsp");
			rdp.forward(req, res);

			}else {
				RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/JSP/error.jsp");
				rd.forward(req, res);
			}
			
		
	}

}
