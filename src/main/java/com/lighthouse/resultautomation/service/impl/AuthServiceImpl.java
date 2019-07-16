package com.lighthouse.resultautomation.service.impl;

import com.lighthouse.resultautomation.model.User;
import com.lighthouse.resultautomation.model.request.SignUpRequest;
import com.lighthouse.resultautomation.repository.UserRepository;
import com.lighthouse.resultautomation.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;
import java.util.Optional;

@Service
public class AuthServiceImpl implements AuthService {

    public static final String SUCCESS = "Success";
    public static final String ALREADY_EXISTS = "Already exists";

    private UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public AuthServiceImpl(UserRepository userRepository,
                           PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public String signUp(SignUpRequest signUpRequest) {
        Optional<User> checkedUser = userRepository.findByEmail(signUpRequest.getEmail());
        if(!checkedUser.isPresent()){
            User user = new User(signUpRequest.getName(), signUpRequest.getUserName(), signUpRequest.getEmail(),
                    passwordEncoder.encode(signUpRequest.getPassword()));

            userRepository.save(user);
            return SUCCESS;
        }
        return ALREADY_EXISTS;
    }
}
