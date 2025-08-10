package com.example.Springlab_8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.service.ShoppingService;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ShoppingService service = context.getBean("shoppingService", ShoppingService.class);

        service.addToCart("Laptop");
        service.makePayment(1200.50);
        service.placeOrder();
    }
}
