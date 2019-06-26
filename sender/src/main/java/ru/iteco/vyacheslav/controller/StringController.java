package ru.iteco.vyacheslav.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    private JmsOperations jmsOperations;

    @Autowired
    public StringController(JmsOperations jmsOperations) {
        this.jmsOperations = jmsOperations;
    }

    @GetMapping("send")
    public String send() {
        jmsOperations.convertAndSend("box", "Misha");
        return "message was send";
    }
}
