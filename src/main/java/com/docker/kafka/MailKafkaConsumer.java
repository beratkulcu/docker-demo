package com.docker.kafka;


import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MailKafkaConsumer {
    private final MailService mailService;

    @KafkaListener(topics = "mail-events", groupId = "mail-group")
    public void consumeMailEvent(MailEvent mailEvent) {
        mailService.sendMail(mailEvent);
    }
}
