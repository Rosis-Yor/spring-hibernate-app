CREATE DATABASE  IF NOT EXISTS customer_portrait ;
USE customer_portrait;

DROP TABLE IF EXISTS customer;

CREATE TABLE customer (
 id int(11) NOT NULL AUTO_INCREMENT,
  first_name varchar(45) DEFAULT NULL,
  last_name varchar(45) DEFAULT NULL,
  email varchar(45) DEFAULT NULL,
  PRIMARY KEY (id)
) ;


INSERT INTO customer VALUES (1,"David","Adams","david@coolschool.orc");
INSERT INTO customer VALUES	(2,"John","Doe","john@coolschool.orc"),
	(3,"Ajay","Rao","ajay@coolschool.orc"),
	(4,"Mary","Public","mary@coolschool.orc"),
	(5,"Maxwell","Dixon","max@luv2code.com");
    
update customer set email="max@coolschool.orc" where email = "max@luv2code.com";


