/**
Create your own store! Your store should sell one type of things, like clothing or bikes, 
whatever you want your store to specialize in. You should have a table for all the items in your store, 
and at least 5 columns for the kind of data you think you'd need to store.
You should sell at least 15 items, and use select statements to order your items by price and
show at least one statistic about the items.
**/

/**
Creating a table for a smartphone store
**/
CREATE TABLE store (id INTEGER PRIMARY KEY, model TEXT, brand TEXT, operating_system TEXT, price INTEGER);

INSERT INTO store VALUES (1, "Pixel 2 XL", "Google", "Android", 55000);
INSERT INTO store VALUES (2, "iPhoneX", "Apple", "iOS", 87000);
INSERT INTO store VALUES (3, "Galaxy S9+", "Samsung", "Android", 62000);
INSERT INTO store VALUES (4, "Note 8", "Samsung", "Android", 56000);
INSERT INTO store VALUES (5, "iPhone 8 Plus", "Apple", "iOS", 74000);
INSERT INTO store VALUES (6, "OnePlus 6", "OnePlus", "Android", 35000);
INSERT INTO store VALUES (7, "Honor 10", "Huawei", "Android", 33000);
INSERT INTO store VALUES (8, "V30+", "LG", "Android", 44000);
INSERT INTO store VALUES (9, "Mix 2", "Mi", "Android", 28000);
INSERT INTO store VALUES (10, "Mi 3", "Mi", "Android", 10000);
INSERT INTO store VALUES (11, "P20 Pro", "Huawei", "Android", 65000);
INSERT INTO store VALUES (12, "S9", "Samsung", "Android", 67000);
INSERT INTO store VALUES (13, "Pixel XL", "Google", "Android", 39000);
INSERT INTO store VALUES (14, "Mi 8 Explorer Edition", "Mi", "Android", 40000);
INSERT INTO store VALUES (15, "A1", "Mi", "Android" , 14000);

SELECT * FROM store;
SELECT AVG(price) FROM store;
SELECT model, brand, operating_system, price FROM store ORDER BY price;
