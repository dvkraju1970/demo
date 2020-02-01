package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.LoginService;
import com.example.demo.vo.User;

@Controller
@RequestMapping("/Entry/")
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@PostMapping("validation")
	public ModelAndView Login(User user) {
		ModelAndView mav=new ModelAndView();
		if(loginService.validation(user))
			mav.setViewName("success");
		else
			mav.setViewName("failure");
		return mav;
	}
	
	@GetMapping("")
	public ModelAndView LoginForm()
	{
		return new ModelAndView("login");
	}
	
}
