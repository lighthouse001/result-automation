package com.lighthouse.resultautomation.service;

import com.lighthouse.resultautomation.model.request.SignUpRequest;

public interface AuthService {
	/**
	 * Return signup status result
	 *
	 * @param signUpRequest request parameters for signup.
	 * @return
	 */
	String signUp(SignUpRequest signUpRequest);
}
