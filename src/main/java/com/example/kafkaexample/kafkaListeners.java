package com.example.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class kafkaListeners {
    @KafkaListener(
            topics = "lemin",
            groupId = "groupId"
    )
    public void Listener(String data){
        System.out.println("Listener received "+ data);
    }
}
