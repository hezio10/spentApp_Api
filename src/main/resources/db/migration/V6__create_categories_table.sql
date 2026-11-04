CREATE TABLE categories (
    id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description VARCHAR(255),
    user_id INT NOT NULL REFERENCES users(id) ON DELETE CASCADE
);