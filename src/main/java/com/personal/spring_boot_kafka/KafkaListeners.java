package com.personal.spring_boot_kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "testing", groupId = "groupId")
    void listener(String data){
        System.out.println("Listener Received"+ data);
    }
}
