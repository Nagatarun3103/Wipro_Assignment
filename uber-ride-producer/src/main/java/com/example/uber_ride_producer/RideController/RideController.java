package com.example.uber_ride_producer.RideController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import com.example.uber_ride_producer.model.RideRequest;

@RestController
@RequestMapping("/api/ride")

public class RideController {

    private final KafkaTemplate<String, RideRequest> kafkaTemplate;

    @Value("${uber.topic.name:uber_rides}")
    private String topicName;

    public RideController(KafkaTemplate<String, RideRequest> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/book")
    public String bookRide(@RequestBody RideRequest rideRequest) {
        kafkaTemplate.send(topicName, rideRequest);
        return "Ride booked successfully: " + rideRequest.getRideId();
    }
}
