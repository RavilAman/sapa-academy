CREATE TABLE employees
(
    id         INT PRIMARY KEY,
    name       VARCHAR(50),
    department VARCHAR(50)
);

INSERT INTO employees (id, name, department)
SELECT generate_series,
       'Name ' || generate_series,
       CASE
           WHEN random() < 0.5 THEN 'Sales'
           ELSE 'Engineering'
           END
FROM generate_series(1, 100000);


SELECT COUNT(*)
FROM employees
WHERE department = 'Sales';
