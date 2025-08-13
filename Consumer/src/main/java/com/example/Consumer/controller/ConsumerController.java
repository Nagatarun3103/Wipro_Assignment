package com.example.Consumer.controller;

import com.example.Consumer.RestaurantClient;
import com.example.Consumer.model.Restaurant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ConsumerController {

    private final RestaurantClient restaurantClient;

    public ConsumerController(RestaurantClient restaurantClient) {
        this.restaurantClient = restaurantClient;
    }

    @GetMapping("/consumer/restaurants")
    public List<Restaurant> fetchRestaurants() {
        return restaurantClient.getRestaurants();
    }
}
