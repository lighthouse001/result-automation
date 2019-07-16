package com.lighthouse.resultautomation.controller;

import com.lighthouse.resultautomation.model.request.SignUpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.lighthouse.resultautomation.service.AuthService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

	AuthService authService;

	@Autowired
	public AuthController(AuthService authService) {
		this.authService = authService;
	}
	
	@PostMapping("/signup")
	public String signUp(@RequestBody SignUpRequest signUpRequest) {
		String result = authService.signUp(signUpRequest);
		return result;
	}
}
