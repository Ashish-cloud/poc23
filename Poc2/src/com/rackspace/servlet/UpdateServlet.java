package com.rackspace.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.racksapace.dto.RegDto;
import com.racksapce.service.UpdateService;

public class UpdateServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer Id = Integer.parseInt(req.getParameter("Id"));
        String cname = req.getParameter("cname");
        String Gender = req.getParameter("Gender");
        String city = req.getParameter("city");
        String Account_Type = req.getParameter("Account_Type");
        String MailID = req.getParameter("MailID");
        String Phone_Number = req.getParameter("Phone_Number");
        RegDto rdt = new RegDto(Id, cname, Gender, city, Account_Type, MailID, Phone_Number);
        UpdateService us= new UpdateService();
        boolean status = us.updatecustomer(rdt);
        if(status==true) {
        	RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/JSP/home.jsp");
        	rd.forward(req, resp);
        }else {
        	RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/JSP/update.jsp");
        	rd.forward(req, resp);
        }
	}

}
