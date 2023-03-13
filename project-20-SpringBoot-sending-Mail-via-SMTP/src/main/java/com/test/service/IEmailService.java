package com.test.service;

import org.springframework.stereotype.Repository;

import com.test.entity.EmailDetails;
@Repository
public interface IEmailService {

	
	public String sendMail(EmailDetails details);
}
