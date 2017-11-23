package com.cts.fsd.plms.authentication.service;

public interface SecurityService {
	String findLoggedInUsername();

	void autologin(String username, String password);
}
