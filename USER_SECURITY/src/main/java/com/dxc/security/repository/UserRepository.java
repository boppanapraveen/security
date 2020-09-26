package com.dxc.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.security.pojo.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
				
				User 	findByUsername(String username);
						
	

}
