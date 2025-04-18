package com.docker.kafka;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mail")
@Tag(name = "Mail API", description = "Mail API")
public class MailController {
    private final MailKafkaProducer mailKafkaProducer;

    @Operation(summary = "Send Mail", description = "Send mail using Kafka")
    @PostMapping("/send")
        public ResponseEntity<String> sendMail(@RequestBody MailEvent mailEvent) {
            mailKafkaProducer.sendMailEvent(mailEvent);
            return ResponseEntity.ok("Mail sent successfully");
        }
}
