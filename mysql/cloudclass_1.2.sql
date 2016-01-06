-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.6.25


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema cloudserver
--

CREATE DATABASE IF NOT EXISTS cloudserver;
USE cloudserver;

--
-- Definition of table `classinfo`
--

DROP TABLE IF EXISTS `classinfo`;
CREATE TABLE `classinfo` (
  `classinfo_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `classinfo_name` varchar(45) CHARACTER SET gbk NOT NULL,
  `classinfo_time` varchar(45) CHARACTER SET gbk NOT NULL,
  `classinfo_location` varchar(45) CHARACTER SET gbk NOT NULL,
  PRIMARY KEY (`classinfo_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `classinfo`
--

/*!40000 ALTER TABLE `classinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `classinfo` ENABLE KEYS */;


--
-- Definition of table `enrollment`
--

DROP TABLE IF EXISTS `enrollment`;
CREATE TABLE `enrollment` (
  `enrollment_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `student_id` int(10) unsigned NOT NULL,
  `classinfo_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`enrollment_id`,`student_id`,`classinfo_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `enrollment`
--

/*!40000 ALTER TABLE `enrollment` DISABLE KEYS */;
/*!40000 ALTER TABLE `enrollment` ENABLE KEYS */;


--
-- Definition of table `file`
--

DROP TABLE IF EXISTS `file`;
CREATE TABLE `file` (
  `file_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `classinfo_id` int(10) unsigned NOT NULL,
  `file_path` varchar(45) CHARACTER SET gbk NOT NULL,
  `file_name` varchar(45) CHARACTER SET gbk NOT NULL,
  `file_comment` varchar(45) CHARACTER SET gbk NOT NULL,
  PRIMARY KEY (`file_id`,`classinfo_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `file`
--

/*!40000 ALTER TABLE `file` DISABLE KEYS */;
/*!40000 ALTER TABLE `file` ENABLE KEYS */;


--
-- Definition of table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `student_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `student_name` varchar(20) CHARACTER SET gbk NOT NULL,
  `student_pwd` varchar(20) CHARACTER SET gbk NOT NULL,
  `student_gender` int(10) unsigned NOT NULL,
  `student_major` varchar(45) CHARACTER SET gbk NOT NULL,
  `student_photo` varchar(45) CHARACTER SET gbk NOT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `student`
--

/*!40000 ALTER TABLE `student` DISABLE KEYS */;
/*!40000 ALTER TABLE `student` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
