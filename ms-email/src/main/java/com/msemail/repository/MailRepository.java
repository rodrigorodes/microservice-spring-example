package com.msemail.repository;

import org.springframework.data.repository.CrudRepository;

import com.msemail.entity.Mail;

public interface MailRepository extends CrudRepository<Mail, Long> {

}
