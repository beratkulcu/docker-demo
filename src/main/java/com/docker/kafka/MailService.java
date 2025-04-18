package com.docker.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MailService {
    private final JavaMailSender javaMailSender;

    public void sendMail(MailEvent mailEvent) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(mailEvent.getRecipient());
        message.setSubject(mailEvent.getSubject());
        message.setText(mailEvent.getBody());
        javaMailSender.send(message);
    }
}
