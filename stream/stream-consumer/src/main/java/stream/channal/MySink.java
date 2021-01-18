package stream.channal;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author hall
 * @description
 * @date 2021-01-18 22:40
 */
public interface MySink {
    String MY_INPUT = "my_input";

    @Input(MY_INPUT)
    SubscribableChannel input();
}
