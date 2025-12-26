package com.security.auth.service;

import com.security.auth.model.LoginRequest;
import com.security.auth.model.LoginResponse;

public interface LoginService {
	
	LoginResponse login(LoginRequest request);

}
