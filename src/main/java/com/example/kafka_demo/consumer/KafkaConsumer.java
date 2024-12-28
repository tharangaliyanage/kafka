package com.example.kafka_demo.consumer;

import com.example.kafka_demo.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

//    @KafkaListener(topics = "first", groupId = "myGroup")
    public void consumeMsg(String msg) {
        log.info("Consuming message from first topic: " + msg);
    }

    @KafkaListener(topics = "first", groupId = "myGroup")
    public void consumeJsonMsg(Student student) {
        log.info("Consuming message from first topic: " + student.toString());
    }
}
