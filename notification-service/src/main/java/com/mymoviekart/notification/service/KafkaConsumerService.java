package com.mymoviekart.notification.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
    public class KafkaConsumerService {

        @KafkaListener(topics = "mmk", groupId = "mmk")
        public void consumeNotification(String message) {
            System.out.println("Message received - New theatre onboarded and awaiting review for approval. Theatre details captured:" + message);
            // Implement actual notification sending logic here (e.g., email, SMS, push)
        }
    }