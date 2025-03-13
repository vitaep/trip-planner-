CREATE TABLE trip_item (
        id BIGINT AUTO_INCREMENT PRIMARY KEY,
        destination VARCHAR(255) NOT NULL,
        trip_days INT NOT NULL,
        preference VARCHAR(255),
        spending_fund INT,
        goals VARCHAR(255)
);