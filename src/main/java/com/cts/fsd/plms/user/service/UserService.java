package com.cts.fsd.plms.user.service;

import java.util.List;

import com.cts.fsd.plms.user.domain.model.UserInfo;

public interface UserService {

	public List<UserInfo> getUserInfoList();
	
	public UserInfo getUserInfoByKey(long userKey);
	
	public UserInfo getUserInfoByName(String userName);
	
}
