CREATE DATABASE spring_practice;

use spring_practice;

CREATE TABLE  customer (
  id int(10) unsigned NOT NULL auto_increment,
  name varchar(45) collate latin1_general_ci NOT NULL,
  email varchar(45) collate latin1_general_ci NOT NULL,
  address int(10) unsigned NOT NULL,
  PRIMARY KEY  USING BTREE (id)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

show tables;