package ru.iteco.vyacheslav.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    @JmsListener(destination = "box")
    public void listen(String string) {
        System.out.println(string);
    }
}
