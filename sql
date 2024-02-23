CREATE TABLE signup (
    formID number PRIMARY KEY AUTO_INCREMENT COMMENT 'Primary key', create_time DATETIME COMMENT 'Create Time', name varchar2 (20), fatherName varchar2 (20), dob varchar2 (11), gneder varchar2 (6), email varchar2 (20), marital varchar(10), address varchar2 (50), city varchar(20), pincode number (6), state varchar(15)
) COMMENT "register table";

CREATE TABLE `banking`.`signup` (
    `applicantId` INT NOT NULL, `name` VARCHAR(20) NOT NULL, `fatherName` VARCHAR(20) NOT NULL, `dob` VARCHAR(11) NOT NULL, `gender` VARCHAR(6) NOT NULL, `email` VARCHAR(20) NOT NULL, `marital` VARCHAR(11) NOT NULL, `address` VARCHAR(50) NOT NULL, `city` VARCHAR(20) NOT NULL, `pincode` VARCHAR(6) NOT NULL, `state` VARCHAR(20) NOT NULL, PRIMARY KEY (`applicantId`)
) ENGINE = CSV COMMENT = 'signupdetails'