package com.cts.fsd.plms.user.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.fsd.plms.user.service.UserService;
import com.cts.fsd.plms.user.domain.model.UserInfo;
import com.cts.fsd.plms.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired	
	private UserRepository userRepository;
	
	@Override
	public List<UserInfo> getUserInfoList() {
		return userRepository.findAll();
	}

	@Override
	public UserInfo getUserInfoByKey(long userKey) {
		return userRepository.findOne(userKey);
	}

	@Override
	public UserInfo getUserInfoByName(String userName) {
		return userRepository.findByUserName(userName);
	}

}
