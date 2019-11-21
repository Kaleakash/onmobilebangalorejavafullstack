package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@RequestMapping(value = "checkLogin",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			method =RequestMethod.POST,
			produces = MediaType.TEXT_PLAIN_VALUE)
	public String checkLogin(@RequestBody Login ll) {
		return loginService.checkUser(ll);
	}
}
