package com.docker.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MailKafkaProducer {
    private final KafkaTemplate<String, MailEvent> kafkaTemplate;

    public void sendMailEvent(MailEvent mailEvent) {
        kafkaTemplate.send("mail-events", mailEvent);
    }
}
