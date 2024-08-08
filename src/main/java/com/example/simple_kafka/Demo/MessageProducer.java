package com.example.simple_kafka.Demo;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @author Milad Mofidi (milad.mofidi@cmas-systems.com)
 * 8/7/2024
 */
@Component
@RequiredArgsConstructor
public class MessageProducer {


	private final KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessage(String topic, String message) {
		kafkaTemplate.send(topic, message);
	}

}
