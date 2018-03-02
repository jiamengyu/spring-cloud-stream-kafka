package ca.itm.stream.demo.pub;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.GenericMessage;

@SpringBootApplication
@EnableBinding(Source.class)
public class StreamPubApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamPubApplication.class, args);
    }

    @Bean
    @InboundChannelAdapter(value = Source.OUTPUT)
    public MessageSource<String> timerMessageSource() {
        return () -> new GenericMessage<>(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()));
    }

}