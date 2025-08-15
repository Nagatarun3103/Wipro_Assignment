package com.example.uber_consumer.Listener;

import com.example.uber_consumer.Model.Ride;
import com.example.uber_consumer.Repository.RideRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class RideListener {

    private final RideRepository rideRepository;

    public RideListener(RideRepository rideRepository) {
        this.rideRepository = rideRepository;
    }

    @KafkaListener(topics = "uber_rides", groupId = "uber_group")
    public void consume(Ride ride) {
        System.out.println("Received Ride: " + ride.getRideId());
        rideRepository.save(ride);
    }
}
