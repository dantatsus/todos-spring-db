CREATE DATABASE IF NOT EXISTS `todos`;

USE `todos`;

CREATE TABLE IF NOT EXISTS `todo_item` (
    id BIGINT NOT NULL AUTO_INCREMENT,
    description VARCHAR(255) NOT NULL,
    completed BOOLEAN NOT NULL DEFAULT FALSE,
    PRIMARY KEY (id)
);

#user: todos
#password: todos