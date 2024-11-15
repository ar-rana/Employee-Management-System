package com.regal.EmployeeProject.web.EmployeeProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	
	@Autowired
	JavaMailSender mailSender;
	
	public void sendMail(String to) {
		SimpleMailMessage message = new SimpleMailMessage();
		
		message.setTo(to);
		message.setSubject("COMPLIANCE INFORMATION REQUEST");
		message.setText("Request Date: 06-24-2024\r\n"
				+ "Hello from Assent Compliance,\r\n"
				+ "The following customer has submitted a request for information using the compliance request portal:\r\n"
				+ "Name: 	Samantha Lattanze\r\n"
				+ "Company: 	SomeCompany\r\n"
				+ "Email: 	xyz@someocompany.com\r\n"
				+ " \r\n"
				+ "Request Type: Other\r\n"
				+ "PARTS:\r\n"
				+ "Regal Rexnord Requests Part #:	Customer Part #:\r\n"
				+ "0105206302	NA\r\n"
				+ "Message:\r\n"
				+ "Requesting updated compliance declarations in light of updates to Prop 65 (updated in Dec 2023)");
		
		
		mailSender.send(message);
		

	}
}