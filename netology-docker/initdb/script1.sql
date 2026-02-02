\connect study_db;

CREATE TABLE IF NOT EXISTS Student (
	email VARCHAR(80) PRIMARY KEY, 
	name VARCHAR(40) NOT NULL,
	password VARCHAR(128) NOT NULL
);
