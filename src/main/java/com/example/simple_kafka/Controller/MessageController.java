package com.example.simple_kafka.Controller;

import com.example.simple_kafka.Demo.MessageProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Milad Mofidi (milad.mofidi@cmas-systems.com)
 * 8/7/2024
 */
@RestController
@RequiredArgsConstructor
public class MessageController {

	private final MessageProducer messageProducer;
	@Value("${app.kafka.topic.name}")
	private String topicName;

	@GetMapping("/send")
	public String sendMessage( @RequestParam("message") String message ) {
		messageProducer.sendMessage( topicName, message );
		return String.format( "Message sent to topic %s, Message is:%s ", topicName, message ) ;
	}

}
