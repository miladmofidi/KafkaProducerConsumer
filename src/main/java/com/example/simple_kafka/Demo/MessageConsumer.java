package com.example.simple_kafka.Demo;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author Milad Mofidi (milad.mofidi@gmail.com)
 * 8/7/2024
 */
@Component
@RequiredArgsConstructor
public class MessageConsumer {

	@KafkaListener(topics = "${app.kafka.topic.name}", groupId = "${app.kafka.groupId}")
	public void listen(String message) {

		System.out.println("Kafka Consumer: message is received: "+message);
	}

}
