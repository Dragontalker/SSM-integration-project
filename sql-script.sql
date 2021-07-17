DROP DATABASE IF EXISTS ssm_crud;
CREATE DATABASE ssm_crud;
USE ssm_crud;

DROP TABLE IF EXISTS tbl_emp;
CREATE TABLE tbl_emp(
	`emp_id` INT PRIMARY KEY AUTO_INCREMENT,
    `emp_name` VARCHAR(255) NOT NULL,
    `gender` CHAR(1),
    `email` VARCHAR(255)
);