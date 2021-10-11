CREATE DATABASE  IF NOT EXISTS `employee_registry`;
USE `employee_registry`;
--
-- Table structure for table `employee`
--
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `job_title` varchar(45) DEFAULT NULL, 
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `employee` VALUES 
(1,'coder', 'Adam', 'Ingram', 'everett.ingram22@gmail.com')