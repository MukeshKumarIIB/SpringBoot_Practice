package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.test.entity.EmailDetails;

@Service
public class EmailService implements IEmailService {

	// JavaMailSender interface of JavaMail API is used here to send simple text
	// email
	@Autowired
	private JavaMailSender javamailsender;

	@Value("${spring.mail.username}")
	private String sender;

	@Override
	public String sendMail(EmailDetails details) {

		// Try block to check for exceptions
		try {

			// Creating a simple mail message
			SimpleMailMessage mailMessage = new SimpleMailMessage();

			// Setting up necessary details
			mailMessage.setFrom(sender);
			mailMessage.setTo(details.getRecipient());
			mailMessage.setText(details.getMsgBody());
			mailMessage.setSubject(details.getSubject());

			// Sending the mail
			javamailsender.send(mailMessage);
			return "Mail Sent Successfully...";
		}

		// Catch block to handle the exceptions
		catch (Exception e) {
			e.printStackTrace();
			return "Error while Sending Mail";
		}

	}

}
