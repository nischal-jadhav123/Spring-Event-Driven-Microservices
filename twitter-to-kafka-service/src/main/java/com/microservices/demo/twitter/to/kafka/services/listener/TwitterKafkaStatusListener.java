package com.microservices.demo.twitter.to.kafka.services.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import twitter4j.Status;
import twitter4j.StatusAdapter;

@Component
public class TwitterKafkaStatusListener extends StatusAdapter {

    private static Logger LOG = LoggerFactory.getLogger(TwitterKafkaStatusListener.class);
    @Override
    public void onStatus(Status status) {
        LOG.info("Twitter status with text {}",status.getText());
    }
}
