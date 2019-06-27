package ru.iteco.vyacheslav.listener;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.core.JmsOperations;
import org.springframework.test.context.junit4.SpringRunner;
import ru.iteco.vyacheslav.listener.api.IListener;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ListenerTest {

    @Autowired
    private IListener listener;

    @Autowired
    private JmsOperations jmsOperations;

    @Test
    public void listen() {
        listener.listen("message");
        listener.listen("");
        listener.listen(null);
    }
}