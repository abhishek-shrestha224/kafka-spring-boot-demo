package world.hello.kafkademo;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class MessageController {

    private KafkaTemplate<String, String> kafkaTemplate;

    public void publish(@RequestBody final String message) {
        kafkaTemplate.send("Dinosaurs", message);
    }
}
