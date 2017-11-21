package com.cts.fsd.plms.user.repository;

import org.springframework.data.jpa.repository.*;

import com.cts.fsd.plms.user.domain.model.UserInfo;

public interface UserRepository extends JpaRepository<UserInfo, Long> {

	UserInfo findByUserName(String userName);
	
}