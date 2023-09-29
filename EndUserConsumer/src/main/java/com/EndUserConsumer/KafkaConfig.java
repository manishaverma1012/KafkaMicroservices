package com.EndUserConsumer;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import javax.sound.midi.Soundbank;

@Configuration
public class KafkaConfig {
    @KafkaListener(topics=AppConstant.LOCATION_UPDATE_TOPIC, groupId=AppConstant.GROUP_ID)
    public void updateLocation(String value)
    {
        System.out.println(value);

    }
}
