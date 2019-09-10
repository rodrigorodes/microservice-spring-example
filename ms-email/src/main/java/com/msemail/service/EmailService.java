package com.msemail.service;

import com.msemail.entity.dto.UserDto;

public interface EmailService {

	void sendSimpleMessage(UserDto dto);
	
}
