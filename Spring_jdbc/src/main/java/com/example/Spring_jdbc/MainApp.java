package com.example.Spring_jdbc;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        PersonDAO dao = ctx.getBean(PersonDAO.class);

        List<Person> persons = dao.getAll();
        System.out.println("List of person is:");
        for (Person p : persons) System.out.println(p);

        System.out.println("\nGet person with ID 2");
        System.out.println(dao.getById(2));

        System.out.println("\nCreating person:");
        dao.create(new Person(0, 36, "Sergey", "Emets"));
        persons = dao.getAll();
        for (Person p : persons) System.out.println(p);

        System.out.println("\nDeleting person with ID 2");
        dao.delete(2);

        System.out.println("\nUpdate person with ID 4");
        dao.update(new Person(4, 36, "Sergey", "CHANGED"));

        persons = dao.getAll();
        System.out.println("\nList of person is:");
        for (Person p : persons) System.out.println(p);
    }
}

