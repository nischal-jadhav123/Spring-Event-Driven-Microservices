package com.microservices.demo.twitter.to.kafka.services;

import com.microservices.demo.twitter.to.kafka.services.config.TwitterToKafkaServiceConfigData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

@SpringBootApplication
public class TwitterToKafkaServicesApplication implements CommandLineRunner {
    private static final Logger LOG = LoggerFactory.getLogger(TwitterToKafkaServicesApplication.class);

    private final TwitterToKafkaServiceConfigData twitterToKafkaServiceConfigData;

    public TwitterToKafkaServicesApplication(TwitterToKafkaServiceConfigData configData) {
        this.twitterToKafkaServiceConfigData = configData;
    }

    public static void main(String[] args) {
        SpringApplication.run(TwitterToKafkaServicesApplication.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOG.info("Application starts.....");
        LOG.info(Arrays.toString(twitterToKafkaServiceConfigData.getTwitterKeyWords().toArray(new String[] {})));
        LOG.info(twitterToKafkaServiceConfigData.getWelcomeMessage());
    }
}
