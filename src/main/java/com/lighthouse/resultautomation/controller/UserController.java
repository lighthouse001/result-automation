package com.lighthouse.resultautomation.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lighthouse.resultautomation.model.User;
import com.lighthouse.resultautomation.service.UserService;


@Controller
public class UserController {
	
	@Autowired
	UserService service;
	User user;

	@RequestMapping("/adduser")
	public String adduser()
	{
		return "index";
	}
	
	@PostMapping("/adduser")
	public String adduser(@ModelAttribute User user, BindingResult bindingResult, HttpServletRequest request) {
		service.savemyuser(user);
		return "index";
	}
	
}
