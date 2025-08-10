package com.example.dao;

import com.example.bean.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDaoImpl implements ProductDao {

    private JdbcTemplate jdbcTemplate;

    public ProductDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Product getProductDetails(int product_code) {
        String sql = "SELECT * FROM product WHERE product_code = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{product_code}, new RowMapper<Product>() {
            @Override
            public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
                Product product = new Product();
                product.setProduct_code(rs.getInt("product_code"));
                product.setProduct_name(rs.getString("product_name"));
                product.setProduct_category(rs.getString("product_category"));
                product.setProduct_description(rs.getString("product_description"));
                product.setProduct_price(rs.getDouble("product_price"));
                return product;
            }
        });
    }
}
