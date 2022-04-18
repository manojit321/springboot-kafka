package com.pettyprojects.springbootkafka;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "test_topic", groupId = "spring_consumer", properties = {
            "max.poll.interval.ms:510",
            ConsumerConfig.MAX_POLL_RECORDS_CONFIG + "=1"
    })
    public void consumeMessage(String message) throws InterruptedException {
        System.out.println(message);
        Thread.sleep(100);
    }
}
