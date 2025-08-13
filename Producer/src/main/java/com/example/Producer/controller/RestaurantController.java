package com.example.Producer.controller;

import com.example.Producer.model.Restaurant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class RestaurantController {

    @GetMapping("/restaurants")
    public List<Restaurant> getRestaurants() {
        return Arrays.asList(
                new Restaurant(1, "The Spice House", "Mumbai"),
                new Restaurant(2, "Ocean Breeze Cafe", "Goa"),
                new Restaurant(3, "Mountain View Diner", "Manali")
        );
    }
}
