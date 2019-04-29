package com.crestasom.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	@RequestMapping("home")
	public String show(HttpServletRequest request) {
		String name=request.getParameter("name");
		HttpSession session=request.getSession();
		System.out.println("Hi"+name);
		session.setAttribute("name", name);
		return "home";
	}

}
