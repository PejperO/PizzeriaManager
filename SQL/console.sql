SHOW DATABASES;
USE pizzeria_db;
SHOW TABLES;

SELECT * FROM Pizza;
SELECT * FROM Spaghetti;
SELECT * FROM Gnocchi;
SELECT * FROM Topping;
SELECT * FROM Dish;
SELECT * FROM dish_topping;

-- Usuwanie danych
DROP TABLE IF EXISTS dish_topping;
DROP TABLE IF EXISTS Pizza;
DROP TABLE IF EXISTS Spaghetti;
DROP TABLE IF EXISTS Gnocchi;
DROP TABLE IF EXISTS Topping;
DROP TABLE IF EXISTS Dish;

-- Tworzenie tabeli BO SAMO SIE NIE CHCE
CREATE TABLE Pizza (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       name VARCHAR(255) NOT NULL,
                       size DOUBLE,
                       spicy BOOLEAN
);
CREATE TABLE Spaghetti (
                           id INT AUTO_INCREMENT PRIMARY KEY,
                           name VARCHAR(255) NOT NULL,
                           origin VARCHAR(255)
);
CREATE TABLE Gnocchi (
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         name VARCHAR(255) NOT NULL,
                         sauce VARCHAR(255)
);
CREATE TABLE Topping (
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         name VARCHAR(255) NOT NULL
);
CREATE TABLE Dish (
                      id INT AUTO_INCREMENT PRIMARY KEY,
                      name VARCHAR(255) NOT NULL,
                      type VARCHAR(255) NOT NULL
);
CREATE TABLE dish_topping (
                              dish_id INT,
                              topping_id INT,
                              PRIMARY KEY (dish_id, topping_id),
                              FOREIGN KEY (dish_id) REFERENCES Pizza (id),
                              FOREIGN KEY (topping_id) REFERENCES Topping (id)
);

insert into topping values (1, 'ser');
insert into topping values (2, 'pieczarki');
insert into topping values (3, 'salami');
insert into topping values (4, 'szynka');
insert into topping values (5, 'pomidory');
