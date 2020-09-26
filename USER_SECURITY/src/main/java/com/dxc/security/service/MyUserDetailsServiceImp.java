package com.dxc.security.service;

import org.springframework.beans.factory.annotation.Autowired


;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dxc.security.pojo.User;
import com.dxc.security.repository.UserRepository;



@Service
public class MyUserDetailsServiceImp implements UserDetailsService {

	@Autowired
	UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user =   repo.findByUsername(username);
		
		
		
		if(user == null)
			throw new UsernameNotFoundException("User Not Found 404");
		
		
		
		return new UserPrinciple(user);
	}

}
