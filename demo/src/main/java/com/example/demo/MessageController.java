package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    private RabbitMQSender sender;

    @PostMapping
    public void sendMessage(@RequestBody String message) {
        sender.send(message);
    }

    @GetMapping("/demo")
    public void sendMessageTest() {
        for(int i=0;i<100;i++)
            sender.send("hello world from demo ");
        //sender.send("hello world from demo ");
    }
}
