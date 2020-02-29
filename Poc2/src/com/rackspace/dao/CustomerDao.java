package com.rackspace.dao;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.racksapace.dto.RegDto;

public class CustomerDao {
	
	public ArrayList<RegDto> userdetails(){
		
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session s= sf.openSession();
		Transaction tx = s.beginTransaction();
		Query q = s.createQuery("from RegDto");
		ArrayList<RegDto> li = (ArrayList<RegDto>) q.list();
		
		
		
				return li;

}
}