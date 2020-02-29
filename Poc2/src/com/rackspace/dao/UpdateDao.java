package com.rackspace.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.racksapace.dto.RegDto;

public class UpdateDao {
	public boolean updatecustomer(RegDto rd) {
		
		boolean upval = false;
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx  = s.beginTransaction();
	    Query q =	s.createQuery("update RegDto set cname=:cname, Gender=:Gender,city=:city, Account_Type=:Account_Type, MailID=:MailID, Phone_Number=:Phone_Number where Id=:Id ");
		
		q.setParameter("cname", rd.getCname());
		q.setParameter("Gender", rd.getGender());
		q.setParameter("city", rd.getCity());
		q.setParameter("Account_Type", rd.getAccount_Type());
		q.setParameter("MailID", rd.getMailID());
		q.setParameter("Phone_Number", rd.getPhone_Number());
		q.setParameter("Id", rd.getId());
		Integer rowcount = q.executeUpdate();
		if(rowcount==0) {
			return upval;
		} else {
			upval = true;
		}
		tx.commit();
		s.close();
		sf.close();
		
		return upval;
		
	}
	

}
