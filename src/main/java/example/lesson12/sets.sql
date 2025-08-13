CREATE TABLE my_fruits
(
    fruit VARCHAR(100)
);

CREATE TABLE friend_fruits
(
    fruit VARCHAR(100)
);


INSERT INTO my_fruits (fruit)
VALUES
    ('apple'),
    ('banana'),
    ('orange'),
    ('apple');

INSERT INTO friend_fruits (fruit)
VALUES
    ('banana'),
    ('orange'),
    ('pear'),
    ('banana');