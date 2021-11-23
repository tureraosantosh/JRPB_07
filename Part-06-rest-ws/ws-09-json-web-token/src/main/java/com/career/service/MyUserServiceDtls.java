package com.career.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.career.entity.UserDtls;
import com.career.repo.UserDtlsRepo;

@Service
public class MyUserServiceDtls  implements UserDetailsService{

	@Autowired
	private UserDtlsRepo userDtlsRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {		
		 UserDtls userDtls = userDtlsRepo.findByUsername(username); 
		 if(userDtls==null) {
			 throw new UsernameNotFoundException("User Not Found !!");
		 }
		  UserDetails userDetails = User.withUsername(userDtls.getUsername())
		  .password(userDtls.getPassword())
		  .authorities(userDtls.getRole())
		  .build();		 
		 return userDetails;
	}

}
