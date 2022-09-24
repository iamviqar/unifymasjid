-- MySQL dump 10.13  Distrib 5.6.42, for Win64 (x86_64)
--
-- Host: localhost    Database: masjid
-- ------------------------------------------------------
-- Server version	5.6.42-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `masjid_alias`
--

DROP TABLE IF EXISTS `masjid_alias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `masjid_alias` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(150) NOT NULL,
  `masjid_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `masjid_id` (`masjid_id`),
  CONSTRAINT `masjid_alias_ibfk_1` FOREIGN KEY (`masjid_id`) REFERENCES `masjids` (`masjid_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `masjid_alias`
--

LOCK TABLES `masjid_alias` WRITE;
/*!40000 ALTER TABLE `masjid_alias` DISABLE KEYS */;
INSERT INTO `masjid_alias` VALUES (1,'jhb',1),(2,'hello',7),(3,'hello',8),(4,'hello',9),(5,'hello',10),(6,'hello',11),(7,'hello',12),(8,'hello',13),(9,'hello',14);
/*!40000 ALTER TABLE `masjid_alias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `masjid_members`
--

DROP TABLE IF EXISTS `masjid_members`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `masjid_members` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(150) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `masjid_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `masjid_id` (`masjid_id`),
  CONSTRAINT `masjid_members_ibfk_1` FOREIGN KEY (`masjid_id`) REFERENCES `masjids` (`masjid_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `masjid_members`
--

LOCK TABLES `masjid_members` WRITE;
/*!40000 ALTER TABLE `masjid_members` DISABLE KEYS */;
INSERT INTO `masjid_members` VALUES (1,'kk','6645','jjh',1),(2,'mename','mephone','meemail',7),(3,'mename','mephone','meemail',8),(4,'mename','mephone','meemail',9),(5,'mename','mephone','meemail',10),(6,'mename','mephone','meemail',11),(7,'mename','mephone','meemail',12),(8,'mename','mephone','meemail',13),(9,'mename','mephone','meemail',14);
/*!40000 ALTER TABLE `masjid_members` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `masjids`
--

DROP TABLE IF EXISTS `masjids`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `masjids` (
  `masjid_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(150) NOT NULL,
  `address` varchar(250) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `area_code` varchar(20) NOT NULL,
  `username` varchar(50) NOT NULL,
  `contact_person_name` varchar(150) NOT NULL,
  `contact_person_phone` varchar(20) NOT NULL,
  `contact_person_email` varchar(50) NOT NULL,
  PRIMARY KEY (`masjid_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `masjids`
--

LOCK TABLES `masjids` WRITE;
/*!40000 ALTER TABLE `masjids` DISABLE KEYS */;
INSERT INTO `masjids` VALUES (1,'hi','hi','123','email','abc','xyz','cpname','cphone','cpemail'),(2,'hello','hi','123','email','abc','xyz','cpname','cphone','cpemail'),(3,'hello','hi','123','email','abc','xyz','cpname','cphone','cpemail'),(4,'hello','hi','123','email','abc','xyz','cpname','cphone','cpemail'),(5,'hello','hi','123','email','abc','xyz','cpname','cphone','cpemail'),(6,'hello','hi','123','email','abc','xyz','cpname','cphone','cpemail'),(7,'hello','hi','123','email','abc','xyz','cpname','cphone','cpemail'),(8,'hello','hi','123','email','abc','xyz','cpname','cphone','cpemail'),(9,'hello','hi','123','email','abc','xyz','cpname','cphone','cpemail'),(10,'hello','hi','123','email','abc','xyz','cpname','cphone','cpemail'),(11,'hello','hi','123','email','abc','xyz','cpname','cphone','cpemail'),(12,'hello','hi','123','email','abc','xyz','cpname','cphone','cpemail'),(13,'hello','hi','123','email','abc','xyz','cpname','cphone','cpemail'),(14,'hello','hi','123','email','abc','xyz','cpname','cphone','cpemail');
/*!40000 ALTER TABLE `masjids` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prayer_times`
--

DROP TABLE IF EXISTS `prayer_times`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `prayer_times` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(150) DEFAULT NULL,
  `call_time` time DEFAULT NULL,
  `prayer_time` time DEFAULT NULL,
  `masjid_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `masjid_id` (`masjid_id`),
  CONSTRAINT `prayer_times_ibfk_1` FOREIGN KEY (`masjid_id`) REFERENCES `masjids` (`masjid_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prayer_times`
--

LOCK TABLES `prayer_times` WRITE;
/*!40000 ALTER TABLE `prayer_times` DISABLE KEYS */;
INSERT INTO `prayer_times` VALUES (2,'jn','12:23:22','12:23:22',1),(3,'kk','12:23:22','12:23:22',3),(4,NULL,NULL,NULL,10),(5,NULL,NULL,NULL,11),(6,NULL,NULL,NULL,12),(7,'name','19:30:10','19:30:10',14);
/*!40000 ALTER TABLE `prayer_times` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'masjid'
--

--
-- Dumping routines for database 'masjid'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-24 12:10:25
