package world.hello.kafkademo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaListener {
    @org.springframework.kafka.annotation.KafkaListener(
            topics = "Dinosaurs",
            groupId = "foo"
    )
    void listener(String data) {
        log.info("Listener received: {}", data);
    }
}
