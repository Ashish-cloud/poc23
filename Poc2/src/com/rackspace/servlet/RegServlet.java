package com.rackspace.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.racksapace.dto.RegDto;
import com.racksapce.service.RegService;

public class RegServlet implements Servlet {

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
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		Integer Id = Integer.parseInt(req.getParameter("Id"));
        String cname = req.getParameter("cname");
        String Gender = req.getParameter("Gender");
        String city = req.getParameter("city");
        String Account_Type = req.getParameter("Account_Type");
        String MailID = req.getParameter("MailID");
        String Phone_Number = req.getParameter("Phone_Number");
        RegDto rdo = new RegDto(Id,cname,Gender,city,Account_Type,MailID,Phone_Number);
		RegService rs = new RegService();
		boolean val = rs.RegisterUserDao(rdo);
		if(val) {
			RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/JSP/home.jsp");
			rd.forward(req, resp);
			
			
			
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/JSP/register.jsp");
			rd.forward(req, resp);
		}
		
	}

}
