/* Домашнее задание Введение в SQL

Last login: Sun Mar 26 23:49:46 on ttys000
        /Library/PostgreSQL/14/scripts/runpsql.sh; exit
        roman90x@MacBook-Air-Roman ~ % /Library/PostgreSQL/14/scripts/runpsql.sh; exit
        Server [localhost]:
        Database [postgres]:
        Port [5432]:
        Username [postgres]:
        Password for user postgres:
        psql (14.7)
        Type "help" for help.

        postgres=# CREATE DATABASE skypro;
        CREATE DATABASE
        postgres=# \c skypro;
        You are now connected to database "skypro" as user "postgres".
        skypro=# CREATE TABLE employee (
        skypro(# id BIGSERIAL NOT NULL PRIMARY KEY,
        skypro(# first_name VARCHAR(50) NOT NULL,
        skypro(# last_name VARCHAR(50) NOT NULL,
        skypro(# gender VARCHAR(6) NOT NULL,
        skypro(# age INT NOT NULL
        skypro(# );
        CREATE TABLE
        skypro=# INSERT INTO employee (
        skypro(# first_name, last_name, gender, age)
        skypro-# VALUES ('Ivan', 'Ivanov', 'mzh', 20);
        INSERT 0 1
        skypro=# INSERT INTO employee (
        skypro(# first_name, last_name, gender, age)
        skypro-# VALUES ('Eva', 'Romanova', 'zh', 18);
        INSERT 0 1
        skypro=# INSERT INTO employee (
        skypro(# first_name, last_name, gender, age)
        skypro-# VALUES ('Yulia', 'Morozova', 'zh', 19);
        INSERT 0 1
        skypro=# SELECT * FROM employee;
        id | first_name | last_name | gender | age
        ----+------------+-----------+--------+-----
        1 | Ivan       | Ivanov    | mzh    |  20
        2 | Eva        | Romanova  | zh     |  18
        3 | Yulia      | Morozova  | zh     |  19
        (3 rows)
        skypro=# UPDATE employee SET first_name = 'Yana', last_name = 'Petrova', gender = 'zh', age = 21 WHERE id = 2;
        UPDATE 1
        skypro=# SELECT * FROM employee;
        id | first_name | last_name | gender | age
        ----+------------+-----------+--------+-----
        1 | Ivan       | Ivanov    | mzh    |  20
        3 | Yulia      | Morozova  | zh     |  19
        2 | Yana       | Petrova   | zh     |  21
        (3 rows)

        skypro=# DELETE FROM employee WHERE id = 1;
        DELETE 1
        skypro=# SELECT * FROM employee;
        id | first_name | last_name | gender | age
        ----+------------+-----------+--------+-----
        3 | Yulia      | Morozova  | zh     |  19
        2 | Yana       | Petrova   | zh     |  21
        (2 rows)

        skypro=#
*/