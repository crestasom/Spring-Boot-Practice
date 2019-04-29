package com.crestasom.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	/*
	 * @RequestMapping("home") public String show(HttpServletRequest request) {
	 * String name=request.getParameter("name"); HttpSession
	 * session=request.getSession(); System.out.println("Hi"+name);
	 * session.setAttribute("name", name); return "home"; }
	 */
	
	/*
	 * @RequestMapping("home") public ModelAndView show(@RequestParam("name")String
	 * name,HttpSession session) { ModelAndView mv=new ModelAndView();
	 * mv.setViewName("home"); mv.addObject("name",name);
	 * System.out.println("Hi"+name); //session.setAttribute("name", name); return
	 * mv; }
	 */
	
	
	@RequestMapping("home")
	public ModelAndView show(Student s) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("home");
		mv.addObject("student",s);
		//System.out.println("Hi"+name);
		//session.setAttribute("name", name);
		return mv;
	}

}
