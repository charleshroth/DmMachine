CREATE TABLE cause(
    id          LONG PRIMARY KEY,
    name        VARCHAR(30),
    description VARCHAR(255),
    isKnown     BIT,
);