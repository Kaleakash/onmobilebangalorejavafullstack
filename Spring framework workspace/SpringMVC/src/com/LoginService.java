package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

	@Autowired
	LoginDao logingDao;
	
	public String checkUser(Login ll) {
		if(logingDao.checkUser(ll)>0) {
			return "Success";
		}else {
			return "Failure";
		}
	}
}
