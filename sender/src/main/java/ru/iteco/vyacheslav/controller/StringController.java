package ru.iteco.vyacheslav.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsOperations;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    private JmsOperations jmsOperations;

    @Value("${activemq.queue.name}")
    private String destinationName;

    @Autowired
    public StringController(JmsOperations jmsOperations) {
        this.jmsOperations = jmsOperations;
    }

    @PostMapping("/send")
    public void send(@RequestBody String message) {
        System.out.println("message: " + message);
        jmsOperations.convertAndSend(destinationName, message);
    }
}
