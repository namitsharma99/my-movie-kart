package com.mymoviekart.theatrepartner.controller;

import com.mymoviekart.theatrepartner.service.KafkaProducerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class NotificationController {
    private final KafkaProducerService kafkaProducerService;

    public NotificationController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @PostMapping("/partner/notification")
    public String sendNotification(@RequestBody String message) {
        kafkaProducerService.sendMessage("mmk", message);
        return "Message sent: " + message;
    }
}