package com.racksapce.service;

import java.util.ArrayList;

import com.racksapace.dto.RegDto;
import com.rackspace.dao.CustomerDao;

public class CustomerService {
	
	public ArrayList<RegDto> userdetails(){
		CustomerDao cd = new CustomerDao();
		ArrayList<RegDto> al = cd.userdetails();
		
		
		
		
		return al;
		
	}

}
