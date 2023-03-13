package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.EmailDetails;
import com.test.service.EmailService;


@RestController
public class EmailController {

	@Autowired
	private EmailService emailservice;

	// Sending a simple Email
	@PostMapping("/sendMail")
	public String sendMail(@RequestBody EmailDetails details) {
		String status = emailservice.sendMail(details);

		return status;
	}

}
