package com.springkafka.springboot_kafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.springkafka.springboot_kafka.payload.User;

@Service
public class JsonKafkaConsumer {
    private static final Logger logger = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "demo_json", groupId = "groupId")
    public void consume(User user){
        logger.info(String.format("Consuming message -> %s", user.toString()));
    }
}
