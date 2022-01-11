package com.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.dao.UserDAO;
import com.demo.dto.UserDTO;

@Controller
public class UserController {

	
	@RequestMapping("/showRegister")
	public ModelAndView showRegister() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("registerInput.jsp");
		return mv;
	}
	
	@SuppressWarnings("resource")
	@RequestMapping("/saveRegister")
	public ModelAndView saveRegister(HttpServletRequest request) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/demo/jdbc/config.xml");
		UserDAO userDao = context.getBean("userDao",UserDAO.class);
		final String userName = request.getParameter("userName");
		final String password = request.getParameter("password");
		final String email = request.getParameter("email");
		
		UserDTO dto = new UserDTO();
		dto.setUserName(userName);
		dto.setPassword(password);
		dto.setEmail(email);
		
		int result = userDao.registerUser(dto);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("registerResult.jsp");
		mv.addObject("result","User added "+result);
		return mv;
	}
}
