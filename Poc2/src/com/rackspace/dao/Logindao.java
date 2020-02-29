package com.rackspace.dao;


import org.hibernate.Query;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.racksapace.dto.LoginDto;
import org.hibernate.Query;
public class Logindao {
	
	public List<LoginDto>  IsValidUser(String username , String password)  {
		
	/*	LoginDto dt = new LoginDto();
		dt.setUsername("Ashish");
		dt.setPassword("1234");  */
		
		
		Configuration conf = new AnnotationConfiguration();
		conf.configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session s= sf.openSession();
		Transaction tx = s.beginTransaction();
		
		
		System.out.println(username+password);
		Query q = s.createQuery("from LoginDto where username='"+username+"' and password = '"+password+"' ");
		List<LoginDto> dto = q.list();
		
	
		
		return dto;
	}
	
	
	

}
