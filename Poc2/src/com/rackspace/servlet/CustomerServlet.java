package com.rackspace.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.racksapace.dto.RegDto;
import com.racksapce.service.CustomerService;

public class CustomerServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		CustomerService cs = new CustomerService();
		ArrayList<RegDto> al = cs.userdetails();
		for(RegDto rd : al) {
			System.out.println(rd.getId()+" "+rd.getCname()+" "+ rd.getGender()+" "+rd.getCity()+rd.getAccount_Type()+" "+rd.getMailID()+" "+rd.getPhone_Number());
			
		}
		if(!al.isEmpty()) {
			req.setAttribute("sucess", al);
			RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/JSP/Customer.jsp");
			rd.forward(req, resp);
		}else {
			req.setAttribute("fail", "Not created");
			RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/JSP/home.jsp");
			rd.forward(req, resp);
		}
	}

}
