package com.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleInterestController {

	@RequestMapping("/simpleInterestInput")
	public ModelAndView simpleInterestInput() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("simpleInterestInput.jsp");
		return mv;
	}
	
	@RequestMapping("/simpleInterest")
	public ModelAndView simpleInterestCalc(HttpServletRequest request) {
		int pa = Integer.parseInt(request.getParameter("pa"));
		int year = Integer.parseInt(request.getParameter("year"));
		int roi = Integer.parseInt(request.getParameter("roi"));
		int result = (pa * year * roi)/100;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("simpleInterest.jsp");
		mv.addObject("result",result);
		return mv;
	}
}
