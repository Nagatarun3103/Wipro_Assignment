package com.javadeveloperzone.controller;

import com.javadeveloperzone.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/springrest")
public class CustomerController {

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return Arrays.asList(
                new Customer(101, "tarun", "naga", "jdojh@gmail.com", "121-232-3435", 1467240235069L),
                new Customer(201, "kolli", "siva", "rsusg@gmail.com", "343-545-2345", 1467240235069L),
                new Customer(301, "vardhan", "dudipalla", "kwilliams@gmail.com", "876-237-2987", 1467240235069L)
        );
    }
}
