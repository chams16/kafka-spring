package com.payment.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @KafkaListener(topics = "${kafka.topic}")
    public void consume(Message<String> order){
        System.out.println("the order that will be paid is " + order);
    }
}
