package ru.iteco.vyacheslav.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import ru.iteco.vyacheslav.service.api.IStringHolderService;

@Component
public class Listener {

    private IStringHolderService stringHolderService;

    @Autowired
    public Listener(IStringHolderService stringHolderService) {
        this.stringHolderService = stringHolderService;
    }

    @JmsListener(destination = "${activemq.queue.name}")
    public void listen(String message) {
        System.out.println("message: " + message);
        stringHolderService.createOrUpdateStringHolder(message);
    }
}