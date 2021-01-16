package com.logycoconut.cloud.stream.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * @author hall
 * @date 2021-01-16 16:22
 */
@Component
@EnableBinding(Source.class)
public class MessageProducer {

    @Autowired
    private Source source;

    public void send(String message) {
        source.output().send(MessageBuilder.withPayload(message).build());
    }

}
