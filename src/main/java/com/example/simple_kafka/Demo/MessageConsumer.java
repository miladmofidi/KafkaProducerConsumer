package com.example.simple_kafka.Demo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author Milad Mofidi (milad.mofidi@gmail.com)
 * 8/7/2024
 */
@Component
@RequiredArgsConstructor
@Slf4j
public class MessageConsumer {

	@KafkaListener(topics = "${app.kafka.topic.name}", groupId = "${app.kafka.groupId}")
	public void listen(String message) {

		log.info("Kafka Consumer: message is received: " + message);
	}

}
