package com.example.demo;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQReceiver {

    @RabbitListener(queues = "hello")
    public void receive(String in) {
        System.out.println(" [x] Received '" + in + "'");
    }
}
