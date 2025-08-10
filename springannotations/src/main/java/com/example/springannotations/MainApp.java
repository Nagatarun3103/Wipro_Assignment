package com.example.springannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp
{
    public static void main(String[] args)
    {
        // Option 1: try-with-resources (recommended)
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Item item = ctx.getBean(Item.class);
        item.displayDetails();
        ((AnnotationConfigApplicationContext) ctx).close();
        
    }
}

