package com.msuser.repository;

import org.springframework.data.repository.CrudRepository;

import com.msuser.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
