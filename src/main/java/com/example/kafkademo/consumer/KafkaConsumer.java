package com.example.kafkademo.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

        @KafkaListener(topics = "my_topic", groupId = "group_id")
        public void consume(String message) {
            System.out.println("Consumed message is: " + message);
        }
}
