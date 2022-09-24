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
-- Dumping data for table `masjid_alias`
--

LOCK TABLES `masjid_alias` WRITE;
/*!40000 ALTER TABLE `masjid_alias` DISABLE KEYS */;
INSERT INTO `masjid_alias` VALUES (1,'jhb',1),(2,'hello',7),(3,'hello',8),(4,'hello',9),(5,'hello',10),(6,'hello',11),(7,'hello',12),(8,'hello',13),(9,'hello',14);
/*!40000 ALTER TABLE `masjid_alias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `masjid_members`
--

LOCK TABLES `masjid_members` WRITE;
/*!40000 ALTER TABLE `masjid_members` DISABLE KEYS */;
INSERT INTO `masjid_members` VALUES (1,'kk','6645','jjh',1),(2,'mename','mephone','meemail',7),(3,'mename','mephone','meemail',8),(4,'mename','mephone','meemail',9),(5,'mename','mephone','meemail',10),(6,'mename','mephone','meemail',11),(7,'mename','mephone','meemail',12),(8,'mename','mephone','meemail',13),(9,'mename','mephone','meemail',14);
/*!40000 ALTER TABLE `masjid_members` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `masjids`
--

LOCK TABLES `masjids` WRITE;
/*!40000 ALTER TABLE `masjids` DISABLE KEYS */;
INSERT INTO `masjids` VALUES (1,'hi','hi','123','email','abc','xyz','cpname','cphone','cpemail'),(2,'hello','hi','123','email','abc','xyz','cpname','cphone','cpemail'),(3,'hello','hi','123','email','abc','xyz','cpname','cphone','cpemail'),(4,'hello','hi','123','email','abc','xyz','cpname','cphone','cpemail'),(5,'hello','hi','123','email','abc','xyz','cpname','cphone','cpemail'),(6,'hello','hi','123','email','abc','xyz','cpname','cphone','cpemail'),(7,'hello','hi','123','email','abc','xyz','cpname','cphone','cpemail'),(8,'hello','hi','123','email','abc','xyz','cpname','cphone','cpemail'),(9,'hello','hi','123','email','abc','xyz','cpname','cphone','cpemail'),(10,'hello','hi','123','email','abc','xyz','cpname','cphone','cpemail'),(11,'hello','hi','123','email','abc','xyz','cpname','cphone','cpemail'),(12,'hello','hi','123','email','abc','xyz','cpname','cphone','cpemail'),(13,'hello','hi','123','email','abc','xyz','cpname','cphone','cpemail'),(14,'hello','hi','123','email','abc','xyz','cpname','cphone','cpemail');
/*!40000 ALTER TABLE `masjids` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `masjids_prayer_times`
--

LOCK TABLES `masjids_prayer_times` WRITE;
/*!40000 ALTER TABLE `masjids_prayer_times` DISABLE KEYS */;
/*!40000 ALTER TABLE `masjids_prayer_times` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `prayer_times`
--

LOCK TABLES `prayer_times` WRITE;
/*!40000 ALTER TABLE `prayer_times` DISABLE KEYS */;
INSERT INTO `prayer_times` VALUES (2,'jn','12:23:22','12:23:22',1,NULL,NULL),(3,'kk','12:23:22','12:23:22',3,NULL,NULL),(4,NULL,NULL,NULL,10,NULL,NULL),(5,NULL,NULL,NULL,11,NULL,NULL),(6,NULL,NULL,NULL,12,NULL,NULL),(7,'name','19:30:10','19:30:10',14,NULL,NULL);
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

-- Dump completed on 2022-09-24 12:01:27
