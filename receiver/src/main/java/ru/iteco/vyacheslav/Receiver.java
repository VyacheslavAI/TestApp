package ru.iteco.vyacheslav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class Receiver {

    public static void main(String[] args) {
        SpringApplication.run(Receiver.class);
    }
}