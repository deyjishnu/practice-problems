/**
What are your favorite books? You can make a database table to store them in!
**/

/**
Favorite Books:
Harry Potter (10)
A Brief History of Time (8)
Walking Disaster (8)
**/

-- In this first step, create a table to store your list of books.
-- It should have columns for id, name, and rating.
CREATE TABLE favorite_books (id INTEGER PRIMARY KEY, name TEXT, rating INTEGER);

-- Now, add three of your favorite books into the table.
INSERT INTO favorite_books VALUES (1, "Harry Potter", 10);
INSERT INTO favorite_books VALUES (2, "A Brief History of Time", 8);
INSERT INTO favorite_books VALUES(3, "Walking Disaster", 8);

SELECT * FROM favorite_books;
