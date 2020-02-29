package com.racksapce.service;

import java.sql.SQLException;
import java.util.List;

import com.racksapace.dto.LoginDto;
import com.rackspace.dao.Logindao;

public class LoginService {
	public List<LoginDto> IsValidUser(String username, String password)  {
		
		Logindao ld= new Logindao();
		List<LoginDto> dto = ld.IsValidUser(username, password);
		
		return dto;
		
	}

}
