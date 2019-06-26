package ru.iteco.vyacheslav.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    private JmsOperations jmsOperations;

    @Autowired
    public StringController(JmsOperations jmsOperations) {
        this.jmsOperations = jmsOperations;
    }

    @GetMapping("/box")
    public void test() {
        jmsOperations.convertAndSend("box", "Misha");
    }

    @PostMapping("/send")
    public void send(@RequestBody String message) {
        System.out.println(message + " is message");
        jmsOperations.convertAndSend("box", message);
    }
}
