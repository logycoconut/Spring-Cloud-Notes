package com.logycoconut.cloud.stream;

import com.logycoconut.cloud.stream.StreamProducerApplication;
import com.logycoconut.cloud.stream.producer.MessageProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author hall
 * @date 2021-01-16 16:40
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MessageProducerTest {

    @Autowired
    private MessageProducer messageProducer;

    @Test
    public void testSend(){
        messageProducer.send("你好呀");
    }

}
