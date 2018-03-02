package ca.itm.stream.demo.sub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@SpringBootApplication
@EnableBinding(KafkaBindings.class)
public class StreamSubApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamSubApplication.class, args);
    }


    @StreamListener(target = KafkaBindings.TEST_IN )
    public void processMsg(String data){
    	System.out.println(data);
    }    
}