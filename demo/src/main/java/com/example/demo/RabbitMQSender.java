package com.example.demo;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RabbitMQSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(String message) {
        String context = message + new Date();
        System.out.println("Sender : " + context);
        rabbitTemplate.convertAndSend("Hello", context);
    }
}
