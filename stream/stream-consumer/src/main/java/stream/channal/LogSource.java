package stream.channal;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author hall
 * @date 2021-01-18 23:23
 */
public interface LogSource {
    String LOG_OUTPUT = "log_output";

    /**
     * 日志推送
     */
    @Output(LOG_OUTPUT)
    MessageChannel output();
}
