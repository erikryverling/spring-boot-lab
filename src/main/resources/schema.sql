CREATE TABLE IF NOT EXISTS coffees
(
    id   VARCHAR(60) PRIMARY KEY,
    name VARCHAR NOT NULL,
    roaster VARCHAR NOT NULL,
    origin VARCHAR NOT NULL
);