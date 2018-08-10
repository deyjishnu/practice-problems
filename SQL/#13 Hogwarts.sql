/**
In this project, you’re going to make your own table with some small set of “famous people”,
then make more tables about things they do and join those to create nice human readable lists.
**/

/* Harry Potter Characters */
CREATE TABLE students (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, house TEXT, year INTEGER);

CREATE TABLE friends (id INTEGER PRIMARY KEY AUTOINCREMENT, friend1_id INTEGER, friend2_id INTEGER);

CREATE TABLE classes (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, year INTEGER);

CREATE TABLE professors (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT);

CREATE TABLE teaches (id INTEGER PRIMARY KEY AUTOINCREMENT, class_id INTEGER, professor_id INTEGER);

INSERT INTO students (name, house, year) VALUES ("Harry Potter", "Gryffindor", 4);
INSERT INTO students (name, house, year) VALUES ("Hermoine Granger", "Gryffindor", 4);
INSERT INTO students (name, house, year) VALUES ("Ronald Weasley", "Gryffindor", 4);
INSERT INTO students (name, house, year) VALUES ("Draco Malfoy", "Slytherin", 4);
INSERT INTO students (name, house, year) VALUES ("Luna Lovegood", "Ravenclaw", 3);

INSERT INTO friends (friend1_id, friend2_id) VALUES (1, 2);
INSERT INTO friends (friend1_id, friend2_id) VALUES (1, 3);
INSERT INTO friends (friend1_id, friend2_id) VALUES (1, 5);
INSERT INTO friends (friend1_id, friend2_id) VALUES (2, 3);

INSERT INTO classes (name, year) VALUES ("Defence against the Dark Arts", 4);
INSERT INTO classes (name, year) VALUES ("Potions", 4);
INSERT INTO classes (name, year) VALUES ("Transfiguration", 4);

INSERT INTO professors (name) VALUES ("Severus Snape");
INSERT INTO professors (name) VALUES ("Minerva McGonagall");
INSERT INTO professors (name) VALUES ("Remus Lupin");

INSERT INTO teaches (class_id, professor_id) VALUES (1, 3);
INSERT INTO teaches (class_id, professor_id) VALUES (2, 1);
INSERT INTO teaches (class_id, professor_id) VALUES (3, 2);

SELECT professors.name professors, classes.name classes
    FROM professors
    JOIN teaches
    ON professors.id = teaches.professor_id
    JOIN classes
    ON classes.id = teaches.class_id;

SELECT a.name students, b.name friends
    FROM students a
    JOIN friends
    ON a.id = friends.friend1_id
    JOIN students b
    ON b.id = friends.friend2_id;
