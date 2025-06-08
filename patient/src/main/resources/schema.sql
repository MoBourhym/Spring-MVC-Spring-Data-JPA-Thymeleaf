-- Drop tables if they exist (clean slate)
DROP TABLE IF EXISTS authorities;
DROP TABLE IF EXISTS users;

-- Create users table
CREATE TABLE users(
    username varchar(50) NOT NULL PRIMARY KEY,
    password varchar(500) NOT NULL,
    enabled boolean NOT NULL
);

-- Create authorities table
CREATE TABLE authorities (
    username varchar(50) NOT NULL,
    authority varchar(50) NOT NULL,
    CONSTRAINT fk_authorities_users FOREIGN KEY(username) REFERENCES users(username)
);

-- Create unique index
CREATE UNIQUE INDEX ix_auth_username ON authorities (username,authority);