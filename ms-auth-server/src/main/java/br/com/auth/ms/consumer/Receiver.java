package br.com.auth.ms.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

import br.com.auth.ms.entity.dto.UserDto;
import br.com.auth.ms.service.AccountService;

import java.util.concurrent.CountDownLatch;

public class Receiver {

    private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

    private CountDownLatch latch = new CountDownLatch(1);

    @Autowired
    private AccountService accountService;

    @KafkaListener(topics = "${spring.kafka.topic.userCreated}")
    public void receive(UserDto payload) {
        LOGGER.info("received payload='{}'", payload);
        accountService.registerUser(payload);
        latch.countDown();
    }
}
