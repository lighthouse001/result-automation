package com.lighthouse.resultautomation.service;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.lighthouse.resultautomation.model.User;
import com.lighthouse.resultautomation.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	private final UserRepository userrepo;
	
	public UserService(UserRepository userrepo) {
		this.userrepo = userrepo;
	}
	
	public void savemyuser(User user) 
	{
		userrepo.save(user);
	}

}
