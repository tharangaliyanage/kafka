package com.example.kafka_demo.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;
    public void sendMessage(String msg) {
        log.info("Sending msg from first topic: " + msg);
        kafkaTemplate.send("first", msg);

    }
}
