/*
Домашнее задание Работа с несколькими таблицами


SELECT * FROM employee;

SELECT * FROM city;

CREATE TABLE city(
    city_id BIGSERIAL NOT NULL PRIMARY KEY ,
    city_name VARCHAR(50) NOT NULL);

ALTER TABLE employee ADD COLUMN city_id BIGINT REFERENCES city(city_id);

INSERT INTO city(city_name)
VALUES ('Moscow'),('Omsk'),('Krasnoyarsk'),('Tiumen'),('Ekaterinburg');

UPDATE employee SET city_id=1 WHERE id>4 AND id<5;
UPDATE employee SET city_id=2 WHERE id>3 AND id<5;
UPDATE employee SET city_id=3 WHERE id>2 AND id<5;
UPDATE employee SET city_id=4 WHERE id>1 AND id<5;
UPDATE employee SET city_id=NULL WHERE id=5;

SELECT first_name, last_name, city_name
FROM employee INNER JOIN city ON employee.city_id = city.city_id;

SELECT city_name, first_name, last_name
FROM employee RIGHT JOIN city
ON employee.city_id=city.city_id
ORDER BY city_name;

SELECT city_name, first_name, last_name
FROM employee FULL JOIN city
ON employee.city_id=city.city_id
ORDER BY city_name;

SELECT first_name,city_name
FROM employee CROSS JOIN city;
 */
