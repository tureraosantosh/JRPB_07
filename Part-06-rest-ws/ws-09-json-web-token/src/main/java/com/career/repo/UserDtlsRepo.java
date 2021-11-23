package com.career.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.career.entity.UserDtls;

public interface UserDtlsRepo  extends JpaRepository<UserDtls, Long>{
	
	
	UserDtls findByUsername(String username);

}
