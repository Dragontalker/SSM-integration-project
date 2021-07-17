DROP DATABASE IF EXISTS ssm_crud;
CREATE DATABASE ssm_crud;
USE ssm_crud;

DROP TABLE IF EXISTS tbl_dept;
CREATE TABLE tbl_dept(
	`dept_id` INT PRIMARY KEY AUTO_INCREMENT,
    `dept_name` VARCHAR(255) NOT NULL
);

DROP TABLE IF EXISTS tbl_emp;
CREATE TABLE tbl_emp(
	`emp_id` INT PRIMARY KEY AUTO_INCREMENT,
    `emp_name` VARCHAR(255) NOT NULL,
    `gender` CHAR(1),
    `email` VARCHAR(255),
    `d_id` INT(11),
    CONSTRAINT FK_EMP_DEPT  FOREIGN KEY (`d_id`)
    REFERENCES tbl_dept(`dept_id`)
);


