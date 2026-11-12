CREATE TABLE product_prices (
    id INT AUTO_INCREMENT PRIMARY KEY,
    price DOUBLE NOT NULL,
    expiration_date DATE NOT NULL,
    isActive INT NOT NULL,
    product_id INT NOT NULL REFERENCES products(id) ON DELETE CASCADE
);