package world.hello.kafkademo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaListenre {
    @KafkaListener(
            topics = "Dinosaurs",
            groupId = "foo"
    )
    void listener(String data) {
        log.info("Listener received: {}", data);
    }
}
