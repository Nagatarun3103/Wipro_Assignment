package com.example.spring_constructor_autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Purchase;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Purchase purchase = context.getBean("purchaseBean", Purchase.class);
        purchase.displayPurchase();
        ((ClassPathXmlApplicationContext) context).close();
    }
}
