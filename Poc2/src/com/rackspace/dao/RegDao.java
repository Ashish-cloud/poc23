package com.rackspace.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.racksapace.dto.RegDto;

public class RegDao {
	
	public static boolean RegisterUserDao(RegDto rd) {
		boolean val = false;
		Configuration conf = new AnnotationConfiguration();
		conf.configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		RegDto rdt = new RegDto();
		rdt.setId(rd.getId());
		rdt.setCname(rd.getCname());
		rdt.setGender(rd.getGender());
		rdt.setCity(rd.getCity());
		rdt.setAccount_Type(rd.getAccount_Type());
		rdt.setMailID(rd.getMailID());
		rdt.setPhone_Number(rd.getPhone_Number());
		
		Serializable sz = s.save(rdt);
		if(s!=null) {
			val = true;
			
		}
		
		tx.commit();
		s.close();
		sf.close();
		
		return val;
		
	}

}
