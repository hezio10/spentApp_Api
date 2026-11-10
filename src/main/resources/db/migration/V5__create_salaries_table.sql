CREATE TABLE salaries (
    id INT PRIMARY KEY,
    amount DOUBLE NOT NULL,
    currency VARCHAR(255) NOT NULL,
    is_active INT NOT NULL,
    user_id INT NOT NULL REFERENCES users(id) ON DELETE CASCADE
);