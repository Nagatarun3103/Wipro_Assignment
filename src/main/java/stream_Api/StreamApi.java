package stream_Api;



import stream_Api.*;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

public class StreamApi {
    public static void main(String[] args) {
        // sample data
        List<Product> products = Arrays.asList(
            new Product(1L, "Java Basics", "Books", 250.0),
            new Product(2L, "Toy Car", "Toys", 150.0),
            new Product(3L, "Milk Bottle", "Baby", 80.0),
            new Product(4L, "Data Structures", "Books", 180.0),
            new Product(5L, "Teddy Bear", "Toys", 300.0)
        );

        Customer cust1 = new Customer(1L, "Alice", 1);
        Customer cust2 = new Customer(2L, "Bob", 2);

        List<Order> orders = Arrays.asList(
            new Order(1L, "Delivered", LocalDate.of(2021, 2, 15), LocalDate.of(2021, 2, 20), List.of(products.get(0), products.get(2)), cust2),
            new Order(2L, "Shipped", LocalDate.of(2021, 3, 10), LocalDate.of(2021, 3, 15), List.of(products.get(4)), cust2),
            new Order(3L, "Pending", LocalDate.of(2021, 1, 5), LocalDate.of(2021, 1, 10), List.of(products.get(1)), cust1)
        );

        // 1. for Books > 100
        products.stream().filter(p -> p.category.equals("Books") && p.price > 100).forEach(System.out::println);

        // 2. Orders with Baby category
        orders.stream().filter(o -> o.products.stream().anyMatch(p -> p.category.equals("Baby"))).forEach(o -> System.out.println("Order: " + o.id));

        // 3. Toys with 10% discount
        products.stream().filter(p -> p.category.equals("Toys"))
                .map(p -> new Product(p.id, p.name, p.category, p.price * 0.9))
                .forEach(System.out::println);

        // 4. Tier 2 between dates
        orders.stream()
            .filter(o -> o.customer.tier == 2 &&
                        !o.orderDate.isBefore(LocalDate.of(2021, 2, 1)) &&
                        !o.orderDate.isAfter(LocalDate.of(2021, 4, 1)))
            .flatMap(o -> o.products.stream())
            .forEach(System.out::println);

        // 5. Cheapest Book
        products.stream().filter(p -> p.category.equals("Books"))
                .sorted(Comparator.comparingDouble(p -> p.price))
                .findFirst().ifPresent(System.out::println);

        // 6. 3 most recent orders
        orders.stream().sorted((o1, o2) -> o2.orderDate.compareTo(o1.orderDate))
                .limit(3).forEach(o -> System.out.println("Order ID: " + o.id + ", Date: " + o.orderDate));

        // 7. Total value of Feb 2021 orders
        double totalFeb = orders.stream()
            .filter(o -> o.orderDate.getMonthValue() == 2 && o.orderDate.getYear() == 2021)
            .flatMap(o -> o.products.stream())
            .mapToDouble(p -> p.price).sum();
        System.out.println("Total Feb 2021: Rs." + totalFeb);

        // 8. Statistics of Books
        DoubleSummaryStatistics stats = products.stream()
            .filter(p -> p.category.equals("Books"))
            .mapToDouble(p -> p.price)
            .summaryStatistics();
        System.out.println("Books Stats: " + stats);

        // 9. Most expensive product by category
        products.stream().collect(Collectors.groupingBy(p -> p.category,
            Collectors.maxBy(Comparator.comparingDouble(p -> p.price))))
            .forEach((cat, prod) -> System.out.println(cat + " => " + prod.orElse(null)));
    }
}
