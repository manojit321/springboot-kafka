package com.pettyprojects.springbootkafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReceiverController {

    private final Producer producer;

    @Autowired
    public ReceiverController(Producer producer){
        this.producer = producer;
    }

    @PostMapping("/publish")
    public void publish(@RequestParam("message") String message){
        producer.sendMessage(message);
    }
}
