CREATE TABLE product_prices (
    id INT PRIMARY KEY,
    price DOUBLE NOT NULL,
    expiration_date DATE NOT NULL,
    isActive INT NOT NULL,
    product_id INT NOT NULL REFERENCES products(id) ON DELETE CASCADE
);