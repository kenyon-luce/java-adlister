public class Config {

}

//CREATE DATABASE adlister_db;
//USE adlister_db;
//CREATE USER 'adlister'@'localhost' IDENTIFIED BY 'codeup';
//GRANT ALL PRIVILEGES ON adlister_db.* TO 'adlister'@'localhost';
/*
CREATE TABLE users (
    id int NOT NULL AUTO_INCREMENT,
    username varchar(255),
    email varchar(255),
    password varchar(255),
    PRIMARY KEY (id)
);
*/
/*
CREATE TABLE ads (
    id int NOT NULL AUTO_INCREMENT,
    user_id int,
    title varchar(255),
    description varchar(1255),
    FOREIGN KEY (user_id) REFERENCES users(id),
    PRIMARY KEY (id)
);
 */
