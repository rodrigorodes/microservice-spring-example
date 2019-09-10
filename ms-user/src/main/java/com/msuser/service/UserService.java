package com.msuser.service;

import com.msuser.entity.User;

public interface UserService {

	User registerUser(User input);

	Iterable<User> findAll();

}
