/* Домашнее задание Выборка данных и вложенные запросы
SELECT * FROM employee;

        INSERT INTO employee (first_name, last_name, gender, age)
        VALUES ('Ivan', 'Ivanov', 'mzh', 20);
        INSERT INTO employee (first_name, last_name, gender, age)
        VALUES ('Eva', 'Romanova', 'zh', 18);
        INSERT INTO employee (first_name, last_name, gender, age)
        VALUES ('Yulia', 'Morozova', 'zh', 19);
        INSERT INTO employee (first_name, last_name, gender, age)
        VALUES ('Yana', 'Petrova', 'mzh', 21);
        INSERT INTO employee (first_name, last_name, gender, age)
        VALUES ('Vadim', 'Smirnov', 'mzh', 24);

        SELECT first_name AS Имя, last_name AS Фамилия FROM employee;

        SELECT * FROM employee WHERE age < 30 OR age > 50;

        SELECT * FROM employee WHERE age BETWEEN 30 AND 50;

        SELECT * FROM employee ORDER BY last_name DESC;

        SELECT * FROM employee WHERE length(first_name) > 4;

        UPDATE employee SET first_name = 'Ivan' WHERE id = 5;
        UPDATE employee SET first_name = 'Yana' WHERE id = 2;

        SELECT first_name AS Имя, sum(age) AS Суммарный_возраст FROM employee GROUP BY first_name;

        SELECT first_name AS Имя, min(age) AS Юный_возраст FROM employee GROUP BY first_name;

        SELECT first_name AS Имя, max(age) AS max_age FROM employee GROUP BY first_name
        HAVING count(*) > 1 ORDER BY max_age;

 */
