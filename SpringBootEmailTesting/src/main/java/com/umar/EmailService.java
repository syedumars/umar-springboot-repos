package com.umar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender javaMailsender;

	public void sendEmail(String to, String subject, String body) {

		SimpleMailMessage mailMessage = new SimpleMailMessage();

		System.out.println("Email sending...");

		mailMessage.setFrom("syedumar1992@gmail.com");
		mailMessage.setSubject(subject);
		mailMessage.setText(body);
		mailMessage.setTo(to);
		mailMessage.getSentDate();

		javaMailsender.send(mailMessage);

		System.out.println("Email sent;)");
	}
}
