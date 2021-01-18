package stream.consumer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;
import stream.channal.LogSink;
import stream.channal.LogSource;
import stream.channal.MySink;

/**
 * @author hall
 * @date 2021-01-16 16:22
 */
@Component
@EnableBinding({Sink.class, MySink.class, LogSource.class, LogSink.class})
public class MessageConsumer {

    @StreamListener(Sink.INPUT)
    public void receive(String message) {
        System.out.println("message = " + message);
    }

    /**
     * 在监听到 MySink.MY_INPUT 后，通过 SendTo 将处理后的消息发送到 LogSource.LOG_OUTPUT
     * @param message 收到的消息
     * @return 日志内容
     */
    @StreamListener(MySink.MY_INPUT)
    @SendTo(LogSource.LOG_OUTPUT)
    public String receiveMyInput(String message) {
        System.out.println("my message = " + message);
        return "log" + message;
    }

    @StreamListener(LogSink.LOG_INPUT)
    public void logMessage(String message) {
        System.out.println("log message = " + message);
    }

}
