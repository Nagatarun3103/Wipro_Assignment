package com.example.Consumer;

import com.example.Consumer.model.Restaurant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(name = "consumer")

public interface RestaurantClient {
    @GetMapping("/restaurants")
    List<Restaurant> getRestaurants();
}
