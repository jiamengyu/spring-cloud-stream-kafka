package ca.itm.stream.demo.sub;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface KafkaBindings {
    String TEST_IN = "output";

    @Input(KafkaBindings.TEST_IN)
    SubscribableChannel testIn();
}