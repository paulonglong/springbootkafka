package com.itranswarp.learnjava.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;


@Component
public class TopicMessageListener2 {

	private final Logger logger = LoggerFactory.getLogger(getClass());

    @KafkaListener(topics = "test", groupId = "group1")
    public void onRegistrationMessage(@Payload String message) throws Exception {
        logger.info("received registration message in group1: {}", message);
	}

    @KafkaListener(topics = "test", groupId = "group2")
    public void onLoginMessage(@Payload String message) throws Exception {
        logger.info("received registration message in group2: {}", message);
	}
}
