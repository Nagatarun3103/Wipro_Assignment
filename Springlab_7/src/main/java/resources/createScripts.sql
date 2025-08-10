CREATE TABLE product (
    product_code INT PRIMARY KEY,
    product_name VARCHAR(100),
    product_category VARCHAR(50),
    product_description VARCHAR(255),
    product_price DOUBLE
);

INSERT INTO product VALUES
(1001, 'LEDTV', 'electronics', 'TV', 45000.0),
(1002, 'Refrigerator', 'electronics', 'Double Door Fridge', 30000.0);
