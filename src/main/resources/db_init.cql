CREATE KEYSPACE demo
WITH replication = {'class':'SimpleStrategy', 'replication_factor' : 1};

USE demo;

CREATE TABLE demo.book (
    isbn uuid PRIMARY KEY,
    publisher text,
    tags set<text>,
    title text
)