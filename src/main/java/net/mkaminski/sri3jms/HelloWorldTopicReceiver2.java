package net.mkaminski.sri3jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.jms.Message;

@Component
public class HelloWorldTopicReceiver2 {
    @JmsListener(destination = JmsConfig.TOPIC_HELLO_WORLD, containerFactory =
            "topicConnectionFactory")
    public void receiveHelloMessage(@Payload HelloMessage convertedMessage,
                                    @Headers MessageHeaders messageHeaders,
                                    Message message) {
        System.out.println("HelloWorldTopicReceiver2.receiveHelloMessage, message: " + convertedMessage);
    }
}