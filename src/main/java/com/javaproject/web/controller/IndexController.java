package com.javaproject.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class IndexController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("123123123123123123");
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", "hello");
		mv.setViewName("index.jsp");
		return mv;
	}
	
}
