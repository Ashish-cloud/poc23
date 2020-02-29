package com.racksapce.service;

import com.racksapace.dto.RegDto;
import com.rackspace.dao.RegDao;

public class RegService {
	public boolean RegisterUserDao(RegDto rd) {
		
		RegDao rdo = new RegDao();
		boolean val = rdo.RegisterUserDao(rd);
		return val;
		
	}

}
