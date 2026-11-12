CREATE TABLE transactions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    unit_price DOUBLE NOT NULL,
    date VARCHAR(255) NOT NULL,
    quantity INT NOT NULL,
    total_amount DOUBLE NOT NULL,
    product_id INT NOT NULL REFERENCES products(id) ON DELETE CASCADE,
    user_id INT NOT NULL REFERENCES users(id) ON DELETE CASCADE
);