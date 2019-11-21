package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

	@Autowired
	LoginDao loginDao;
	
	public String checkUser(Login ll) {
			if(loginDao.checkUser(ll)>0) {
					return "success";
			}else {
				return "failure";
			}
	}
}
