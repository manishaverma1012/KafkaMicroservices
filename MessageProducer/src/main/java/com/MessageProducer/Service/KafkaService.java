package com.MessageProducer.Service;

import com.MessageProducer.config.AppConstants;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class KafkaService {
    @Autowired
    //By using kafka template we can send messages;
    private KafkaTemplate<String, String> kafkatemplate;

//    private final Logger logger= (Logger) LoggerFactory.getLogger(KafkaService.class);

    public boolean UpdateLocation(String location)
    {
        this.kafkatemplate.send(AppConstants.LOCATION_TOPIC_NAME, location);
//        this.logger.info("message produced");
        return true;
    }
}
