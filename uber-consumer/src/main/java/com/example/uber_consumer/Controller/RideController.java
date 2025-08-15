package com.example.uber_consumer.Controller;


import com.example.uber_consumer.Repository.RideRepository;
import com.example.uber_consumer.Model.Ride;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class RideController {

    private final RideRepository rideRepository;

    public RideController(RideRepository rideRepository) {
        this.rideRepository = rideRepository;
    }

    @GetMapping("/rides")
    public List<Ride> getAllRides() {
        return rideRepository.findAll();
    }
}

