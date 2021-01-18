package stream.channal;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author hall
 * @date 2021-01-18 22:40
 */
public interface LogSink {
    String LOG_INPUT = "log_input";

    /**
     * 日志监听
     */
    @Input(LOG_INPUT)
    SubscribableChannel input();
}
