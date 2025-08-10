package com.example.Springlab_7;

import com.example.bean.Product;
import com.example.dao.ProductDaoImpl;
import com.example.service.BillingException;
import com.example.service.ProductService;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/Spring_7");
        dataSource.setUsername("root");
        dataSource.setPassword("Nagatarun,5");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        ProductDaoImpl productDao = new ProductDaoImpl(jdbcTemplate);
        ProductService productService = new ProductService(productDao);

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Generate Bill by entering code and quantity");
            System.out.println("2. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    try {
                        int product_code;
                        do {
                            System.out.print("Enter product_code: ");
                            product_code = sc.nextInt();
                            if (!productService.validateProductCode(product_code)) {
                                throw new BillingException("Invalid product_code, it should be >0 and 4 digit +ve number");
                            }
                        } while (!productService.validateProductCode(product_code));

                        int quantity;
                        do {
                            System.out.print("Enter quantity: ");
                            quantity = sc.nextInt();
                            if (!productService.validateQuantity(quantity)) {
                                throw new BillingException("Invalid quantity, it should be >0");
                            }
                        } while (!productService.validateQuantity(quantity));

                        Product product = productService.getProductDetails(product_code);
                        double totalBill = productService.calculatePrice(quantity, product.getProduct_price());

                        System.out.println("Product Name: " + product.getProduct_name());
                        System.out.println("Product Category: " + product.getProduct_category());
                        System.out.println("Product Description: " + product.getProduct_description());
                        System.out.println("Product Price(Rs): " + product.getProduct_price());
                        System.out.println("Quantity: " + quantity);
                        System.out.println("Total Bill Amount: Rs." + totalBill);

                    } catch (BillingException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option");
            }
        } while (choice != 2);

        sc.close();
    }
}
