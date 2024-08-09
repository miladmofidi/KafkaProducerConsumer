package com.example.simple_kafka.Demo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @author Milad Mofidi (milad.mofidi@gmail.com)
 * 8/7/2024
 */
@Component
@RequiredArgsConstructor
@Slf4j
public class MessageProducer {


	private final KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessage(String topic, String message) {
		log.info( "Kafka Producer sent a message to the topic " + topic + ": " + message );
		kafkaTemplate.send(topic, message);
	}

}
