package com;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DemoController {

	@RequestMapping(value = "hello")
	public ModelAndView sayHello() {
		ModelAndView mav= new ModelAndView();
		System.out.println("I CAme Here!");
		mav.setViewName("display.jsp");
		return mav;
	}
	
	@RequestMapping(value = "check",method = RequestMethod.POST)
public ModelAndView checkLoginDetails(HttpServletRequest req,
		Login ll) {
		ModelAndView mav= new ModelAndView();
		String user = req.getParameter("user");
		String pass = req.getParameter("pass");
		
		ll.setUser(user);
		ll.setPass(pass);
		
	if(ll.getUser().equals("Raj") && ll.getPass().equals("Kumar")) {
			mav.addObject("obj", ll.getUser());
			//req.setAttribute("obj","Ajay");
			mav.setViewName("success.jsp");
		}else {
			mav.setViewName("failure.jsp");
		}
		return mav;
	}
	
	@RequestMapping(value = "openForm")
	public ModelAndView openForm(Login login) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("ll", login);
		System.out.println("Login Page Open");
		mav.setViewName("login.jsp");
		return mav;
	}
	
	@Autowired
	LoginService loginService;
	
	
	@RequestMapping(value = "checkUser")
	public ModelAndView checkUser(Login ll) {
		ModelAndView mav = new ModelAndView();
		if(loginService.checkUser(ll).equals("Success")) {
			mav.addObject("obj", ll.getUser());
			mav.setViewName("success.jsp");
		}else {
			mav.setViewName("failure.jsp");
		}
		return mav;
	}
}
