CREATE TABLE students
(
    student_id   INT PRIMARY KEY,
    student_name VARCHAR(100) NOT NULL
);

CREATE TABLE grades
(
    grade_id   INT PRIMARY KEY,
    student_id INT,
    subject    VARCHAR(50),
    grade      CHAR(2),
    FOREIGN KEY (student_id) REFERENCES students (student_id)
);

INSERT INTO students (student_id, student_name)
VALUES (1, 'Alice'),
       (2, 'Bob'),
       (3, 'Charlie');

INSERT INTO grades (grade_id, student_id, subject, grade)
VALUES (1, 1, 'Math', 'A'),
       (2, 1, 'Science', 'B'),
       (3, 2, 'Math', 'B');