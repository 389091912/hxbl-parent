package com.team.admin.server.service;

import com.team.admin.server.dto.UserDto;
import com.team.admin.server.model.User;

public interface UserService {

	User saveUser(UserDto userDto);
	
	User updateUser(UserDto userDto);

	String passwordEncoder(String credentials, String salt);

	User getUser(String username);

	void changePassword(String username, String oldPassword, String newPassword);

}
