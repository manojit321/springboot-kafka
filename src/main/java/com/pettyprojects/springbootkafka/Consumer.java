package com.pettyprojects.springbootkafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "test_topic", groupId = "spring_consumer")
    public void consumeMessage(String message) {
        System.out.println(message);
    }
}
