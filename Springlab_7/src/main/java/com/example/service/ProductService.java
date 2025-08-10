package com.example.service;


import com.example.bean.*;
import com.example.dao.ProductDao;
import com.example.dao.ProductDaoImpl;


public class ProductService {

	private ProductDao productDao;

	public ProductService(ProductDao productDao) {
	    this.productDao = productDao;
	}

    

    public Product getProductDetails(int product_code) {
        return productDao.getProductDetails(product_code);
    }

    public double calculatePrice(int quantity, double product_price) {
        return quantity * product_price;
    }

    public boolean validateProductCode(int product_code) {
        return (product_code > 0 && String.valueOf(product_code).length() == 4);
    }

    public boolean validateQuantity(int quantity) {
        return quantity > 0;
    }
}
