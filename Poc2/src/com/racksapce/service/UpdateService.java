package com.racksapce.service;

import com.racksapace.dto.RegDto;
import com.rackspace.dao.UpdateDao;

public class UpdateService {
	
	public boolean updatecustomer(RegDto rd) {
		
		UpdateDao ud = new UpdateDao();
		boolean upval = ud.updatecustomer(rd);
		
		
		
	
		return upval;
		
	}
}
